package dev.java10x.Cadastro;

import jakarta.persistence.*;

//Entity ele transforma uma classe em uma entidade do banco de dados
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")

public class CadastroMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String email;
    int idade;

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
