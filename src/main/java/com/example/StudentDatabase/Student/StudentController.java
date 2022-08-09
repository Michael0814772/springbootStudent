package com.example.StudentDatabase.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.*;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentProtected studentProtected;

    @Autowired
    public StudentController(StudentProtected studentProtected) {
        this.studentProtected = studentProtected;
    }

    @GetMapping
    public List<Student> getStudent() {
        return studentProtected.getStudent();
    }
}
