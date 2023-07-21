package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_input_temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_temperature);

        getWindow().setWindowAnimations(0);


        ImageButton temp_right = (ImageButton) findViewById(R.id.user_input_temperature_common_big_arrow__right);
        temp_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_slider.class);
                startActivity(intent);
            }
        });


        ImageButton user_input_temperature_backbutton = (ImageButton) findViewById(R.id.user_input_temperature_backbutton);
        user_input_temperature_backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });

        ImageButton common_menu = (ImageButton) findViewById(R.id.common_menu);
        common_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });


    }

}
