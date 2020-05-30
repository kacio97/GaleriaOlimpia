package com.mainactivity.galeriaolimpia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopListActivity extends AppCompatActivity {

    private ArrayList<Shop> listaSklepow = new ArrayList<>();
    private ListView listView;
    private AdapterShop adapterShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        createData();

        listView = findViewById(R.id.ListView);

        adapterShop = new AdapterShop(ShopListActivity.this, 0, listaSklepow);

        listView.setAdapter(adapterShop);

    }

    private void createData(){
        Shop s1 = new Shop(R.drawable.fajnie_ze_jestes1,
                "Kawiarnie i restauracje",
                "Czynne 09:00 - 21:00");

        Shop s2 = new Shop(R.drawable.helios_button,
                "Kawiarnie i restauracje",
                "Czynne 09:00 - 21:00");

        Shop s3 = new Shop(R.drawable.sklep_button,
                "Kawiarnie i restauracje",
                "Czynne 09:00 - 21:00");

        listaSklepow.add(s1);
        listaSklepow.add(s2);
        listaSklepow.add(s3);
    }


}
