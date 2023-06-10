package com.raghab.student.dal.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghab.student.dal.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}