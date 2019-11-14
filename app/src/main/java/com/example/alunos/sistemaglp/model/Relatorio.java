package com.example.alunos.sistemaglp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable(tableName = "relatorio")
public class Relatorio implements Serializable {
    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Long id;

    public Relatorio(){

    }

    public Relatorio(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
