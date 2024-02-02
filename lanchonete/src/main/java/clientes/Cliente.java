package clientes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Column(name= "Nome")
    private String nome;

    @Column(name= "Credito", nullable = false)
    private Double credito;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getNome() {
        return nome;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCredito() {
        return credito;
    }
}


