package com.example.alunos.sistemaglp.view;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ListView;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.model.RelatorioProduto;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class RelatorioProdutoActivity extends Activity {
  //  private RelatorioControl relatorioControl;

     ListView lvProduto;
     ArrayList<RelatorioProduto>allist;
     Activity activity;
     AsyncHttpClient asyncHttpClient;
     String MY_URL="http://192.168.0.12:8080/SistemaGlp/api/relatorioProduto";
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
        asyncHttpClient.get("http://192.168.0.12:8080/SistemaGlp/api/relatorioProduto", new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                super.onSuccess(statusCode, headers, response);

                for (int i=0;i<response.length(); i++){
                    try {
                        JSONObject object = response.getJSONObject(i);
                        relatorioProduto = new RelatorioProduto(object.getString("Produto"),object.getString("Situacao"),object.getString("Marca"),object.getString("Quantidade"),object.getString("Data"));
                        allist.add(relatorioProduto);
                        CustomAdapter adapter = new CustomAdapter(RelatorioProdutoActivity.this,allist);
                        lvProduto.setAdapter(adapter);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }


            }
        });
    }
}
