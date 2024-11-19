package com.xonlinex.todo_app_back.controllers;

import com.xonlinex.todo_app_back.models.Task;
import com.xonlinex.todo_app_back.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task) {
        return taskService.save(task);
    }

    @PostMapping("/delete/{taskId}")
    public String deleteTaskById(@RequestParam Long taskId) {
        return taskService.deleteTaskById(taskId);
    }

    @PostMapping("/update/{taskId}")
    public String updateTask(@RequestBody Task task, @RequestParam Long taskId) {
        return taskService.updateTask(task, taskId);
    }

}
