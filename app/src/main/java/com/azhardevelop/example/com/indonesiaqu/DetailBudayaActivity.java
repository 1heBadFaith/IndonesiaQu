package com.azhardevelop.example.com.indonesiaqu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBudayaActivity extends AppCompatActivity {

    ImageView imgBdy;
    TextView txtJudul, txtDetail, txtDetail2,
    txtDetailSjrh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_budaya);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarBdy);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgBdy = findViewById(R.id.imgBdy);
        txtJudul = findViewById(R.id.jdl);
        txtDetail = findViewById(R.id.detail);
        txtDetail2 = findViewById(R.id.asalusul);
        txtDetailSjrh = findViewById(R.id.detSejarah);

        Intent terimaDataBdy = getIntent();
        txtJudul.setText(terimaDataBdy.getStringExtra("JudulBdy"));
        txtDetail.setText(terimaDataBdy.getStringExtra("DetailBdy"));
        txtDetail2.setText(terimaDataBdy.getStringExtra("AsalBdy"));
        txtDetailSjrh.setText(terimaDataBdy.getStringExtra("SejarahBdy"));
        imgBdy.setImageResource(terimaDataBdy.getIntExtra("GambarBdy", 1));



    }
}
