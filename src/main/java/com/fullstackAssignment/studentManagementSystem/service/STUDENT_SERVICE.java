package com.fullstackAssignment.studentManagementSystem.service;

import java.util.List;

import com.fullstackAssignment.studentManagementSystem.model.Student;

public interface STUDENT_SERVICE {
Student saveStudent(Student student);
List<Student> getAllStudent();
Student getStudentByID(int id);
Student updateStudent(Student student,int id);
void deleteStudent(int id);
List<Student> getStudentsByEnrollmentYear(int year);
String findDepartmentNameByStudentId(int StudentID);
void deleteStudentsByYear(int year);

}
