package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class enter_nickname extends Activity {

    Button nickname_button;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_nickname);

        ImageButton enter_nickname_back_button = findViewById(R.id.enter_nickname_backbutton1);
        enter_nickname_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enter_password.class);
                startActivity(intent);
            }
        });

        Button nickname_button = findViewById(R.id.nickname_button);
        nickname_button.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                nickname_button.setBackgroundColor(Color.parseColor("#FF75A3E9"));
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                nickname_button.setBackgroundColor(Color.parseColor("#FFD9D9D9"));

                Intent intent = new Intent(getApplicationContext(), complete.class);
                startActivity(intent);
            }
            return false;
        });
    }
    // 버튼 원래대로 되돌리기
    @Override
    protected void onResume() {
        super.onResume();

        Button nickname_button = findViewById(R.id.nickname_button);
        nickname_button.setBackgroundColor(Color.parseColor("#FFD9D9D9"));
        nickname_button.setText("다음");
        nickname_button.setTextColor(Color.parseColor("#FFFFFF"));
    }
}
