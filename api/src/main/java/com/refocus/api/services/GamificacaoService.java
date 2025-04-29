package com.refocus.api.services;

import com.refocus.api.models.entitys.GamificacaoEntity;
import com.refocus.api.models.repositorys.GamificacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GamificacaoService {

    @Autowired
    private GamificacaoRepository gamificacaoRepository;

    public GamificacaoEntity criarGamificacao(GamificacaoEntity gamificacao) {
        return gamificacaoRepository.save(gamificacao);
    }

    public Optional<GamificacaoEntity> buscarPorId(Long id) {
        return gamificacaoRepository.findById(id);
    }

    public GamificacaoEntity atualizarGamificacao(Long id, GamificacaoEntity gamificacaoAtualizada) {
        return gamificacaoRepository.findById(id).map(gamificacao -> {
            gamificacao.setNivel(gamificacaoAtualizada.getNivel());
            gamificacao.setPontos(gamificacaoAtualizada.getPontos());
            gamificacao.setBadges(gamificacaoAtualizada.getBadges());
            gamificacao.setDesafiosConcluidos(gamificacaoAtualizada.getDesafiosConcluidos());
            gamificacao.setDataUltimaAtualizacao(gamificacaoAtualizada.getDataUltimaAtualizacao());
            return gamificacaoRepository.save(gamificacao);
        }).orElseThrow(() -> new RuntimeException("Gamificação não encontrada"));
    }

    public void deletarGamificacao(Long id) {
        gamificacaoRepository.deleteById(id);
    }
}