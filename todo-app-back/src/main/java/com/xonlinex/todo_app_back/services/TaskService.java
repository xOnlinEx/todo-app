package com.xonlinex.todo_app_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.xonlinex.todo_app_back.models.Task;
import com.xonlinex.todo_app_back.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {

  private final TaskRepository taskRepository;

  public List<Task> findAll(){
    return taskRepository.findAll();
  }

  public Task save(Task task) {
    return taskRepository.save(task);
  }

  public String deleteTaskById(Long taskId) {
    taskRepository.deleteById(taskId);

    return String.format("task with id %s deleted", taskId);
  }

  public String updateTask(Task task, Long taskId) {
    Optional<Task> taskDB = taskRepository.findById(taskId);

    if (taskDB.isEmpty()) {
      throw new RuntimeException(String.format("task with id %s not found", taskId));
    }

    taskRepository.save(Task.builder()
        .task(task.getTask())
        .build());

    return String.format("task with id %s deleted", taskId);
  }

}
