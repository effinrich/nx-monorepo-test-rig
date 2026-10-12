package com.acmehealth.company.api.service;

import com.acmehealth.company.api.dto.command.FormDefinitionCommand;
import com.acmehealth.company.api.entity.FormDefinition;
import com.acmehealth.company.api.exception.FormDefinitionNotFoundException;
import com.acmehealth.company.api.exception.InvalidFieldException;
import com.acmehealth.company.api.repository.FormDefinitionRepository;
import com.acmehealth.company.api.util.JsonSchemaUtils;
import org.springframework.stereotype.Service;

@Service
public class FormDefinitionService {
  private final FormDefinitionRepository formDefinitionRepository;

  public FormDefinitionService(FormDefinitionRepository formDefinitionRepository) {
    this.formDefinitionRepository = formDefinitionRepository;
  }

  public FormDefinition get(FormDefinition.Type type) {
    return formDefinitionRepository
        .findByType(type)
        .orElseThrow(FormDefinitionNotFoundException::new);
  }

  public FormDefinition upsert(FormDefinition.Type type, FormDefinitionCommand command) {
    var metaSchema = JsonSchemaUtils.getMetaSchema();
    var errors = metaSchema.validate(command.getSchema());
    if (!errors.isEmpty()) {
      throw new InvalidFieldException(JsonSchemaUtils.convertErrors(errors, "schema"));
    }
    var definition = formDefinitionRepository.findByType(type).orElse(FormDefinition.of(type));
    definition.setSchema(command.getSchema());
    return formDefinitionRepository.save(definition);
  }
}
