package com.example.StudentDatabase.Student;

import java.util.List;

public interface StudentProtected {

    public List<Student> getStudent();

    public void addNewStudent(Student student);

    void deleteStudent(Long id);
}
