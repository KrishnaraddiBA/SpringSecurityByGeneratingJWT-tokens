package com.springs.SpringScenario.service;

import com.springs.SpringScenario.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServiice {
    Student saveData(Student student);

    List<Student> findAllDatas();
}
