package com.example.demo.reposirtory;

import com.example.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query(value = "select c from Course c where c.company.id = :companyId")
    List<Course> getAllCourses(Long companyId);
}