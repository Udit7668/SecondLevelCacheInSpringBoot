package com.demo.testapp.services;

import java.util.List;

import com.demo.testapp.entities.Course;

public interface CourseService {
    
    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(long id);
}


