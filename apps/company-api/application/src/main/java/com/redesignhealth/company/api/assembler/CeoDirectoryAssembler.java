package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.CeoController;
import com.acmehealth.company.api.dto.CeoSummary;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class CeoDirectoryAssembler
    extends RepresentationModelAssemblerSupport<CeoSummary, CeoSummary> {
  public CeoDirectoryAssembler() {
    super(CeoController.class, CeoSummary.class);
  }

  @Override
  public CeoSummary toModel(CeoSummary ceoSummary) {
    return ceoSummary;
  }
}
