package com.example.alunos.sistemaglp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "relatorioProduto")
public class RelatorioProduto {
    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Long id;
    @DatabaseField(canBeNull = false, width = 150)
    private String produto;
    @DatabaseField(canBeNull = false, width = 150)
    private String situacao;
    @DatabaseField(canBeNull = false, width = 150)
    private String marca;
    @DatabaseField(canBeNull = false, width = 150)
    private double quantidade;
    @DatabaseField(canBeNull = false)
    private Date  data;

    public RelatorioProduto() {

    }

    public RelatorioProduto(Long id, String produto, String situacao, String marca, double quantidade, Date data) {
        this.id = id;
        this.produto = produto;
        this.situacao = situacao;
        this.marca = marca;
        this.quantidade = quantidade;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
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
        return "Produto: " + getProduto() + "Situacao: " + getSituacao() + "Marca: " + getMarca() + "Quantidade " + getQuantidade() + "Data" + getData();
    }

}
