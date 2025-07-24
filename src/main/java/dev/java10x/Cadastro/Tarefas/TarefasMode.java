package dev.java10x.Cadastro.Tarefas;

import dev.java10x.Cadastro.Usuarios.Controller.Service.CadastroMode;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
public class TarefasMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeObjetivos;

    private String nivel;

    private CadastroMode cadastro;

    //OneToMany - Uma tarefa pode ter varios usuarios
    @OneToMany(mappedBy = "tarefas")
    private List<CadastroMode> cadastros;

}
