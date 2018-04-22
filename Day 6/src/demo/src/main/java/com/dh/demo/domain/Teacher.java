package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by jhonny on 6/3/17.
 */
@Document
public class Teacher {
    @Id
    private String id;
    private String name;
    private long ci;
    private String prefession;

    public Teacher(){

    }

    public Teacher(String id, String name,
                   long ci, String profession){
        this.id = id;
        this.name = name;
        this.ci = ci;
        this.prefession = profession;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public void setPrefession(String prefession) {
        this.prefession = prefession;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCi() {
        return ci;
    }

    public String getPrefession() {
        return prefession;
    }
}
