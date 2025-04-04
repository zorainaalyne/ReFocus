package com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.GamificacaoEntity;

@Repository
public interface GamificacaoRepository extends JpaRepository<GamificacaoEntity, String> {
    List<GamificacaoEntity> findByUsuarioId(Long usuarioId);
}
