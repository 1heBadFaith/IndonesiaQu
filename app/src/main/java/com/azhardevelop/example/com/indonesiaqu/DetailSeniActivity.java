package com.azhardevelop.example.com.indonesiaqu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSeniActivity extends AppCompatActivity {

    ImageView imgBdy;
    TextView txtJudul, txtDetail, txtDetail2,
            txtDetailSjrh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_seni);

        imgBdy = findViewById(R.id.imgBdy);
        txtJudul = findViewById(R.id.jdl);
        txtDetail = findViewById(R.id.detail);
        txtDetail2 = findViewById(R.id.asalusul);
        txtDetailSjrh = findViewById(R.id.detSejarah);

        Intent terimaDataBdy = getIntent();
        txtJudul.setText(terimaDataBdy.getStringExtra("JudulSni"));
        txtDetail.setText(terimaDataBdy.getStringExtra("DetailSni"));
        txtDetail2.setText(terimaDataBdy.getStringExtra("AsalSni"));
        txtDetailSjrh.setText(terimaDataBdy.getStringExtra("SejarahSni"));
        imgBdy.setImageResource(terimaDataBdy.getIntExtra("GambarSni", 1));


    }
}
