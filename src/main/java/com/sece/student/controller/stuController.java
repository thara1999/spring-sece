package com.sece.student.controller;

import com.sece.student.entity.Studententity;
import com.sece.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class stuController {

    @Autowired
    private StudentRepository studentRepository;

    // Save student to database
    @PostMapping
    public Studententity addStudent(@RequestBody Studententity student) {
        return studentRepository.save(student);
    }

    // Get all students
    @GetMapping
    public List<Studententity> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Studententity getStudentById(@PathVariable int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @GetMapping("/hello")
    public String hello() {
        return "welcome to spring class";
    }
}