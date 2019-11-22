package com.example.alunos.sistemaglp.dao;

import android.content.Context;

import com.example.alunos.sistemaglp.dao.helpers.DaoHelper;
import com.example.alunos.sistemaglp.model.RelatorioPedido;

public class RelatorioPedidoDao extends DaoHelper<RelatorioPedido> {
    public RelatorioPedidoDao(Context c) {
        super(c, RelatorioPedido.class);
    }
}
