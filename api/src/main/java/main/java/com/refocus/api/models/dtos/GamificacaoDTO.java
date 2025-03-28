package main.java.com.refocus.api.models.dtos;

import java.time.LocalDateTime;

public class GamificacaoDTO {
    private String idGamifica;
    private Long usuarioId;
    private int nivel;
    private int pontos;
    private String badges;
    private int desafiosConcluidos;
    private LocalDateTime dataUltimaAtualizacao;

    public GamificacaoDTO(String idGamifica, Long usuarioId, int nivel, int pontos, String badges, int desafiosConcluidos, LocalDateTime dataUltimaAtualizacao) {
        this.idGamifica = idGamifica;
        this.usuarioId = usuarioId;
        this.nivel = nivel;
        this.pontos = pontos;
        this.badges = badges;
        this.desafiosConcluidos = desafiosConcluidos;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getIdGamifica() {
        return idGamifica;
    }

    public void setIdGamifica(String idGamifica) {
        this.idGamifica = idGamifica;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getBadges() {
        return badges;
    }

    public void setBadges(String badges) {
        this.badges = badges;
    }

    public int getDesafiosConcluidos() {
        return desafiosConcluidos;
    }

    public void setDesafiosConcluidos(int desafiosConcluidos) {
        this.desafiosConcluidos = desafiosConcluidos;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
    
}
