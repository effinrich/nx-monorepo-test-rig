package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.ResearchArticleController;
import com.acmehealth.company.api.dto.ResearchArticleSummary;
import com.acmehealth.company.api.entity.ResearchArticle;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class ResearchArticleAssembler
    extends RepresentationModelAssemblerSupport<ResearchArticle, ResearchArticleSummary> {
  public ResearchArticleAssembler() {
    super(ResearchArticleController.class, ResearchArticleSummary.class);
  }

  public ResearchArticleSummary toModel(ResearchArticle researchArticle) {
    return ResearchArticleSummary.from(researchArticle);
  }
}
