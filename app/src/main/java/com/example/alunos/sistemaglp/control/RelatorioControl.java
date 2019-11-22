package com.example.alunos.sistemaglp.control;

import android.app.Activity;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alunos.sistemaglp.dao.RelatorioProdutoDao;
import com.example.alunos.sistemaglp.dao.helpers.ORMLiteHelper;
import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.example.alunos.sistemaglp.view.RelatorioPedidoActivity;
import com.example.alunos.sistemaglp.resources.RelatorioPedidoResource;
import com.example.alunos.sistemaglp.resources.RelatorioProdutoResource;
import com.example.alunos.sistemaglp.view.RelatorioProdutoActivity;

import java.util.ArrayList;

public class RelatorioControl {
    private Activity activity;
    ArrayList<RelatorioPedido> allist;
    ArrayList<RelatorioProduto>allistP;
    private RelatorioProdutoResource relatorioProdutoResource;
    private ORMLiteHelper helper;



    public RelatorioControl() {
    }

    public RelatorioControl(Activity activity) {
        this.activity = activity;
        this.helper = new ORMLiteHelper(activity);
        this.relatorioProdutoResource = new RelatorioProdutoResource(this.activity);

    }
//    public void manterRelatorioProduto(){
//        for(RelatorioProduto item : allistP){
//            RelatorioProdutoDao dao = new RelatorioProdutoDao().getRelatorioDao().create(item);
//        }
//
//    }
    public void entrarProduto(){
        Intent it = new Intent(activity, RelatorioProdutoActivity.class);
        activity.startActivity(it);

    }

    public void entrarPedido(){
        Intent it = new Intent(activity, RelatorioPedidoActivity.class);
        activity.startActivity(it);
    }
}
