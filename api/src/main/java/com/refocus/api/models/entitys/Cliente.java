import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nivelcliente", nullable = false)
    private Integer nivelCliente;

    @Column(name = "status", nullable = false)
    private Boolean status;

    // Getters and Setters
}

