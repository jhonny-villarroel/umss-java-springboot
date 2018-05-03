package com.dh.demo.service;

import com.dh.demo.domain.Teacher;
import com.dh.demo.repository.TeacherRepository;
import com.dh.demo.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhonny on 6/3/17.
 */
@Service
public class TeacherService {
    // Injection de dependenia
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        //TODO use repository
        /*
        List<Teacher> res = new ArrayList<>();

        res.add(new Teacher("jv", "Jhonny", 655555, "Ing Sistemas"));
        res.add(new Teacher("jv", "Gabo", 655555, "NONE"));
        res.add(new Teacher("jv", "Suuuu", 655555, "Ing Sistemas"));
        res.add(new Teacher("jv", "Andi", 655555, "Ing Sistemas"));
        */
        List<Teacher> res = teacherRepository.findAll();
        return res;
    }

    public void addTeacher(TeacherController.TeacherRequestDTO newTeacheDTO){
        //TODO add into Database
        Teacher newTeacher = new Teacher();
        newTeacher.setCi(newTeacheDTO.getCi());
        newTeacher.setName(newTeacheDTO.getName());
        newTeacher.setPrefession(newTeacheDTO.getPrefession());
        teacherRepository.save(newTeacher);
        // find one Teacher
        //teacherRepository.findOne(newTeache.getId());
        // delete teacher
        //teacherRepository.delete(newTeache);

        System.out.println("the Name of teacher is --->" + newTeacher.getName());
    }
}
