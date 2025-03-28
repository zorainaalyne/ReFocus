package main.java.com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.refocus.api.models.entitys.Calendario;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
    List<Calendario> findByUsuarioId(Long usuarioId);
    List<Calendario> findByStatus(String status);
}
