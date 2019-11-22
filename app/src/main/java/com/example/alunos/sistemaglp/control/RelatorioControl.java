package com.example.alunos.sistemaglp.control;

import android.app.Activity;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alunos.sistemaglp.dao.RelatorioProdutoDao;
import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.example.alunos.sistemaglp.view.RelatorioPedidoActivity;
import com.example.alunos.sistemaglp.resources.RelatorioPedidoResource;
import com.example.alunos.sistemaglp.resources.RelatorioProdutoResource;
import com.example.alunos.sistemaglp.view.RelatorioProdutoActivity;

public class RelatorioControl {
    private Activity activity;
    private RelatorioProdutoResource relatorioProdutoResource;
    private MyORMLiteHelper helper;
    private RelatorioProdutoDao relatorioOrmDao;
    private RelatorioProdutoDao relatorioDao;
    private RelatorioPedidoResource relatorioPedidoResource;
    private ListView lvProduto;
    private ListView lvPedido;
    private ArrayAdapter<RelatorioPedido> adapterRelatorioProduto;
    private ArrayAdapter<RelatorioPedido> adapterRelatorioPedido;


    public RelatorioControl() {
    }

    public RelatorioControl(Activity activity) {
        this.activity = activity;
        this.helper = new MyORMLiteHelper(activity);
        this.relatorioOrmDao = new RelatorioProdutoDao(this.helper);
        this.relatorioProdutoResource = new RelatorioProdutoResource(this.activity);
        this.relatorioPedidoResource = new RelatorioPedidoResource(this.activity);
    }

    private void configurarListView(){
        montarListView();
    }

    private void montarListView() {

        }


    public void onAttach(Activity activity){
        this.activity = activity;
    }

    public void entrarProduto(){
        Intent it = new Intent(activity, RelatorioProdutoActivity.class);
        activity.startActivity(it);

    }

    public void entrarPedido(){
        Intent it = new Intent(activity, RelatorioPedidoActivity.class);
        activity.startActivity(it);
    }
}
