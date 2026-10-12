package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.InfraRequestController;
import com.acmehealth.company.api.dto.RequestFormSummary;
import com.acmehealth.company.api.entity.request.RequestForm;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class RequestFormAssembler
    extends RepresentationModelAssemblerSupport<RequestForm, RequestFormSummary> {

  public RequestFormAssembler() {
    super(InfraRequestController.class, RequestFormSummary.class);
  }

  @Override
  public RequestFormSummary toModel(RequestForm requestForm) {
    return RequestFormSummary.from(requestForm);
  }
}
