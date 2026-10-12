package com.acmehealth.company.api.task;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.acmehealth.company.api.entity.TaskHistory;
import com.acmehealth.company.api.entity.ref.PersonRef;
import com.acmehealth.company.api.entity.ref.TaskRef;
import com.acmehealth.company.api.repository.PersonRepository;
import com.acmehealth.company.api.repository.TaskRepository;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SeedDbWithPeopleTaskTests {

  @Mock PersonRepository personRepository;

  @Mock TaskRepository taskRepository;
  SeedDbWithPeopleTask task;

  TaskHistory taskHistory = TaskHistory.from(TaskRef.of(SeedDbWithPeopleTask.class.getName()));

  private final PersonRef email = PersonRef.of("test@acmehealth.com");

  @Test
  void testRun_noEmailsProvided() {
    when(taskRepository.findByName(taskHistory.getName())).thenReturn(Optional.of(taskHistory));
    task = new SeedDbWithPeopleTask(taskRepository, personRepository, List.of());
    task.run();

    assertThat(taskHistory.hasRun()).isTrue();
    verify(personRepository, never()).save(any());
  }

  @Test
  void testRun_emailAlreadyExists() {
    when(personRepository.existsByEmail(email)).thenReturn(true);
    when(taskRepository.findByName(taskHistory.getName())).thenReturn(Optional.of(taskHistory));

    task = new SeedDbWithPeopleTask(taskRepository, personRepository, List.of(email.getEmail()));
    task.run();

    assertThat(taskHistory.hasRun()).isTrue();
    verify(personRepository, never()).save(any());
  }

  @Test
  void testRun_taskDNE() {
    when(taskRepository.findByName(taskHistory.getName())).thenReturn(Optional.of(taskHistory));

    task = new SeedDbWithPeopleTask(taskRepository, personRepository, List.of(email.getEmail()));
    task.run();

    assertThat(taskHistory.hasRun()).isTrue();
    verify(personRepository).save(any());
  }
}
