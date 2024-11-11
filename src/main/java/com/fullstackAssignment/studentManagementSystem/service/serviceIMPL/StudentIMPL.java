package com.fullstackAssignment.studentManagementSystem.service.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackAssignment.studentManagementSystem.model.Student;
import com.fullstackAssignment.studentManagementSystem.repo.STUDENT_REPOSITORY;
import com.fullstackAssignment.studentManagementSystem.service.STUDENT_SERVICE;

@Service
public class StudentIMPL implements STUDENT_SERVICE{

@Autowired
private STUDENT_REPOSITORY student_repository;

  @Override
  public void deleteStudent(int id) {
  System.out.println("dsds");
  student_repository.findById(id).orElseThrow(()->new RuntimeException());
  student_repository.deleteById(id);
  
  }

  @Override
  public List<Student> getAllStudent() {
  return student_repository.findAll();
  }
  // @Override
  // public String getAllStudent() {
  // return "hello";
  // }

@Override
  public Student getStudentByID(int id) {
Optional<Student> student=student_repository.findById(id);
if(student.isPresent()){
  return student.get();
}else{
  throw new RuntimeException();
}
  }

  @Override
  public Student saveStudent(Student student) {
    
    return student_repository.save(student);
  }

  @Override
  public Student updateStudent(Student student, int id) {
  Student existingStudent=student_repository.findById(id).orElseThrow(()->new RuntimeException());
  existingStudent.setFirstName(student.getFirstName());
  existingStudent.setLastName(student.getLastName());
  existingStudent.setEmail(student.getEmail());
  existingStudent.setDepartment(student.getDepartment());
  existingStudent.setYearOfEnrollment(student.getYearOfEnrollment());

  student_repository.save(existingStudent);
  return existingStudent;
  }



}
