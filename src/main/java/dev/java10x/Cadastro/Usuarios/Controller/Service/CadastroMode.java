package dev.java10x.Cadastro.Usuarios.Controller.Service;

import dev.java10x.Cadastro.Tarefas.TarefasMode;
import jakarta.persistence.*;

import java.util.List;

//Entity ele transforma uma classe em uma entidade do banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")

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

    public CadastroMode() {
    }

    public CadastroMode(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
