package com.dh.demo.repository;

import com.dh.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jhonny on 6/10/17.
 */
public interface StudentRepository extends MongoRepository<Student, String> {
}
