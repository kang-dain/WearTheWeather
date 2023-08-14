package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class complete extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        getWindow().setWindowAnimations(0);

        ImageButton complete_back_button = findViewById(R.id.complete_button1);
        complete_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enter_nickname.class);
                startActivity(intent);
            }
        });

        // 전달받은 닉네임 정보를 가져옴
        String nickname = getIntent().getStringExtra("nickname");

        // 전달받은 이메일 정보를 가져옴
        String email = getIntent().getStringExtra("email");

        // 텍스트뷰에 닉네임 정보 설정
        TextView nicknameView = findViewById(R.id.nickname_View);
        nicknameView.setText(nickname);


        Button complete_nextbutton = findViewById(R.id.complete_nextbutton);
        complete_nextbutton.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
            return false;
        });
    }
}
