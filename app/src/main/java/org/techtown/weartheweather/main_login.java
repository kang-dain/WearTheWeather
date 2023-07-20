package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class main_login extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        ImageButton main_backbutton = (ImageButton) findViewById(R.id.main_login_common_backbutton);
        main_backbutton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), main.class);
            startActivity(intent);
        });

        ImageButton find_password_button = (ImageButton) findViewById(R.id.main_login_button2);
        find_password_button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), find_password.class);
            startActivity(intent);
        });


        Button main_login_button1;
        main_login_button1 = findViewById(R.id.main_login_button1);
        main_login_button1.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                main_login_button1.setBackgroundColor(Color.parseColor("#FF75A3E9"));
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                main_login_button1.setBackgroundColor(Color.parseColor("#FFD9D9D9"));
            }


            return false;
        });

    }
}
