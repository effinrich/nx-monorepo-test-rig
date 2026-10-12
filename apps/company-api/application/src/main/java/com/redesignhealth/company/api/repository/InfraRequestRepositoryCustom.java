package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.ref.CompanyRef;
import com.acmehealth.company.api.entity.request.InfrastructureRequest;
import com.acmehealth.company.api.expansion.Expansion;
import java.util.Optional;

public interface InfraRequestRepositoryCustom {

  Optional<InfrastructureRequest> findByCompanyApiId(CompanyRef apiId, Expansion... expansions);
}
