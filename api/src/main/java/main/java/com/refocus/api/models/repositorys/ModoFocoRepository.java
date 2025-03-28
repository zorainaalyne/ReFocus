package main.java.com.refocus.api.models.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.refocus.api.models.entitys.ModoFoco;

@Repository
public interface ModoFocoRepository extends JpaRepository<ModoFoco, Long> {
    Optional<ModoFoco> findByUsuarioId(Long usuarioId);
}
