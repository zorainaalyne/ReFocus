package com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.Calendario;
import com.refocus.api.services.CalendarioEntity;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
    List<Calendario> findByUsuarioId(Long usuarioId);
    List<Calendario> findByStatus(String status);
    CalendarioEntity save(CalendarioEntity calendario);
}
