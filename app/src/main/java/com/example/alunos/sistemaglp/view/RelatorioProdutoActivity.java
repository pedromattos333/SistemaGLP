package com.example.alunos.sistemaglp.view;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class RelatorioProdutoActivity extends Activity {
  //  private RelatorioControl relatorioControl;

     ListView lvProduto;
     ArrayList<RelatorioProduto>allist;
     Activity activity;
     AsyncHttpClient asyncHttpClient;


      RelatorioProduto relatorioProduto;
    //private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio_produtolist);
        allist=new ArrayList<>();
        getData();
        lvProduto = (ListView) findViewById(R.id.lvProduto);
     //   relatorioControl = new RelatorioControl(this);
    }

    private void getData() {

        asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.setTimeout(5000);
        asyncHttpClient.get("http://10.10.164.105:8084/SistemaGlp/api/relatorioProduto", new AsyncHttpResponseHandler(){



            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {

                String resJSON = new String(bytes);
                Type tipoLista = new TypeToken<ArrayList<RelatorioProduto>>(){}.getType();

                Gson gson = new Gson();
                allist = gson.fromJson(resJSON, tipoLista);
                CustomAdapter adapter = new CustomAdapter(RelatorioProdutoActivity.this, allist);
                lvProduto.setAdapter(adapter);

                for(RelatorioProduto item : allist){
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
