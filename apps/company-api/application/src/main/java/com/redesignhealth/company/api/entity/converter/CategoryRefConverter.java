package com.acmehealth.company.api.entity.converter;

import com.acmehealth.company.api.entity.ref.CategoryRef;
import jakarta.persistence.AttributeConverter;

public class CategoryRefConverter implements AttributeConverter<CategoryRef, String> {
  @Override
  public String convertToDatabaseColumn(CategoryRef categoryRef) {
    return (categoryRef != null) ? categoryRef.value() : null;
  }

  @Override
  public CategoryRef convertToEntityAttribute(String apiId) {
    return (apiId != null) ? CategoryRef.of(apiId) : null;
  }
}
