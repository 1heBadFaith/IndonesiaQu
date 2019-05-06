package com.azhardevelop.example.com.indonesiaqu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class DetailSeniAdapter extends RecyclerView.Adapter <DetailSeniAdapter.SeniHolder>{

    private String[] judlSeni ={
            "Batik", "Tenun","Senandung Jolo", "Reog"
    };

    private String[] asalSeni ={
            "Indonesia", "Indonesia", "Jambi", "Ponorogo"
    };

    private int gambarSeni[] = {
            R.drawable.batik, R.drawable.tenun, R.drawable.senandungjolo, R.drawable.reog
    };

    private String[] detailSeni = {
            "Batik adalah budaya Indonesia","Tenun adalah budaya Indonesia"
            ,"Senandung Jolo adalah Budaya Jambi", "Reog adalah Budaya Ponorogo"
    };

    private String[] sejarahSeni = {
            "", "", "", ""
    };

    private String[] asalusulSeni ={
            "", "", "", ""
    };

    LayoutInflater inflater;
    Context context;

    public DetailSeniAdapter(MenuActivity activity) {
        this.context = activity;
        inflater = inflater.from(activity);
    }

    @NonNull
    @Override
    public SeniHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.itemqu, viewGroup, false);
        SeniHolder holder = new SeniHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeniHolder seniHolder, final int i) {
        seniHolder.judulSeni.setText(judlSeni[i]);
        seniHolder.imgSeni.setImageResource(gambarSeni[i]);
        seniHolder.subJudulSeni2.setText(asalSeni[i]);

        seniHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dataBudaya = new Intent(context, DetailBudayaActivity.class);
                dataBudaya.putExtra("JudulSni", judlSeni[i]);
                dataBudaya.putExtra("GambarSni", gambarSeni[i]);
                dataBudaya.putExtra("DetailSni", detailSeni[i]);
                dataBudaya.putExtra("AsalSni", asalusulSeni[i]);
                dataBudaya.putExtra("SejarahSni", sejarahSeni[i]);
                context.startActivity(dataBudaya);
            }
        });
    }


    @Override
    public int getItemCount() {
        return judlSeni.length;
    }

    public class SeniHolder extends RecyclerView.ViewHolder {

        private ImageView imgSeni;
        private TextView judulSeni, subJudulSeni2;

        public SeniHolder(@NonNull View itemView) {
            super(itemView);
            imgSeni = itemView.findViewById(R.id.imgItem);
            judulSeni = itemView.findViewById(R.id.judul);
            subJudulSeni2 = itemView.findViewById(R.id.asal);
        }
    }
}
