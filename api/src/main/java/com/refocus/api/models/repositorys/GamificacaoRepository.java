package com.refocus.api.models.repositorys;

import com.refocus.api.models.entitys.GamificacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamificacaoRepository extends JpaRepository<GamificacaoEntity, Long> {
    // Métodos personalizados, se necessário
}