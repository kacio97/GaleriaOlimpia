package com.mainactivity.galeriaolimpia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RepetorieActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repetorie);

        ImageButton ibtPn = findViewById(R.id.ibtPon);
        ImageButton ibtWt = findViewById(R.id.ibtWt);
        ImageButton ibtSr = findViewById(R.id.ibtSr);
        ImageButton ibtCz = findViewById(R.id.ibtCz);
        ImageButton ibtPt = findViewById(R.id.ibtPt);
        ImageButton ibtSb = findViewById(R.id.ibtSb);
        ImageButton ibtNd = findViewById(R.id.ibtNd);

        ibtPn.setOnClickListener(this);
        ibtWt.setOnClickListener(this);
        ibtSr.setOnClickListener(this);
        ibtCz.setOnClickListener(this);
        ibtPt.setOnClickListener(this);
        ibtSb.setOnClickListener(this);
        ibtNd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //TODO: Stworzyć intent, putExtra() i nowe Activity dla danego Dnia
        switch (v.getId()){
            case R.id.ibtPon:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "poniedzialek");
                startActivity(intent);
                break;
            }
            case R.id.ibtWt:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "wtorek");
                startActivity(intent);
                break;
            }
            case R.id.ibtSr:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "sroda");
                startActivity(intent);
                break;
            }
            case R.id.ibtCz:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "czwartek");
                startActivity(intent);
                break;
            }
            case R.id.ibtPt:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "piatek");
                startActivity(intent);
                break;
            }
            case R.id.ibtSb:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "sobota");
                startActivity(intent);
                break;
            }
            case R.id.ibtNd:{
                Intent intent = new Intent(getApplicationContext(), RepetorieSingleDayActivity.class);
                intent.putExtra("dzien", "niedziela");
                startActivity(intent);
                break;
            }
        }
    }

}
