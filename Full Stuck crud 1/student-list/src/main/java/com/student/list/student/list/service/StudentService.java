package com.student.list.student.list.service;

import com.student.list.student.list.exception.StudentAlreadyExistsException;
import com.student.list.student.list.model.Student;
import com.student.list.student.list.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;



    @Override
    //post
    public Student addStudent(Student student) throws StudentAlreadyExistsException {
        if(studentAlreadyExists(student.getEmail())){
            throw new StudentAlreadyExistsException(student.getEmail() + "student already exist");
        }

        return studentRepository.save(student);
    }



    @Override
    //get all
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (!optionalStudent.isPresent()) {
            throw new IllegalArgumentException("Student not found");
        }

        Student existingStudent = optionalStudent.get();
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartment(student.getDepartment());

        return studentRepository.save(existingStudent);
    }


    @Override
    public void deleteStudent(Student student, Long id) {
        studentRepository.deleteById(id);


    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> student = Optional.ofNullable(studentRepository.findById((long) id));

        if (student.isEmpty()) {
            throw new IllegalArgumentException("Student not found");
        }

        return student.get();
    }


    private boolean studentAlreadyExists(String email) {
        return  studentRepository.findByEmail(email).isPresent();
    }
}
