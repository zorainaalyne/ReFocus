package com.refocus.api.controller;

import com.refocus.api.models.entitys.GamificacaoEntity;
import com.refocus.api.services.GamificacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/gamificacao")
public class GamificacaoController {

    @Autowired
    private GamificacaoService gamificacaoService;

    @PostMapping
    public ResponseEntity<GamificacaoEntity> criarGamificacao(@RequestBody GamificacaoEntity gamificacao) {
        return ResponseEntity.ok(gamificacaoService.criarGamificacao(gamificacao));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GamificacaoEntity> buscarPorId(@PathVariable Long id) {
        Optional<GamificacaoEntity> gamificacao = gamificacaoService.buscarPorId(id);
        return gamificacao.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<GamificacaoEntity> atualizarGamificacao(@PathVariable Long id, @RequestBody GamificacaoEntity gamificacaoAtualizada) {
        return ResponseEntity.ok(gamificacaoService.atualizarGamificacao(id, gamificacaoAtualizada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGamificacao(@PathVariable Long id) {
        gamificacaoService.deletarGamificacao(id);
        return ResponseEntity.noContent().build();
    }
}