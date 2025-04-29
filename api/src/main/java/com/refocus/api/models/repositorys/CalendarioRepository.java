package com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.CalendarioEntity;
import com.refocus.api.services.calendarioservices;

@Repository
public interface CalendarioRepository extends JpaRepository<CalendarioEntity, Long> {
    List<CalendarioEntity> findByUsuarioId(Long usuarioId);
    List<CalendarioEntity> findByStatus(String status);
    calendarioservices save(calendarioservices calendario);
}
