package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_input_slider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_slider);

        getWindow().setWindowAnimations(0);


        ImageButton slider_left = (ImageButton) findViewById(R.id.user_input_slider_common_big_arrow_left);
        slider_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_temperature.class);
                startActivity(intent);
            }
        });

        ImageButton slider_right = (ImageButton) findViewById(R.id.user_input_slider_common_big_arrow__right);
        slider_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_keyword.class);
                startActivity(intent);
            }
        });


        ImageButton user_input_temperature_backbutton2 = (ImageButton) findViewById(R.id.user_input_temperature_backbutton2);
        user_input_temperature_backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });

    }
}