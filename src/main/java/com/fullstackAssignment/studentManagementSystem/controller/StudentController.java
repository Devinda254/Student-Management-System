package com.fullstackAssignment.studentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fullstackAssignment.studentManagementSystem.model.Student;
import com.fullstackAssignment.studentManagementSystem.service.STUDENT_SERVICE;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.CrossOrigin;



@RestController
@RequestMapping("api/v1/student")
// @CrossOrigin
public class StudentController {
@Autowired
private STUDENT_SERVICE student_service;

@PostMapping()
public ResponseEntity<Student> saveStudent(@RequestBody Student student){
return new ResponseEntity<Student>(student_service.saveStudent(student),HttpStatus.CREATED);
}

@GetMapping()
public List<Student> getAllStudent() {
    return student_service.getAllStudent();
}


@GetMapping("{id}")
public ResponseEntity<Student> getStudentBYId(@PathVariable("id") int StudentID) {
  return new ResponseEntity<Student>(student_service.getStudentByID(StudentID),HttpStatus.OK);
}


@PutMapping("{id}")
public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,@RequestBody Student student){
  return new ResponseEntity<Student>(student_service.updateStudent(student,id),HttpStatus.OK);
}

@DeleteMapping("{id}")
public ResponseEntity<String> deleteStudent(@PathVariable("id") int id){
student_service.deleteStudent(id);
return new ResponseEntity<String>("Student deleted successfully",HttpStatus.OK);
}

}



