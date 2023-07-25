package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class terms_of_use extends AppCompatActivity {
    long delay = 0;

    //체크박스
    private CheckBox allCheckBtn;
    private CheckBox firstCheckBtn;
    private CheckBox secondCheckBtn;
    private CheckBox thirdCheckBtn;

    @SuppressLint("ClickableViewAccessibility")
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

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                terms_of_use_button5.setBackgroundResource(R.drawable.add_icon2_button3);
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

}
