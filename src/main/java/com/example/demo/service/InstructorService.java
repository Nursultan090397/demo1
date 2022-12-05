package com.example.demo.service;

import com.example.demo.model.Instructor;

import java.io.IOException;
import java.util.List;

public interface InstructorService {
    List<Instructor> getInstructorList();
    List<Instructor> getAlInstructors(Long courseId);

    void addInstructor(Long id,Instructor instructor);

    Instructor getInstructorById(Long id);

    void updateInstructor(Instructor instructor, Long id);

    void deleteInstructor(Long id);

    void assignInstructor(Long courseId,Long instructorId) throws IOException;
}

