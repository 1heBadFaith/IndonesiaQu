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

class DetailSejarahAdapter extends RecyclerView.Adapter <DetailSejarahAdapter.SejarahHolder>{

    private String[] judlSejarah ={
        "Kemerdekaan Indonesia", "Ibu Kartini", "G30S PKI", "BOMAT LAH"
    };

    private String[] subJdlSejarah ={
            "Kapan Indonesia Merdeka Yuk Baca!!", "Siapa Tak Kenal Ibu Kartini ? Yuk Baca Sini",
            "Kenapa PKI di Benci ? Yuk Baca Sejarahnya", "Tau Bodo Amat"
    };

    private int[] gambarSejarah ={
            R.drawable.merdeka, R.drawable.kartini, R.drawable.pki, R.drawable.bomat
    };

    private String[] detailSejarah ={
            "Merdeka 1947", "Raden Anjeng Kartini", "PKI harus Mati", "GK Tau lah"
    };


    private String[] pelajaran = {
            "", "", "", "Bodddo Ammmaaaat"
    };

    LayoutInflater inflater;
    Context context;

    public DetailSejarahAdapter(MenuActivity activity) {
        this.context = activity;
        inflater = inflater.from(activity);
    }

    @NonNull
    @Override
    public SejarahHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.itemqu, viewGroup, false);
        SejarahHolder holder = new SejarahHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SejarahHolder sejarahHolder, final int i) {
        sejarahHolder.txtJudSej.setText(judlSejarah[i]);
        sejarahHolder.subJudSej.setText(subJdlSejarah[i]);
        sejarahHolder.imgSej.setImageResource(gambarSejarah[i]);

        sejarahHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dataSej = new Intent(context, DetailBudayaActivity.class);
                dataSej.putExtra("JudulSej", judlSejarah[i]);
                dataSej.putExtra("GambarSej", gambarSejarah[i]);
                dataSej.putExtra("DetailSej", detailSejarah[i]);
                dataSej.putExtra("pelSej", pelajaran[i]);
                context.startActivity(dataSej);
            }
        });
    }


    @Override
    public int getItemCount() {
        return judlSejarah.length;
    }

    public class SejarahHolder extends RecyclerView.ViewHolder {

        private ImageView imgSej;
        private TextView txtJudSej, subJudSej;

        public SejarahHolder(@NonNull View itemView) {
            super(itemView);
            imgSej = itemView.findViewById(R.id.imgItem);
            txtJudSej = itemView.findViewById(R.id.judul);
            subJudSej = itemView.findViewById(R.id.asal);
        }
    }
}
