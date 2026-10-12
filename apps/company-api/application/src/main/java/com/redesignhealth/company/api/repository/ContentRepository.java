package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.entity.library.LibraryContent;
import com.acmehealth.company.api.entity.ref.ContentRef;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository
    extends PagingAndSortingRepository<LibraryContent, Long>, CrudRepository<LibraryContent, Long> {
  Set<LibraryContent> findByApiIdIn(Collection<ContentRef> ids);

  Optional<LibraryContent> findByApiId(ContentRef apiId);

  boolean existsByApiId(ContentRef potential);

  Set<LibraryContent> findByPath(String hierarchyPath);

  Set<LibraryContent> findByPathStartsWith(String hierarchyPath);
}
