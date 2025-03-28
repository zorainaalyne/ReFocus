package com.refocus.api.models.entitys;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "calendario")
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private Tarefa tarefa;

    @Column(name = "titulo", nullable = false, length = 255)
    private String titulo;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_inicio")
    private Date dataInicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_fim")
    private Date dataFim;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('pendente', 'confirmado', 'concluído', 'cancelado')")
    private Status status;

    @Column(name = "lembrete", nullable = false)
    private Boolean lembrete;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_evento", columnDefinition = "ENUM('reunião', 'prazo', 'descanso', 'outro')")
    private TipoEvento tipoEvento;

    public enum Status {
        PENDENTE, CONFIRMADO, CONCLUIDO, CANCELADO
    }

    public enum TipoEvento {
        REUNIAO, PRAZO, DESCANSO, OUTRO
    }

    // Getters and Setters
}
