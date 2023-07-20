package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class search_month extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_month);

        getWindow().setWindowAnimations(0);

        ImageButton search_month_left = (ImageButton) findViewById(R.id.common_big_arrow_left);
        search_month_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });


        ImageButton search_month_button = (ImageButton) findViewById(R.id.search_month_button13);
        search_month_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_result.class);
                startActivity(intent);
            }
        });

        ImageButton tipbutton2 = (ImageButton) findViewById(R.id.search_temperature_button2);
        tipbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip2);
                search_tip.setVisibility(View.VISIBLE);

            }
        });

        ImageView closetipbutton2 = (ImageView) findViewById(R.id.search_tip2);
        closetipbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip2);
                search_tip.setVisibility(View.INVISIBLE);

            }
        });



    }
}