package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.controller.TaskController;
import com.acmehealth.company.api.dto.TaskSummary;
import com.acmehealth.company.api.entity.TaskHistory;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

public class TaskAssembler extends RepresentationModelAssemblerSupport<TaskHistory, TaskSummary> {

  public TaskAssembler() {
    super(TaskController.class, TaskSummary.class);
  }

  @Override
  public TaskSummary toModel(TaskHistory entity) {
    return TaskSummary.from(entity);
  }
}
