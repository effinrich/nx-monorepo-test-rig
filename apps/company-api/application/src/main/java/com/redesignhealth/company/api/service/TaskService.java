package com.acmehealth.company.api.service;

import com.acmehealth.company.api.entity.TaskHistory;
import com.acmehealth.company.api.entity.ref.TaskRef;
import com.acmehealth.company.api.exception.TaskNotFoundException;
import com.acmehealth.company.api.repository.TaskRepository;
import com.acmehealth.company.api.task.TaskDefinition;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ApplicationContextAware {

  private final TaskRepository taskRepository;
  private ApplicationContext context;

  public TaskService(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  public Page<TaskHistory> getTaskHistories(Pageable pageable) {
    return taskRepository.findAll(pageable);
  }

  public TaskHistory runTask(TaskRef name) {
    var task = taskRepository.findByName(name).orElseThrow(TaskNotFoundException::new);
    try {
      var taskDefinition = (TaskDefinition) context.getBean(Class.forName(task.getName().value()));
      taskDefinition.forceRunTask();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    return task;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.context = applicationContext;
  }
}
