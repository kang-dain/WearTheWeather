package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class main_weather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weather);


        ImageView main_weather_button1 = (ImageView) findViewById(R.id.main_weather_button1);
        main_weather_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), user_input_temperature.class);
                    startActivity(intent);
            }
        });

        ImageView common_menu8 = (ImageView) findViewById(R.id.common_menu8);
        common_menu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });


    }
}