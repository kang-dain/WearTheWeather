package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class search_temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_temperature);

        getWindow().setWindowAnimations(0);


        ImageButton search_temperature_right = (ImageButton) findViewById(R.id.common_big_arrow__right);
        search_temperature_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_month.class);
                startActivity(intent);
            }
        });



        ImageButton tipbutton1 = (ImageButton) findViewById(R.id.search_temperature_button);
        tipbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip);
                search_tip.setVisibility(View.VISIBLE);
            }
        });

        ImageView closetipbutton1 = (ImageView) findViewById(R.id.search_tip);
        closetipbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip);
                search_tip.setVisibility(View.INVISIBLE);

            }
        });



        ImageButton user_input_temperature_backbutton5 = (ImageButton) findViewById(R.id.user_input_temperature_backbutton5);
        user_input_temperature_backbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });
    }
}