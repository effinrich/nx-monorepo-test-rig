package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.FormDefinition;
import com.acmehealth.company.api.entity.request.InfrastructureRequest;
import com.acmehealth.company.api.entity.request.RequestForm;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestFormRepository
    extends PagingAndSortingRepository<RequestForm, Long>, CrudRepository<RequestForm, Long> {
  Optional<RequestForm> findByInfrastructureRequestAndType(
      InfrastructureRequest infraRequest, FormDefinition.Type type);
}
