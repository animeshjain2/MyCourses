package com.crud.MyCourse.controller;

import com.crud.MyCourse.model.Course;
import com.crud.MyCourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("saveCourse")
    public Course saveCourse(@Validated @RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("getAllCourses")
    public List<Course> getAllCourse(){
        return courseService.getAllCourses();
    }

    @GetMapping("getCourse/{id}")
    public Course getCourseById(@PathVariable(value = "id") long id){
        return courseService.getCourseById(id);
    }



}
