package com.example.StudentDatabase.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.*;

@Service
public class StudentService implements StudentProtected {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "Mariam.jamal@gmail.com",
                        LocalDate.of(1994, APRIL,28),
                        21
                ),
                new Student(
                        2L,
                        "Michael",
                        "Michael.sean@gmail.com",
                        LocalDate.of(1990, SEPTEMBER,2),
                        25
                )
        );
    }
}
