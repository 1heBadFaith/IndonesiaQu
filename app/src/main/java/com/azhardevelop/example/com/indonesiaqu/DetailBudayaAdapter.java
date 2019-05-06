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

class DetailBudayaAdapter extends RecyclerView.Adapter<DetailBudayaAdapter.BudayaHolder> {

    private String[] judulBd = {"Tari Jaipong", "Tari Saman", "Tari Tor-Tor", "Tari Piring"};
    private String[] subJudulBudaya ={"Bandung", "Aceh", "Sumut", "Sumbar"};
    private int gambarBudya[] = {R.drawable.jaipong, R.drawable.saman, R.drawable.tortor, R.drawable.taripiring};
    private String[] detailBudaya ={
            "Jaipong adalah",
            "Saman adalah",
            "Tor-Tor adalah",
            "Tari Piring adalah"
    };

    private String[] sejarahBdy ={
            "Sejarah Jaipong adalah",
            "Sejarah Saman Adalah",
            "Sejarah Tor-Tor Adalah",
            "Sejarah Tari Piring Adalah"
    };

    private String[] asalusulBdy ={
            "Jaipong Berasal dari",
            "Saman Berasal dari",
            "Tor-Tor Berasal dari",
            "Tari Piring Berasal dari"
    };

    Context context;
    LayoutInflater layoutInflater;

    public DetailBudayaAdapter(MenuActivity activity) {
        this.context = activity;
        layoutInflater = layoutInflater.from(activity);
    }

    @NonNull
    @Override
    public BudayaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.itemqu, viewGroup, false);
        BudayaHolder holder = new BudayaHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BudayaHolder budayaHolder, final int i) {
        budayaHolder.judulBdy.setText(judulBd[i]);
        budayaHolder.imgBdy.setImageResource(gambarBudya[i]);
        budayaHolder.subJudulBdyaa.setText(subJudulBudaya[i]);

        budayaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dataBudaya = new Intent(context, DetailBudayaActivity.class);
                dataBudaya.putExtra("JudulBdy", judulBd[i]);
                dataBudaya.putExtra("GambarBdy", gambarBudya[i]);
                dataBudaya.putExtra("DetailBdy", detailBudaya[i]);
                dataBudaya.putExtra("AsalBdy", asalusulBdy[i]);
                dataBudaya.putExtra("SejarahBdy", sejarahBdy[i]);
                context.startActivity(dataBudaya);
            }
        });
    }

    @Override
    public int getItemCount() {
        return judulBd.length;
    }

    public class BudayaHolder extends RecyclerView.ViewHolder {
        private ImageView imgBdy;
        private TextView judulBdy, subJudulBdyaa;
        public BudayaHolder(@NonNull View itemView) {
            super(itemView);
            imgBdy = itemView.findViewById(R.id.imgItem);
            judulBdy = itemView.findViewById(R.id.judul);
            subJudulBdyaa = itemView.findViewById(R.id.asal);
        }
    }
}
