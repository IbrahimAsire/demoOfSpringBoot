package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepoistory studentRepoistory;

    @Autowired
    public StudentService(StudentRepoistory studentRepoistory) {
        this.studentRepoistory = studentRepoistory;
    }

    public List<Student> getStudents() {
        return studentRepoistory.findAll();

    }
}
