@Entity
@Table(name = "calendario")
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

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
