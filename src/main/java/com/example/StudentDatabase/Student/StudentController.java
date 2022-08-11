package com.example.StudentDatabase.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentProtected.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) {
        studentProtected.deleteStudent(id);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentProtected.updateStudent(studentId, name, email);
    }
}
