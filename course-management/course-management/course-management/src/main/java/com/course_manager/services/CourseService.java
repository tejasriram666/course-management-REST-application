package com.course_manager.services;

import com.course_manager.entities.Course;

import java.util.List;

public interface CourseService {

    //Create
    Course addCourse(Course course);

    //Read
    public List<Course> getCourses();

    Course getCourse(long id);

    //Update

    Course updateCourse(Course course);

    //DElete

    void deleteCourse(long id);






}
