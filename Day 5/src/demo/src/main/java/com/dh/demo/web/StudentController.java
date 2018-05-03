package com.dh.demo.web;

import com.dh.demo.domain.Student;
import com.dh.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jhonny on 6/10/17.
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addStudent(@RequestBody StudentRequestDTO student){
        studentService.addNewStudent(student);
    }

    public static class StudentRequestDTO{
        private String name;
        private Long ci;
        private Long codeSis;

        public String getName() {
            return name;
        }

        public Long getCi() {
            return ci;
        }

        public Long getCodeSis() {
            return codeSis;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCi(Long ci) {
            this.ci = ci;
        }

        public void setCodeSis(Long codeSis) {
            this.codeSis = codeSis;
        }
    }
}
