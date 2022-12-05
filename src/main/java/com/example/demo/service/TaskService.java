package com.example.demo.service;

import com.example.demo.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks(Long lessonId);

    void addTask(Long id, Task task);

    Task getTaskById(Long id);

    void updateTask(Task task, Long id);

    void deleteTask(Long id);
}