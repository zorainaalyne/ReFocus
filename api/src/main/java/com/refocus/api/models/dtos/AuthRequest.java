package com.refocus.api.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {
    private String nome; // Apenas para registro
    private String email;
    private String senha;
}