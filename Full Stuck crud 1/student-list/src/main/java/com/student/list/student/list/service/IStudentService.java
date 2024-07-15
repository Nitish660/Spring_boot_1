package com.student.list.student.list.service;

import com.student.list.student.list.exception.StudentAlreadyExistsException;
import com.student.list.student.list.model.Student;

import java.util.List;

public interface IStudentService {

    Student addStudent(Student student) throws StudentAlreadyExistsException;

    List<Student> getStudents();


    Student updateStudent(Student student,Long id) ;

    void deleteStudent(Student student,Long id) ;


    Student getStudentById(int id) ;

}

