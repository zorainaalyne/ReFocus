package com.refocus.api.models.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PomodoroDTO {

    private Long id;
    private Long usuarioId;
    private Integer duracao; // Duração do pomodoro em minutos
    private Integer pausas; // Número de pausas realizadas
    private LocalDateTime inicio; // Data e hora de início
    private LocalDateTime fim; // Data e hora de término

    // Construtor vazio
    public PomodoroDTO() {
    }

    // Construtor com todos os campos
    public PomodoroDTO(Long id, Long usuarioId, Integer duracao, Integer pausas, LocalDateTime inicio, LocalDateTime fim) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.duracao = duracao;
        this.pausas = pausas;
        this.inicio = inicio;
        this.fim = fim;
    }
}