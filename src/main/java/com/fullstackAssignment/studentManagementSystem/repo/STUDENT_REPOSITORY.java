package com.fullstackAssignment.studentManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstackAssignment.studentManagementSystem.model.Student;

@Repository
public interface STUDENT_REPOSITORY extends JpaRepository<Student,Integer> {


}
