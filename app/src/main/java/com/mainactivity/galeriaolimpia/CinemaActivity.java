package com.mainactivity.galeriaolimpia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CinemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        ImageView imageView = findViewById(R.id.ivCinemaLogo);

        imageView.setImageResource(R.drawable.helios_wall);

        ImageButton repetorie = findViewById(R.id.ibtRep);
        ImageButton priceList = findViewById(R.id.ibtCenn);

        ImageButton ibtList = findViewById(R.id.ibtMovieList);

        repetorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RepetorieActivity.class);
                startActivity(intent);
            }
        });

        ibtList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MovieListActivity.class);
                startActivity(intent);
            }
        });

        priceList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PriceActivity.class);
                startActivity(intent);
            }
        });


    }
}
