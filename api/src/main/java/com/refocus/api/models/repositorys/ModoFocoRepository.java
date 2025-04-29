package com.refocus.api.models.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.ModoFocoEntity;

@Repository
public interface ModoFocoRepository extends JpaRepository<ModoFocoEntity, Long> {
    Optional<ModoFocoEntity> findByUsuarioId(Long usuarioId);
}
