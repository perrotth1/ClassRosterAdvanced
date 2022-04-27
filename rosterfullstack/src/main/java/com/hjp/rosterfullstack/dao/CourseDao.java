/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hjp.rosterfullstack.dao;

import com.hjp.rosterfullstack.entities.Course;
import com.hjp.rosterfullstack.entities.Student;
import com.hjp.rosterfullstack.entities.Teacher;
import java.util.List;

/**
 *
 * @author Henry
 */
public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);
    
    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
