@Entity
@Table(name = "ModoFoco")
public class ModoFoco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private Usuario usuario;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @Column(name = "tempoAtivo", columnDefinition = "INTERVAL")
    private String tempoAtivo;

    // Getters and Setters
}

