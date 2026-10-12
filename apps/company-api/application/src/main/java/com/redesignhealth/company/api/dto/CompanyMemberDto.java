package com.acmehealth.company.api.dto;

import com.acmehealth.company.api.entity.CompanyMember;
import com.acmehealth.company.api.entity.Person;
import lombok.Value;

@Value
public class CompanyMemberDto {
  private Person person;
  private CompanyMember companyMember;
}
