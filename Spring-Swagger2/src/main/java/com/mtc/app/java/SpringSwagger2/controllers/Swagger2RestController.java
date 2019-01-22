package com.mtc.app.java.SpringSwagger2.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.java.SpringSwagger2.models.Student;




@RestController
public class Swagger2RestController {
	List<Student> students = new ArrayList<Student>();
    {
        students.add(new Student("Anusha", "k", "kanusha@gmail.com"));
        students.add(new Student("kollu", "A", "kollu@gmail.com"));
        
    }
 
    @RequestMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }
 
    
}

