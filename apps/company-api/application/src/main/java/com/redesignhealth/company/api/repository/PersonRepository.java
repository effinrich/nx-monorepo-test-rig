package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.Person;
import com.acmehealth.company.api.entity.ref.PersonRef;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>, PersonRepositoryCustom {

  boolean existsByEmail(PersonRef email);
}
