package com.example.alunos.sistemaglp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.model.RelatorioPedido;


import java.util.ArrayList;

public class CustomAdapterPed extends BaseAdapter {
    ArrayList<RelatorioPedido> list;
    Context context;
    LayoutInflater inflater;

    public CustomAdapterPed(Context context, ArrayList<RelatorioPedido> list) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = new CustomAdapterPed.ViewHolder();
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.raw2, null);

             holder.Cliente = convertView.findViewById(R.id.tvCliente);
              holder.CNPJ = convertView.findViewById(R.id.tvCnpj);
              holder.PlacaDoVeiculo = convertView.findViewById(R.id.tvPlacaDoVeiculo);
              holder.NomeMotorista = convertView.findViewById(R.id.tvNomeMotorista);
              holder.DataPedido = convertView.findViewById(R.id.tvDataPedido);


           holder.Cliente.setText(list.get(position).getCliente());
           holder.CNPJ.setText(list.get(position).getCnpj());
           holder.PlacaDoVeiculo.setText(list.get(position).getPlacaDoVeiculo());
           holder.NomeMotorista.setText(list.get(position).getNomeMotorista());
           holder.DataPedido.setText(list.get(position).getDataPedido());


        } else {
            holder = (CustomAdapterPed.ViewHolder) convertView.getTag();

        }

        return convertView;
    }

    private class ViewHolder {
        TextView Cliente;
        TextView CNPJ;
        TextView PlacaDoVeiculo;
        TextView NomeMotorista;
        TextView DataPedido;

    }
}

