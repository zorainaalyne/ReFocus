package com.refocus.api.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModoFocoDTO {

    private Long id;
    private Long usuarioId;
    private Boolean ativo;

    // Construtor vazio
    public ModoFocoDTO() {
    }

    // Construtor com todos os campos
    public ModoFocoDTO(Long id, Long usuarioId, Boolean ativo) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.ativo = ativo;
    }
}