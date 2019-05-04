package com.azhardevelop.example.com.indonesiaqu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class DetailKataAdapter extends RecyclerView.Adapter<DetailKataAdapter.KataHolder>{

    private String[] namaOrang ={
            "-Barrack Obama", "-Anonymous", "-Azhar", "-Abdullah"
    };

    private String[] katanya ={
            "Kata Obama", "Kata Anonim", "Indonesia Ku Aneh", "Indonesia Bau Banyak Sampah"
    };

    Context context;
    LayoutInflater inflater;

    public DetailKataAdapter(MenuActivity activity) {
        this.context = activity;
        inflater = inflater.from(activity);
    }

    @NonNull
    @Override
    public KataHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_quotes_kata_mereka, viewGroup, false);
        KataHolder holder = new KataHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KataHolder kataHolder,final int i) {
        kataHolder.txtNama.setText(namaOrang[i]);
        kataHolder.txtKata.setText(katanya[i]);
    }

    @Override
    public int getItemCount() {
        return katanya.length;
    }

    public class KataHolder extends RecyclerView.ViewHolder {
        TextView txtKata, txtNama;

        public KataHolder(@NonNull View itemView) {
            super(itemView);
            txtKata = itemView.findViewById(R.id.kataMereka);
            txtNama = itemView.findViewById(R.id.namaOrang);
        }
    }
}
