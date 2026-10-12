package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.ref.Ref;

public interface RefRepository {

  boolean existsByApiId(Ref apiId);
}
