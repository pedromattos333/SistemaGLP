package com.example.alunos.sistemaglp.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Date;

@DatabaseTable(tableName = "relatorioPedido")
public class RelatorioPedido implements Serializable {
    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Long id;
    @DatabaseField(canBeNull = false, width = 150)
    private String cliente;
    @DatabaseField(canBeNull = false, width = 150)
    private String cnpj;
    @DatabaseField(canBeNull = false, width = 150)
    private String placaDoVeiculo;
    @DatabaseField(canBeNull = false, width = 150)
    private String nomeMotorista;
    @DatabaseField(canBeNull = false)
    private Date dataPedido;

    public RelatorioPedido(){

    }

    public RelatorioPedido(Long id, String cliente, String cnpj, String placaDoVeiculo, String nomeMotorista, Date dataPedido) {
        this.id = id;
        this.cliente = cliente;
        this.cnpj = cnpj;
        this.placaDoVeiculo = placaDoVeiculo;
        this.nomeMotorista = nomeMotorista;
        this.dataPedido = dataPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente: " + getCliente() + "CNPJ: " + getCnpj() + "Placa do Veículo: " + getPlacaDoVeiculo() + "Motorista " + getNomeMotorista() + "Data" + getDataPedido();
    }
}
