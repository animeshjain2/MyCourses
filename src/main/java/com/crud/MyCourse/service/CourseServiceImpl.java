package com.crud.MyCourse.service;

import com.crud.MyCourse.model.Course;
import com.crud.MyCourse.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        Course course = null;

        if(optionalCourse.isPresent()){
            course = optionalCourse.get();
        }
        else{
            throw new RuntimeException("Course not found for id : "+id);
        }

        return course;
    }

    @Override
    public void deleteCourseById(long id) {
        courseRepository.deleteById(id);
    }
}
