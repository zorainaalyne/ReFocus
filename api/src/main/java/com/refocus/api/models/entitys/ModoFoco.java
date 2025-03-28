package com.refocus.api.models.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "ModoFoco")
public class ModoFoco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @Column(name = "tempoAtivo", columnDefinition = "INTERVAL")
    private String tempoAtivo;

    // Getters and Setters
}

