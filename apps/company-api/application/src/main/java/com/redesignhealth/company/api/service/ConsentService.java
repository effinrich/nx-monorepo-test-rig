package com.acmehealth.company.api.service;

import com.acmehealth.company.api.controller.ConsentCommand;
import com.acmehealth.company.api.entity.Consent;
import com.acmehealth.company.api.entity.Person;
import com.acmehealth.company.api.entity.ref.PersonRef;
import com.acmehealth.company.api.exception.ConsentNotFoundException;
import com.acmehealth.company.api.exception.PersonNotFoundException;
import com.acmehealth.company.api.repository.ConsentRepository;
import com.acmehealth.company.api.repository.PersonRepository;
import com.acmehealth.company.api.security.RedesignUserDetails;
import jakarta.transaction.Transactional;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class ConsentService {

  private final ConsentRepository consentRepository;
  private final PersonRepository personRepository;

  public ConsentService(ConsentRepository consentRepository, PersonRepository personRepository) {
    this.consentRepository = consentRepository;
    this.personRepository = personRepository;
  }

  @Transactional
  public Consent upsert(Consent.Type type, ConsentCommand command) {
    var person = getPrincipal();

    var consent = consentRepository.findByTypeAndPerson(type, person).orElse(Consent.of(type));

    consent.setVersion(command.getVersion());
    consent.setAccepted(command.getAccepted());
    consent.setPerson(person);
    return consentRepository.save(consent);
  }

  public Consent get(Consent.Type type) {
    return consentRepository
        .findByTypeAndPerson(type, getPrincipal())
        .orElseThrow(ConsentNotFoundException::new);
  }

  public Person getPrincipal() {
    var userDetails =
        (RedesignUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return personRepository
        .findByEmail(PersonRef.of(userDetails.getUsername()))
        .orElseThrow(PersonNotFoundException::new);
  }
}
