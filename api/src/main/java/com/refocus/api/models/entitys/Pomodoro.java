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
    private Usuario usuario;

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

