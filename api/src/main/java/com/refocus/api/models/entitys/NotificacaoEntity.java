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
@Table(name = "notificacao")
public class NotificacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_notificacao", nullable = false, columnDefinition = "ENUM('lembrete', 'alerta', 'mensagem', 'erro', 'sucesso')")
    private TipoNotificacao tipoNotificacao;

    @Column(name = "mensagem", columnDefinition = "TEXT", nullable = false)
    private String mensagem;

    @Column(name = "data_criacao", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "data_visualizada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVisualizada;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('pendente', 'lida', 'ignorada')")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private TarefaEntity tarefa;

    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private CalendarioEntity calendario;

    public enum TipoNotificacao {
        LEMBRETE, ALERTA, MENSAGEM, ERRO, SUCESSO
    }

    public enum Status {
        PENDENTE, LIDA, IGNORADA
    }

    // Getters and Setters
}
