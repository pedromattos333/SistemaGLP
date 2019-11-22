package com.example.alunos.sistemaglp.resources;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.Toast;

import com.example.alunos.sistemaglp.config.ApiParams;
import com.example.alunos.sistemaglp.model.RelatorioPedido;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class RelatorioPedidoResource {
    private static final String BASE_URL = ApiParams.getURL();
    private static final String URL = "relatorio";
    private AsyncHttpClient client;
    private RelatorioPedido relatorio;
    private Activity activity;
    private AlertDialog alertDialog;

    public RelatorioPedidoResource(Activity activity){
        this.activity = activity;
        alertDialog = (new AlertDialog.Builder(activity)).create();
        alertDialog.setTitle("Aguarde");
        alertDialog.setMessage("Carregando");
        alertDialog.setCanceledOnTouchOutside(false);
    }

    }




