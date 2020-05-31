package com.mainactivity.galeriaolimpia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ShopDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_details);

        Intent intent = getIntent();

        TextView tvCategory = findViewById(R.id.tvShopCategory);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etDescription = findViewById(R.id.etDescription);

        ImageView imgLogo = findViewById(R.id.ivLogo);
        ImageView imgPic = findViewById(R.id.ivPic);

        tvCategory.setText(intent.getStringExtra("category"));
        etPhone.setText(intent.getStringExtra("phone"));
        etDescription.setText(intent.getStringExtra("description"));
        imgLogo.setImageResource(intent.getIntExtra("logo",0));
        imgPic.setImageResource(intent.getIntExtra("shopImg",0));
    }
}
