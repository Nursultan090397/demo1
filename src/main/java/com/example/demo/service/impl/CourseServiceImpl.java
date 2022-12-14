package com.example.demo.service.impl;

import com.example.demo.model.Company;
import com.example.demo.model.Course;
import com.example.demo.reposirtory.CompanyRepository;
import com.example.demo.reposirtory.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final CompanyRepository companyRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository, CompanyRepository companyRepository) {
        this.courseRepository = courseRepository;
        this.companyRepository = companyRepository;
    }



    @Override
    public List<Course> getAllCourses(Long id) {
        return courseRepository.getAllCourses(id);
    }

    @Override
    public void addCourse(Long id, Course course)  {
        Company company = companyRepository.getById(id);
        company.addCourse(course);
        course.setCompany(company);
        courseRepository.save(course);

    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.getById(id);
    }

    @Override
    public void updateCourse(Course course, Long id) {
        Course course1 = courseRepository.getById(id);
        course1.setCourseName(course.getCourseName());
        course1.setDuration(course.getDuration());
        course1.setDescription(course.getDescription());
        courseRepository.save(course1);

    }

    @Override
    public void deleteCourse(Long id) {
        Course course = courseRepository.getById(id);
        courseRepository.delete(course);

    }
}