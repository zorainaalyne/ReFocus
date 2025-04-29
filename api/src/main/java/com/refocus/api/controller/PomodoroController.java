package com.refocus.api.controller;

import com.refocus.api.models.entitys.PomodoroEntity;
import com.refocus.api.services.PomodoroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pomodoro")
public class PomodoroController {

    @Autowired
    private PomodoroServices pomodoroService;

    // Endpoint para listar todas as sessões de pomodoro
    @GetMapping
    public ResponseEntity<List<PomodoroEntity>> getAllPomodoros() {
        List<PomodoroEntity> pomodoros = pomodoroService.getAllPomodoros();
        return ResponseEntity.ok(pomodoros);
    }

    // Endpoint para buscar uma sessão de pomodoro por ID
    @GetMapping("/{id}")
    public ResponseEntity<PomodoroEntity> getPomodoroById(@PathVariable Long id) {
        PomodoroEntity pomodoro = pomodoroService.getPomodoroById(id);
        return ResponseEntity.ok(pomodoro);
    }

    // Endpoint para criar uma nova sessão de pomodoro
    @PostMapping
    public ResponseEntity<PomodoroEntity> createPomodoro(@RequestBody PomodoroEntity pomodoro) {
        PomodoroEntity createdPomodoro = pomodoroService.createPomodoro(pomodoro);
        return ResponseEntity.ok(createdPomodoro);
    }

    // Endpoint para atualizar uma sessão de pomodoro
    @PutMapping("/{id}")
    public ResponseEntity<PomodoroEntity> updatePomodoro(@PathVariable Long id, @RequestBody PomodoroEntity pomodoro) {
        PomodoroEntity updatedPomodoro = pomodoroService.updatePomodoro(id, pomodoro);
        return ResponseEntity.ok(updatedPomodoro);
    }

    // Endpoint para deletar uma sessão de pomodoro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePomodoro(@PathVariable Long id) {
        pomodoroService.deletePomodoro(id);
        return ResponseEntity.noContent().build();
    }
}