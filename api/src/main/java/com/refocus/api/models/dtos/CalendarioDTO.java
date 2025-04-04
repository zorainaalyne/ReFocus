package com.refocus.api.models.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalendarioDTO {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;

    public CalendarioDTO() {
    }

    public CalendarioDTO(Long id, String titulo, String descricao, LocalDateTime dataInicio, LocalDateTime dataFim) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}