package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.request.InfrastructureRequest;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface InfraRequestRepository
    extends CrudRepository<InfrastructureRequest, Long>, InfraRequestRepositoryCustom {
  Optional<InfrastructureRequest> findByJiraIssueId(String jiraIssueId);
}
