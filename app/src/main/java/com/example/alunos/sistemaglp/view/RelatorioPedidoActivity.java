package com.example.alunos.sistemaglp.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.control.RelatorioControl;
import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class RelatorioPedidoActivity extends Activity {

    ListView lvPedido;
    ArrayList<RelatorioPedido>allist;
    AsyncHttpClient asyncHttpClient;
    AlertDialog alertDialog;
    Activity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio_pedido);
        allist=new ArrayList<>();
        getData();
        lvPedido = (ListView) findViewById(R.id.lvProduto);

    }



    private void getData() {

        asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get("http://192.168.0.12:8080/SistemaGlp/api/relatorioPedido", new AsyncHttpResponseHandler(){


            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {

                String resJSON = new String(bytes);
                Type tipoLista = new TypeToken<ArrayList<RelatorioPedido>>(){}.getType();

                Gson gson = new Gson();
                allist = gson.fromJson(resJSON, tipoLista);
                CustomAdapterPed adapter = new CustomAdapterPed(RelatorioPedidoActivity.this, allist);
                lvPedido.setAdapter(adapter);

                for(RelatorioPedido item : allist){
                    //RelatorioProdutoDao dao = new RelatorioProdutoDao().getRelatorioDao().create(item);
                }

            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                Toast.makeText(activity, "Erro ao carregar relatorios", Toast.LENGTH_SHORT).show();
            }

        });
    }
}




