package com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.Pomodoro;

@Repository

public interface PomodoroRepository extends JpaRepository<Pomodoro, Long> {
     List<Pomodoro> findByUsuarioId(Long usuarioId);
    List<Pomodoro> findByStatus(String status);
}
