package com.example.alunos.sistemaglp.resources;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Toast;

import com.example.alunos.sistemaglp.config.ApiParams;
import com.example.alunos.sistemaglp.model.Login;
import com.example.alunos.sistemaglp.view.LobbyActivity;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class LoginResources {
    private static final String BASE_URL = ApiParams.getURL();
    private static final String URL = "perfil";
    private AsyncHttpClient client;
    private Login login;
    private Activity activity;
    private AlertDialog alertDialog;


    public LoginResources(Activity activity){
        this.activity = activity;
        alertDialog = (new AlertDialog.Builder(activity)).create();
        alertDialog.setTitle("Aguarde");
        alertDialog.setMessage("Carregando");
        alertDialog.setCanceledOnTouchOutside(false);
    }

    public void verificaLogin(String usuario, String senha){

        client = new AsyncHttpClient();
        RequestParams param = new RequestParams();
        param.add("login", usuario);
        param.add("senha", senha);
        client.post("http://192.168.0.12:8080/SistemaGlp/api/perfil", param, new AsyncHttpResponseHandler() {

            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {

                String resJSON = new String(bytes);

                Gson gson = new Gson();
               login = gson.fromJson(resJSON, Login.class);

                alertDialog.dismiss();
                if(login != null){
                    Intent it = new Intent(activity, LobbyActivity.class);
                    it.putExtra("user", login);
                    activity.startActivity(it);
                }
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                alertDialog.dismiss();
                Toast.makeText(activity, "Erro ao efetuar login", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
