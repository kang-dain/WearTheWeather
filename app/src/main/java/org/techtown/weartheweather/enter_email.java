package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class enter_email extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_email);

        getWindow().setWindowAnimations(0);

        ImageButton enter_email_back_button = findViewById(R.id.enter_email_button1);
        enter_email_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), terms_of_use.class);
                startActivity(intent);
            }
        });


        Button enter_email_button2 = findViewById(R.id.enter_email_button2);
        enter_email_button2.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                enter_email_button2.setBackgroundResource(R.drawable.add_icon2_button4);
                Intent intent = new Intent(getApplicationContext(), enter_password.class);
                startActivity(intent);
            }
            return false;
        });
    }
}