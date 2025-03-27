package main.java.com.refocus.api.models.entitys;

import java.io.Serializable;

import jacarta.persistence.Entity;
import jacarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable{

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = jacarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 160)
    private String nome;
    
    @Column(name = "email", nullable = false, length = 160)
    private String email;

    @Column(name = "senha", nullable = false, lenght = 160)
    private String senha;
}
