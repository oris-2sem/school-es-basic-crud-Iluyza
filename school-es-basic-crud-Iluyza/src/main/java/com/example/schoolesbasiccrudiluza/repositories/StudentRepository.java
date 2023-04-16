package com.example.schoolesbasiccrudiluza.repositories;

import com.example.schoolesbasiccrudiluza.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
