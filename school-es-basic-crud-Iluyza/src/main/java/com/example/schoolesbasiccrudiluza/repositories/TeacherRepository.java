package com.example.schoolesbasiccrudiluza.repositories;

import com.example.schoolesbasiccrudiluza.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
