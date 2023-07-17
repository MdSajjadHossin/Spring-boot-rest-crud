package com.shossin.demo.rest;

import com.shossin.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    // define @PostConstructor to load the student data...only once!

    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Areyan", "Moyeen"));
        theStudents.add(new Student("Siam", "Ahmed"));
        theStudents.add(new Student("Muhit", "Hasna"));
        theStudents.add(new Student("Ayesha", "Noor"));
    }

    //define endpoint for "/student" - return a list of student

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    // define endpoint or "/stydents/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        // just index into the list.... keep it simple for now

        return theStudents.get(studentId);
    }
}
