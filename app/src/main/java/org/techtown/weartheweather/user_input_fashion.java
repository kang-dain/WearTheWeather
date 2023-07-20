package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_input_fashion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_fashion);

        getWindow().setWindowAnimations(0);

        ImageButton fashion_left = (ImageButton) findViewById(R.id.user_input_fashion_common_big_arrow_left);
        fashion_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_keyword.class);
                startActivity(intent);
            }
        });

        ImageButton user_input_temperature_backbutton4 = (ImageButton) findViewById(R.id.user_input_temperature_backbutton4);
        user_input_temperature_backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });
    }
}