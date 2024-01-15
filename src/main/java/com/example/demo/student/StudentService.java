package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(new Student(
                1L,
                "Sanket",
                "sanket.raut@gmail.com",
                LocalDate.of(1998, Month.DECEMBER,9),
                25
        ));
    }
}
