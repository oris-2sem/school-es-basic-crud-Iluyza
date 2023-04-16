package com.example.schoolesbasiccrudiluza.repositories;

import com.example.schoolesbasiccrudiluza.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
