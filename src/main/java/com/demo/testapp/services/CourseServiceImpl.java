package com.demo.testapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.testapp.entities.Course;
import com.demo.testapp.respsitory.CourseServiceRepository;

@Service
public class CourseServiceImpl implements CourseService{

    // List<Course> list;

    // public CourseServiceImpl(){
    //     list=new ArrayList<>();
    //     list.add(new Course(111,"Java Courses","THis course contains java course for 2 months"));
    //     list.add(new Course(121,"Spring boot","This contains spring boot course my course"));
    // }

    // @Override
    // public List<Course> getCourses() {
       
    //     return list;
    // }

    // @Override
    // public Course getCourse(Long courseId) {
    //    Course course=null;
    //    for(Course c:list){
    //     if(c.getId()==courseId){
    //         course=c;
    //         break;
    //     }
    //    }
    //    return course;
    // }

    // @Override
    // public Course addCourse(Course course) {
    //     list.add(course);
    //     return course;
    // }

    // @Override
    // public Course updateCourse(Course course) {
    //    for(Course c:list){
    //     if(course.getId()==c.getId()){
    //         c.setTitle(course.getTitle());
    //         c.setDescription(course.getDescription());
    //     }
    //    }
    
    //     return course;
    // }

    // @Override
    // public void deleteCourse(long id) {
    //   this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
    // }


    @Autowired
   private CourseServiceRepository courseServiceRepository;


    @Override
    public List<Course> getCourses() {
       List<Course> courses=this.courseServiceRepository.findAll();
       return courses;
    }

    @Override
    public Course getCourse(Long courseId) {
      Course course=this.courseServiceRepository.findById(courseId).get();
       return course;
    }

    @Override
    public Course addCourse(Course course) {
        Course c=this.courseServiceRepository.save(course);
        return c;
    }

    @Override
    public Course updateCourse(Course course) {
         this.courseServiceRepository.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long id) {
      this.courseServiceRepository.deleteById(id);
    }
    
}
