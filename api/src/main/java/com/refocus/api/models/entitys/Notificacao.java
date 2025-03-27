@Entity
@Table(name = "notificacao")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

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
    private Tarefa tarefa;

    @ManyToOne
    @JoinColumn(name = "calendario_id")
    private Calendario calendario;

    public enum TipoNotificacao {
        LEMBRETE, ALERTA, MENSAGEM, ERRO, SUCESSO
    }

    public enum Status {
        PENDENTE, LIDA, IGNORADA
    }

    // Getters and Setters
}
