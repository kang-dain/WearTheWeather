package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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
                Intent intent = new Intent(getApplicationContext(), search_tip.class);
                startActivity(intent);
            }
        });



    }
}