package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.ExpertNoteController;
import com.acmehealth.company.api.dto.ExpertNoteSummary;
import com.acmehealth.company.api.entity.ExpertNote;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class ExpertNoteAssembler
    extends RepresentationModelAssemblerSupport<ExpertNote, ExpertNoteSummary> {
  public ExpertNoteAssembler() {
    super(ExpertNoteController.class, ExpertNoteSummary.class);
  }

  @Override
  public ExpertNoteSummary toModel(ExpertNote entity) {
    return ExpertNoteSummary.from(entity);
  }
}
