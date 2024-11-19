package com.xonlinex.todo_app_back.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xonlinex.todo_app_back.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
}
