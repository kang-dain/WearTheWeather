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
    }
}