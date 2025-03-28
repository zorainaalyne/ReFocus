package main.java.com.refocus.api.models.entitys;

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
@Table(name = "Pomodoro")
public class Pomodoro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private Tarefa tarefa;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @Column(name = "duracao", nullable = false)
    private Integer duracao;

    @Column(name = "tempo_iniciado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tempoIniciado;

    @Column(name = "tempo_terminado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tempoTerminado;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('em andamento', 'finalizado', 'pausado')")
    private Status status;

    @Column(name = "intervalo_longo", nullable = false)
    private Integer intervaloLongo;

    public enum Status {
        EM_ANDAMENTO, FINALIZADO, PAUSADO
    }

    // Getters and Setters
}

