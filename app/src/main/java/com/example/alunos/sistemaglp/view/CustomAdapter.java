package com.example.alunos.sistemaglp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alunos.sistemaglp.R;
import com.example.alunos.sistemaglp.model.RelatorioProduto;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class CustomAdapter extends BaseAdapter {
    ArrayList<RelatorioProduto> list;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context context, ArrayList<RelatorioProduto> list) {
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
        ViewHolder holder = new ViewHolder();
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.raw, null);
            holder.Produto = convertView.findViewById(R.id.tvProduto);

            holder.Situacao = convertView.findViewById(R.id.tvSituacao);
            holder.Marca = convertView.findViewById(R.id.tvMarca);
            holder.Quantidade = convertView.findViewById(R.id.tvQuantidade);
            holder.Data = convertView.findViewById(R.id.tvData);

            holder.Produto.setText(list.get(position).getProduto());
            holder.Situacao.setText(list.get(position).getSituacao());
            holder.Marca.setText(list.get(position).getMarca());
            holder.Quantidade.setText(list.get(position).getQuantidade());
            holder.Data.setText(list.get(position).getData());

        } else {
            holder = (ViewHolder) convertView.getTag();

        }

        return convertView;
    }

    private class ViewHolder {
        TextView Produto;
        TextView Situacao;
        TextView Marca;
        TextView Quantidade;
        TextView Data;
    }
}

