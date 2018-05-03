package com.dh.demo.repository;

import com.dh.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by jhonny on 6/3/17.
 */
public interface TeacherRepository extends MongoRepository<Teacher, String> {

    @Query("{name: ?0, ci:?1 }")
    Teacher getTeacherById(String name, String ci);
}
