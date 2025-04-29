package com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refocus.api.models.entitys.TarefaEntity;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {
    List<TarefaEntity> findByStatus(String status);
}
