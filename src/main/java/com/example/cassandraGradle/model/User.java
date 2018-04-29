package com.example.cassandraGradle.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@Table("users")
public class User implements Serializable{

    private int idade;
    @PrimaryKeyColumn(name = "email", type = PrimaryKeyType.PARTITIONED)
    private String email;
    private String nome;
    @PrimaryKeyColumn(name = "password", type = PrimaryKeyType.PARTITIONED)
    private String password;

    public User(int idade, String email, String nome, String password) {
        this.idade = idade;
        this.email = email;
        this.nome = nome;
        this.password = password;
    }

    public User() {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
