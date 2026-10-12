package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.Ceo;
import com.acmehealth.company.api.entity.ref.CeoRef;
import com.acmehealth.company.api.entity.ref.PersonRef;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CeoRepository extends CrudRepository<Ceo, Long>, RefRepository {
  boolean existsCeoByEmail(PersonRef email);

  Optional<Ceo> findCeoByApiId(CeoRef apiId);
}
