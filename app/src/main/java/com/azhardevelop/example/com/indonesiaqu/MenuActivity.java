package com.azhardevelop.example.com.indonesiaqu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView recyclerBudaya, recyclerKata, recyclerSeni, recycleSejarah, recyclerTips;
    //Daftar Gambar
    private int[] gambarBd = {R.drawable.jaipong, R.drawable.saman, R.drawable.tortor, R.drawable.reog, R.drawable.batik};
    CarouselView carouselView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Carousel
        carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(gambarBd.length);
        carouselView.setImageListener(imageListener);


        //Budaya
        recyclerBudaya = findViewById(R.id.budaya);
        recyclerBudaya.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        DetailBudayaAdapter budayaAdapter = new DetailBudayaAdapter(MenuActivity.this);
        recyclerBudaya.setAdapter(budayaAdapter);

        //Kata
        recyclerKata = findViewById(R.id.kataMereka);
        recyclerKata.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        DetailKataAdapter kataAdapter = new DetailKataAdapter(MenuActivity.this);
        recyclerKata.setAdapter(kataAdapter);


        //Seni
        recyclerSeni = findViewById(R.id.seni);
        recyclerSeni.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        DetailSeniAdapter seniAdapter = new DetailSeniAdapter(MenuActivity.this);
        recyclerSeni.setAdapter(seniAdapter);
        //Sejarah
        recycleSejarah = findViewById(R.id.sejarah);
        recycleSejarah.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        DetailSejarahAdapter sejarahAdapter = new DetailSejarahAdapter(MenuActivity.this);
        recycleSejarah.setAdapter(sejarahAdapter);
        //Tips
        recyclerTips = findViewById(R.id.tips);
        recyclerTips.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        DetailTipsAdapter tipsAdapter = new DetailTipsAdapter(MenuActivity.this);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(gambarBd[position]);
        }
    };

}
