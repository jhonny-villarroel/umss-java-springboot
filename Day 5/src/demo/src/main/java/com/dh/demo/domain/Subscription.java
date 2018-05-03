package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by jhonny on 6/10/17.
 */
@Document
public class Subscription {
    @Id
    private String id;
    @DBRef
    private Teacher teacher;
    @DBRef
    private Student student;
    private Date subDate;

    public void setId(String id) {
        this.id = id;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public String getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    public Date getSubDate() {
        return subDate;
    }
}
