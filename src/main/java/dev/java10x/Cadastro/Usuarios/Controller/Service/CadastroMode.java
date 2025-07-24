package dev.java10x.Cadastro.Usuarios.Controller.Service;

import dev.java10x.Cadastro.Tarefas.TarefasMode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity ele transforma uma classe em uma entidade do banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CadastroMode{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    private String email;

    private int idade;

    // @ManyToOne um usuario tem uma unica tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id") // Foreing Key ou Chave estrangeira
    private TarefasMode tarefas;


}
