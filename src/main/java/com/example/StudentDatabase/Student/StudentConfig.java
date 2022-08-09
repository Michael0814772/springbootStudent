package com.example.StudentDatabase.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "Mariam.jamal@gmail.com",
                    LocalDate.of(1994, APRIL,28)
            );
            Student mic = new Student(
                    "Mic",
                    "mic@gmail.com",
                    LocalDate.of(2004, APRIL,28)
            );
            repository.saveAll(
                    List.of(mariam, mic)
            );
        };
    }
}
