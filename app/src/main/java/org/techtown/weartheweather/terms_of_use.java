package org.techtown.weartheweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class terms_of_use extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_use);


        ImageButton terms_of_use_back_button = findViewById(R.id.terms_of_use_button1);
        terms_of_use_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_login.class);
                startActivity(intent);
            }
        });


        Button terms_of_use_button9 = findViewById(R.id.terms_of_use_button9);
        terms_of_use_button9.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                terms_of_use_button9.setBackgroundColor(Color.parseColor("#FF75A3E9"));
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                terms_of_use_button9.setBackgroundColor(Color.parseColor("#FFD9D9D9"));
                // 버튼을 클릭했을 때 다음 화면으로 이동하는 코드
                Intent intent = new Intent(getApplicationContext(), enter_email.class);
                startActivity(intent);
            }
            return false;
        });





    }
}