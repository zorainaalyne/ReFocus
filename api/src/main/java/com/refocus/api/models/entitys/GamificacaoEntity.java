@Entity
@Table(name = "gamificacao")
public class Gamificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idGamifica;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

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
