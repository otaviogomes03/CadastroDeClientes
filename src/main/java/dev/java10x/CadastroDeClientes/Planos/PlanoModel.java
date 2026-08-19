package dev.java10x.CadastroDeClientes.Planos;

import dev.java10x.CadastroDeClientes.Clientes.ClienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_planos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nivel")
    private String nivel;

    @OneToMany(mappedBy = "plano")
    private List<ClienteModel> clientes;

}
