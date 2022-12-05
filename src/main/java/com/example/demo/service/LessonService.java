package com.example.demo.service;

import com.example.demo.model.Lesson;

import java.util.List;

public interface LessonService {
    List<Lesson> getAllLessons(Long courseId);

    void addLesson(Long id, Lesson lesson);

    Lesson getLessonById(Long id);

    void updateLesson(Lesson lesson, Long id);

    void deleteLesson(Long id);
}