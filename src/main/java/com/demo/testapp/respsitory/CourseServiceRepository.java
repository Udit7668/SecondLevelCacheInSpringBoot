package com.demo.testapp.respsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.testapp.entities.Course;

@Repository
public interface CourseServiceRepository extends JpaRepository<Course,Long>{
    
}
