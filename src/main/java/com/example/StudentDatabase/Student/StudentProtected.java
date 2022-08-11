package com.example.StudentDatabase.Student;

import java.util.List;

public interface StudentProtected {

    public List<Student> getStudent();

    public void addNewStudent(Student student);

    void deleteStudent(Long id);

    void updateStudent(Long studentId, String name, String email);
}
