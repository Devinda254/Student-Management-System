package com.fullstackAssignment.studentManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name="first_name",nullable = false)
  private String firstName;

  @Column(name="last_name",nullable = false)
  private String lastName;

  @Column(name="email",nullable = false,unique = true)
  private String email;

  @Column(name = "department",nullable = false)
  private String department;

  @Column(name = "year_of_enroll",nullable = false)
  private int yearOfEnrollment;


  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
  public int getYearOfEnrollment() {
    return yearOfEnrollment;
  }
  public void setYearOfEnrollment(int yearOfEnrollment) {
    this.yearOfEnrollment = yearOfEnrollment;
  }
 


  
}
