package com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.PomodoroEntity;

@Repository

public interface PomodoroRepository extends JpaRepository<PomodoroEntity, Long> {
     List<PomodoroEntity> findByUsuarioId(Long usuarioId);
    List<PomodoroEntity> findByStatus(String status);
}
