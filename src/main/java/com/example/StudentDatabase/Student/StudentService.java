package com.example.StudentDatabase.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static java.util.Calendar.*;

@Service
public class StudentService implements StudentProtected {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());

        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        boolean exist = studentRepository.existsById(id);

        if (!exist) {
            throw new IllegalStateException("Student id " + id + " does not exists");
        }
        studentRepository.deleteById(id);
    }
}
