package com.mainactivity.galeriaolimpia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowingDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing_details);

        Intent intent = getIntent();

        ImageView logo = findViewById(R.id.ivMovieLogo);
        TextView title = findViewById(R.id.tvTitle);
        TextView year = findViewById(R.id.tvYear);
        TextView category = findViewById(R.id.tvCategory);
        TextView desc = findViewById(R.id.tvDescription);
        TextView days = findViewById(R.id.tvDays);
        TextView hours = findViewById(R.id.tvHours);
        TextView room = findViewById(R.id.tvRoom);

        logo.setImageResource(intent.getIntExtra("logo", 0));
        title.setText(intent.getStringExtra("title"));
        year.setText(intent.getStringExtra("year"));
        desc.setText(intent.getStringExtra("desc"));
        category.setText(intent.getStringExtra("category"));
        days.setText(intent.getStringExtra("days"));
        hours.setText(intent.getStringExtra("hours"));
        room.setText(intent.getStringExtra("room"));
    }
}
