package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.CompanyController;
import com.acmehealth.company.api.dto.CompanyMemberDto;
import com.acmehealth.company.api.dto.CompanyMemberSummary;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

public class CompanyMemberAssembler
    extends RepresentationModelAssemblerSupport<CompanyMemberDto, CompanyMemberSummary> {
  public CompanyMemberAssembler() {
    super(CompanyController.class, CompanyMemberSummary.class);
  }

  @Override
  public CompanyMemberSummary toModel(CompanyMemberDto companyMemberDto) {
    return CompanyMemberSummary.from(companyMemberDto).add(createSelfRel(companyMemberDto));
  }

  private Link createSelfRel(CompanyMemberDto companyMemberDto) {
    return WebMvcLinkBuilder.linkTo(this.getControllerClass())
        .slash(companyMemberDto.getPerson().getEmail())
        .withSelfRel();
  }
}
