package com.acmehealth.company.api.dto;

import com.acmehealth.company.api.entity.Company;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {
  private Company company;
  List<CompanyMemberDto> companyMembersDto;
}
