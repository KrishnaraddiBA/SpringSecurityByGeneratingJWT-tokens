package com.springs.SpringScenario.service;

import com.springs.SpringScenario.entity.Student;
import com.springs.SpringScenario.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiice{

    @Autowired
    private StudentRepository studentRepo;


    @Override
    public Student saveData(Student student) {
        Student save = studentRepo.save(student);


        return save;
    }

    @Override
    public List<Student> findAllDatas() {

        List<Student> all = studentRepo.findAll();

        return all;
    }
}
