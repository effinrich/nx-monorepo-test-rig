package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.Category;
import com.acmehealth.company.api.entity.ref.CategoryRef;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository
    extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category>, RefRepository {
  boolean existsByApiId(CategoryRef apiId);

  Optional<Category> findCategoryByApiId(CategoryRef apiId);

  Optional<Category> findCategoryByName(String Name);
}
