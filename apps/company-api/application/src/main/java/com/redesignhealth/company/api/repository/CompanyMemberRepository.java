package com.acmehealth.company.api.repository;

import com.acmehealth.company.api.dto.enums.CompanyMemberStatus;
import com.acmehealth.company.api.entity.CompanyMember;
import com.acmehealth.company.api.entity.CompanyMemberId;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMemberRepository extends CrudRepository<CompanyMember, CompanyMemberId> {
  List<CompanyMember> findAllByStatusAndGoogleDriveFolderAccess(
      CompanyMemberStatus status, boolean googleDriveFolderAccess);
}
