package com.acmehealth.company.api.client.search.entity;

import com.acmehealth.company.api.dto.SerializableEnum;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class FilterOptions {
  private List<Term> terms;
  private String field;

  public <T extends SerializableEnum> void updateTermDisplayName(T[] values) {
    for (Term term : this.terms) {
      term.setDisplayName(SerializableEnum.fromValue(values, term.getKeyword()).getDisplayName());
    }
  }
}
