package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private  String name;
    private String email;
    private LocalDate dod;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dod = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dod, Integer age) {
        this.name = name;
        this.email = email;
        this.dod = dod;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDod() {
        return dod;
    }

    public void setDod(LocalDate dod) {
        this.dod = dod;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dod=" + dod +
                ", age=" + age +
                '}';
    }
}
