package com.acmehealth.company.api.entity.converter;

import com.acmehealth.company.api.entity.ref.SubcategoryRef;
import jakarta.persistence.AttributeConverter;

public class SubcategoryRefConverter implements AttributeConverter<SubcategoryRef, String> {
  @Override
  public String convertToDatabaseColumn(SubcategoryRef subcategoryRef) {
    return (subcategoryRef != null) ? subcategoryRef.value() : null;
  }

  @Override
  public SubcategoryRef convertToEntityAttribute(String apiId) {
    return (apiId != null) ? SubcategoryRef.of(apiId) : null;
  }
}
