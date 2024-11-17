package com.fullstackAssignment.studentManagementSystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fullstackAssignment.studentManagementSystem.model.Student;

@Repository
public interface STUDENT_REPOSITORY extends JpaRepository<Student,Integer> {

     List<Student> findByYearOfEnrollment(int yearOfEnrollment);

     @Query("SELECT s.department FROM Student s WHERE s.id = :studentId")
     String findDepartmentNameByStudentId(@Param("studentId") int studentId);

@Modifying
@Query("DELETE FROM Student s WHERE s.yearOfEnrollment = :year")
void deleteByYearOfEnrollment(@Param("year") int yearOfEnrollment);


}
