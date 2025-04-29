package com.refocus.api.models.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "gamificacao")
public class GamificacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gamifica")
    private Long idGamifica;

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
}