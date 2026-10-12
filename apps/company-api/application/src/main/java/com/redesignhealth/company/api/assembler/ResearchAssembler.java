package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.ResearchController;
import com.acmehealth.company.api.dto.ResearchSummary;
import com.acmehealth.company.api.entity.research.Research;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class ResearchAssembler
    extends RepresentationModelAssemblerSupport<Research, ResearchSummary> {
  public ResearchAssembler() {
    super(ResearchController.class, ResearchSummary.class);
  }

  @Override
  public ResearchSummary toModel(Research entity) {
    return ResearchSummary.from(entity);
  }
}
