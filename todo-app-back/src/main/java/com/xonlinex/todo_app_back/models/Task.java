package com.xonlinex.todo_app_back.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class Task {

  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String task;
  
}
