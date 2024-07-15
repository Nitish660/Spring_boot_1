package com.student.list.student.list.controller;

import com.student.list.student.list.model.Student;
import com.student.list.student.list.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/students")
@ResponseBody
@AllArgsConstructor
@CrossOrigin("http://localhost:3000")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/get")
    public List<Student> getAllStudents() {
        return  studentService.getStudents();
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/post")
    public Student postStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/put/{id}")
    public Student putStudent(@RequestBody Student student,@PathVariable  Long id) {
        return studentService.updateStudent(student,id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {

    }


}
