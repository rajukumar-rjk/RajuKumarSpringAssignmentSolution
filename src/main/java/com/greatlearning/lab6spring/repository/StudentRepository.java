package com.greatlearning.lab6spring.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.lab6spring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}