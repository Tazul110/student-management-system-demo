package com.example.demo.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.sms.MainClasses.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
