package com.springs.SpringScenario.controller;

import com.springs.SpringScenario.entity.Student;
import com.springs.SpringScenario.service.StudentServiice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {

    @Autowired
    private StudentServiice studentServiice;

    //localhost:8080/api/v1/v2

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/v2")
    public ResponseEntity<Student> saveData(@RequestBody Student student){
        Student student1 = studentServiice.saveData(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }


    @GetMapping("/v3")
    public ResponseEntity<List<Student>> findAllData(){
        List<Student> allDatas = studentServiice.findAllDatas();

        return new ResponseEntity<>(allDatas,HttpStatus.FOUND);

    }

}
