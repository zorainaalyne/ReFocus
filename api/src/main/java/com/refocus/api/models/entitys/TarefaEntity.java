package com.refocus.api.models.entitys;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "Tarefa")
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_inicio")
    private Date dataInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_fim")
    private Date dataFim;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "criado_em", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;

    @Column(name = "atualizado_em")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm;

    // Getters and Setters
}
