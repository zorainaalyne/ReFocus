package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.GamificacaoEntity;
import com.refocus.api.models.repositorys.GamificacaoRepository;

@Service
public class GamificacaoServices {

    @Autowired
    private GamificacaoRepository gamificacaoRepo;

    /**
     * Cria um novo registro de gamificação.
     * 
     * @param gamificacao Dados da gamificação a serem salvos.
     * @return GamificacaoEntity Registro salvo.
     */
    public GamificacaoEntity createGamificacao(GamificacaoEntity gamificacao) {
        return gamificacaoRepo.save(gamificacao);
    }

    /**
     * Busca todos os registros de gamificação.
     * 
     * @return Lista de registros de gamificação.
     */
    public List<GamificacaoEntity> findAllGamificacoes() {
        return gamificacaoRepo.findAll();
    }

    /**
     * Busca um registro de gamificação pelo ID.
     * 
     * @param id ID do registro.
     * @return Optional contendo o registro, se encontrado.
     */
    public Optional<GamificacaoEntity> findGamificacaoById(String id) {
        return gamificacaoRepo.findById(id);
    }

    /**
     * Atualiza os dados de um registro de gamificação existente.
     * 
     * @param id           ID do registro a ser atualizado.
     * @param gamificacao  Dados atualizados da gamificação.
     * @return GamificacaoEntity Registro atualizado.
     */
    public GamificacaoEntity updateGamificacao(String id, GamificacaoEntity gamificacao) {
        if (gamificacaoRepo.existsById(id)) {
            gamificacao.setIdGamifica(id); // Garante que o ID seja mantido
            return gamificacaoRepo.save(gamificacao);
        } else {
            throw new IllegalArgumentException("Registro de gamificação com o ID fornecido não existe.");
        }
    }

    /**
     * Remove um registro de gamificação pelo ID.
     * 
     * @param id ID do registro a ser removido.
     */
    public void deleteGamificacaoById(String id) {
        if (gamificacaoRepo.existsById(id)) {
            gamificacaoRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Registro de gamificação com o ID fornecido não existe.");
        }
    }
}