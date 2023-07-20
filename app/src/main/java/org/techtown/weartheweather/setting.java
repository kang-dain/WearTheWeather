package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);


        ImageButton setting_button1 = (ImageButton) findViewById(R.id.setting_button1);
        setting_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting_nickname.class);
                startActivity(intent);
            }
        });

        ImageButton setting_button2 = (ImageButton) findViewById(R.id.setting_button2);
        setting_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting_password.class);
                startActivity(intent);
            }
        });


        ImageButton setting_button3 = (ImageButton) findViewById(R.id.setting_button3);
        setting_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting_email.class);
                startActivity(intent);
            }
        });


        ImageButton setting_button4 = (ImageButton) findViewById(R.id.setting_button4);
        setting_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting_color.class);
                startActivity(intent);
            }
        });


        ImageButton setting_button5 = (ImageButton) findViewById(R.id.setting_button5);
        setting_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting_alarm.class);
                startActivity(intent);
            }
        });

        ImageButton setting_common_backbutton = (ImageButton) findViewById(R.id.setting_common_backbutton);
        setting_common_backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });
    }
}