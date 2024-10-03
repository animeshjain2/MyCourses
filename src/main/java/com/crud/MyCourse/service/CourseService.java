package com.crud.MyCourse.service;

import com.crud.MyCourse.model.Course;
import org.hibernate.query.Page;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();
    Course saveCourse(Course course);
    Course getCourseById(long id);
    void deleteCourseById(long id);


}
