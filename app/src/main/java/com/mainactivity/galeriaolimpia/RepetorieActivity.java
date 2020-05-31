package com.mainactivity.galeriaolimpia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Map;

public class RepetorieActivity extends AppCompatActivity implements View.OnClickListener {

    private Map<String, ArrayList<Movie>> repertuar;

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

            }
            case R.id.ibtWt:{

            }
            case R.id.ibtSr:{

            }
            case R.id.ibtCz:{

            }
            case R.id.ibtPt:{

            }
            case R.id.ibtSb:{

            }
            case R.id.ibtNd:{

            }
        }
    }

    public void fillData(){

    }

}
