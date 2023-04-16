package com.example.schoolesbasiccrudiluza.repositories;

import com.example.schoolesbasiccrudiluza.models.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<Timetable, Long> {
}
