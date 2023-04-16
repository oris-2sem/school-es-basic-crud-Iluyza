package com.example.schoolesbasiccrudiluza.repositories;

import com.example.schoolesbasiccrudiluza.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
