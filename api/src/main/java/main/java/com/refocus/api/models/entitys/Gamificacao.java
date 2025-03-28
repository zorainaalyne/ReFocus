package main.java.com.refocus.api.models.entitys;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "gamificacao")
public class Gamificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idGamifica;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "nivel", nullable = false)
    private Integer nivel;

    @Column(name = "pontos", nullable = false)
    private Integer pontos;

    @Column(name = "badges", length = 255)
    private String badges;

    @Column(name = "desafios_concluidos", nullable = false)
    private Integer desafiosConcluidos;

    @Column(name = "data_ultima_atualizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimaAtualizacao;

    // Getters and Setters
}
