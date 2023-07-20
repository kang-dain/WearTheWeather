package org.techtown.weartheweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;

public class terms_of_use extends AppCompatActivity {

    //체크박스
    private CheckBox allCheckBtn;
    private CheckBox firstCheckBtn;
    private CheckBox secondCheckBtn;
    private CheckBox thirdCheckBtn;

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

        Button terms_of_use_button5 = findViewById(R.id.terms_of_use_button5);
        terms_of_use_button5.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                terms_of_use_button5.setBackgroundColor(Color.parseColor("#FF75A3E9"));
            } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                terms_of_use_button5.setBackgroundColor(Color.parseColor("#FFD9D9D9"));
                // 버튼을 클릭했을 때 다음 화면으로 이동하는 코드
                Intent intent = new Intent(getApplicationContext(), enter_email.class);
                startActivity(intent);
            }
            return false;
        });

        //체크박스
        allCheckBtn = findViewById(R.id.terms_of_use_agree_all);
        firstCheckBtn = findViewById(R.id.terms_of_use_agree_1);
        secondCheckBtn = findViewById(R.id.terms_of_use_agree_2);
        thirdCheckBtn = findViewById(R.id.terms_of_use_agree_3);

        // 각 체크박스의 상태 변경에 대한 동작을 정의
        allCheckBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    firstCheckBtn.setChecked(true);
                    secondCheckBtn.setChecked(true);
                    thirdCheckBtn.setChecked(true);
                }
                else {
                    firstCheckBtn.setChecked(false);
                    secondCheckBtn.setChecked(false);
                    thirdCheckBtn.setChecked(false);
                }
            }
        });

        //첫번째 체크
        firstCheckBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    firstCheckBtn.setChecked(true);}
                else {
                    firstCheckBtn.setChecked(false);}
            }
        });

        //두번째 체크
        secondCheckBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    secondCheckBtn.setChecked(true);}
                else {
                    secondCheckBtn.setChecked(false);}
            }
        });

        //세번째 체크
        thirdCheckBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    thirdCheckBtn.setChecked(true);}
                else {
                    thirdCheckBtn.setChecked(false);}
            }
        });
    }

    // 버튼 원래대로 되돌리기
    @Override
    protected void onResume() {
        super.onResume();
        // 버튼의 배경색을 원래 상태로 되돌립니다.
        Button terms_of_use_button9 = findViewById(R.id.terms_of_use_button5);
        terms_of_use_button9.setBackgroundColor(Color.parseColor("#FFD9D9D9"));
        terms_of_use_button9.setText("동의하고 가입하기");
        terms_of_use_button9.setTextColor(Color.parseColor("#FFFFFF"));
    }
}
