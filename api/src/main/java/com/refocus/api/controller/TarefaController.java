package com.refocus.api.controller;

import com.refocus.api.models.entitys.TarefaEntity;
import com.refocus.api.services.TarefaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaServices tarefaService;

    // Endpoint para listar todas as tarefas
    @GetMapping
    public ResponseEntity<List<TarefaEntity>> getAllTarefas() {
        List<TarefaEntity> tarefas = tarefaService.findAllTarefas();
        return ResponseEntity.ok(tarefas);
    }

    // Endpoint para buscar uma tarefa por ID
    @GetMapping("/{id}")
    public ResponseEntity<TarefaEntity> getTarefaById(@PathVariable Long id) {
        TarefaEntity tarefa = tarefaService.getTarefaById(id);
        return ResponseEntity.ok(tarefa);
    }

    // Endpoint para criar uma nova tarefa
    @PostMapping
    public ResponseEntity<TarefaEntity> createTarefa(@RequestBody TarefaEntity tarefa) {
        TarefaEntity createdTarefa = tarefaService.createTarefa(tarefa);
        return ResponseEntity.ok(createdTarefa);
    }

    // Endpoint para atualizar uma tarefa existente
    @PutMapping("/{id}")
    public ResponseEntity<TarefaEntity> updateTarefa(@PathVariable Long id, @RequestBody TarefaEntity tarefa) {
        TarefaEntity updatedTarefa = tarefaService.updateTarefa(id, tarefa);
        return ResponseEntity.ok(updatedTarefa);
    }

    // Endpoint para deletar uma tarefa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteTarefa(id);
        return ResponseEntity.noContent().build();
    }
}