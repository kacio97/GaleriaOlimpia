package com.mainactivity.galeriaolimpia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class CinemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema);

        ImageView imageView = findViewById(R.id.ivCinemaLogo);

        imageView.setImageResource(R.drawable.helios_wall);

        ImageButton repetorie = findViewById(R.id.ibtRep);
        ImageButton priceList = findViewById(R.id.ibtCenn);

        repetorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RepetorieActivity.class);
                startActivity(intent);
            }
        });


    }
}
