package com.example.alunos.sistemaglp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
@DatabaseTable(tableName = "login")
public class Login implements Serializable {
    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Long id;
    @DatabaseField(canBeNull = false, width = 150)
    private String login;
    @DatabaseField(canBeNull = false, width = 150)
    private String senha;

    public Login() {
    }

    public Login(Long id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login: " + getLogin() + "Senha: " + getSenha();
    }
}

