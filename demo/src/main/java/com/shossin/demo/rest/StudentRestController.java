package com.shossin.demo.rest;

import com.shossin.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    //define endpoint for "/student" - return a list of student

    @GetMapping("/student")
    public List<Student> getStudents(){

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Areyan", "Moyeen"));
        theStudents.add(new Student("Siam", "Ahmed"));
        theStudents.add(new Student("Muhit", "Hasna"));
        theStudents.add(new Student("Ayesha", "Noor"));

        return theStudents;
    }
} 
