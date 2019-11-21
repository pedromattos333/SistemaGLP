package com.example.alunos.sistemaglp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.RelatorioControl;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.loopj.android.http.AsyncHttpClient;

import java.util.ArrayList;

public class RelatorioPedidoActivity extends Activity {
    RelatorioControl control = new RelatorioControl();
    private ListView lvProduto;
    private ArrayList<RelatorioProduto> allist=new ArrayList<>();
    private AsyncHttpClient asyncHttpClient;
    private String MY_URL="http://192.168.0.12:8080/SistemaGlp/api/relatorioProduto";
    RelatorioProduto relatorioProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio_pedido);
        control = new RelatorioControl();

    }


}
