package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.ref.ResearchRef;
import com.acmehealth.company.api.entity.research.Research;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchRepository extends CrudRepository<Research, Long>, RefRepository {
  List<Research> findByApiIdIsNull();

  Optional<Research> findByApiId(ResearchRef apiId);
}
