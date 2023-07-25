package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class calender_daily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_daily);


        ImageButton calender_daily_button1 = (ImageButton) findViewById(R.id.calender_daily_button1);
        calender_daily_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView calender_daily_button3 = (ImageView)findViewById(R.id.calender_daily_button3);
                calender_daily_button3.setVisibility(View.VISIBLE);
            }
        });

        ImageView calender_daily_button3 = (ImageView) findViewById(R.id.calender_daily_button3);
        calender_daily_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView calender_daily_button3 = (ImageView)findViewById(R.id.calender_daily_button3);
                calender_daily_button3.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton calender_daily_common_closebutton = (ImageButton) findViewById(R.id.calender_daily_common_closebutton);
        calender_daily_common_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calender.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), recommended_music.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calender.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });
    }
}