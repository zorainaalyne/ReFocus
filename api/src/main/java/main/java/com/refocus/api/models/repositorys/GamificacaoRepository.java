package main.java.com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.refocus.api.models.entitys.Gamificacao;

@Repository
public interface GamificacaoRepository extends JpaRepository<Gamificacao, String> {
    List<Gamificacao> findByUsuarioId(Long usuarioId);
}
