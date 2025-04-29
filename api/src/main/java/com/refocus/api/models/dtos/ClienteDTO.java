package com.refocus.api.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {

    private Long id;
    private Integer nivelCliente;
    private Boolean status;

    // Construtor vazio
    public ClienteDTO() {
    }

    // Construtor com todos os campos
    public ClienteDTO(Long id, Integer nivelCliente, Boolean status) {
        this.id = id;
        this.nivelCliente = nivelCliente;
        this.status = status;
    }
}
