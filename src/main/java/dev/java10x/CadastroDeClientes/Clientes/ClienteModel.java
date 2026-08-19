package dev.java10x.CadastroDeClientes.Clientes;

import dev.java10x.CadastroDeClientes.Planos.PlanoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "planos_id")
    private PlanoModel plano;
}
