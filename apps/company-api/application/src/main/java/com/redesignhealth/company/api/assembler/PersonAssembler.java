package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.PersonController;
import com.acmehealth.company.api.dto.PersonSummary;
import com.acmehealth.company.api.entity.Person;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class PersonAssembler extends RepresentationModelAssemblerSupport<Person, PersonSummary> {

  public PersonAssembler() {
    super(PersonController.class, PersonSummary.class);
  }

  @Override
  public PersonSummary toModel(Person person) {
    return PersonSummary.from(person).add(createSelfRel(person));
  }

  private Link createSelfRel(Person person) {
    return WebMvcLinkBuilder.linkTo(this.getControllerClass())
        .slash(person.getEmail())
        .withSelfRel();
  }
}
