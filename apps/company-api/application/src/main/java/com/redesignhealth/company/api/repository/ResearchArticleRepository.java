package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.ResearchArticle;
import org.springframework.data.repository.CrudRepository;

public interface ResearchArticleRepository
    extends CrudRepository<ResearchArticle, Long>, RefRepository {}
