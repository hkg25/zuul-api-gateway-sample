package com.example.springboostudentservice;
 
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
 
@RestController
@SpringBootApplication
public class SpringBootStudentServiceApplication
{
    @RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name)
    {
        return "hello  <strong style=\"color: red;\">" + name + " </strong> Responsed on : " + new Date();
    }
 
    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name)
    {
        return new Student(name, "Gurgaon", "MBA");
    }
 
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootStudentServiceApplication.class, args);
    }
}
 
