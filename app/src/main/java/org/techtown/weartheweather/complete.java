package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class complete extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        ImageButton complete_back_button = findViewById(R.id.complete_button1);
        complete_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enter_nickname.class);
                startActivity(intent);
            }
        });


        Button complete_nextbutton = findViewById(R.id.complete_nextbutton);
        complete_nextbutton.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                complete_nextbutton.setBackgroundResource(R.drawable.add_icon2_button6);
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
            return false;
        });
    }
}
