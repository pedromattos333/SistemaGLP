package com.example.alunos.sistemaglp.dao;

import android.content.Context;

import com.example.alunos.sistemaglp.dao.helpers.DaoHelper;
import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.google.gson.TypeAdapterFactory;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

public class RelatorioProdutoDao extends DaoHelper<RelatorioProduto> {
    public RelatorioProdutoDao (Context c){super(c, RelatorioProduto.class);}





}


