package com.example.alunos.sistemaglp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "relatorioProduto")
public class RelatorioProduto {
    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Long id;
    @DatabaseField(canBeNull = false, width = 200)
    private String marca;
    @DatabaseField(canBeNull = false, width = 200)
    private String nomeProduto;
    @DatabaseField(canBeNull = false, width = 200)
    private String situacao;
    @DatabaseField(canBeNull = false, width = 200)
    private String quantidade;
    @DatabaseField(canBeNull = false, width = 200)
    private Date  data;

    public RelatorioProduto() {

    }

    public RelatorioProduto(String nomeProduto, String situacao, String marca, String quantidade) {
        this.marca = marca;
        this.nomeProduto = nomeProduto;
        this.situacao = situacao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Nome: " + getNomeProduto() + "Situacao: " + getSituacao() + "Marca: " + getMarca() + "Quantidade " + getQuantidade();
    }

}
