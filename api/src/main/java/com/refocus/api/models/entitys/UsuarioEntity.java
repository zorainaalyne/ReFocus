package com.refocus.api.models.entitys;

import java.io.Serializable;

import com.refocus.api.models.dtos.UsuarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable{

    public UsuarioEntity(UsuarioDTO user) {
        //TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 160)
    private String nome;
    
    @Column(name = "email", nullable = false, length = 160)
    private String email;

    @Column(name = "senha", nullable = false, length = 160)
    private String senha;
}
