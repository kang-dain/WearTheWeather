package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class find_password extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_password);


        ImageButton find_password_backbutton = (ImageButton) findViewById(R.id.find_password_common_backbutton);
        find_password_backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_login.class);
                startActivity(intent);
            }
        });

        Button find_password_button2 = findViewById(R.id.find_password_button2);
        find_password_button2.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                find_password_button2.setBackgroundResource(R.drawable.add_icon1_button4);
            }

            return false;
        });

        Button find_password_button1 = findViewById(R.id.find_password_button1);
        find_password_button1.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                find_password_button1.setBackgroundResource(R.drawable.add_icon1_button3);
            }

            return false;
        });

        Button find_password_button3 = findViewById(R.id.find_password_button3);
        find_password_button3.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                find_password_button3.setBackgroundResource(R.drawable.add_icon1_button2);
            }

            return false;
        });









        find_password_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼의 배경을 비교할 Drawable 리소스 ID
                int desiredBackgroundResource = R.drawable.add_icon1_button4;

                if (find_password_button2.getBackground().getConstantState()
                        == getResources().getDrawable(desiredBackgroundResource).getConstantState()) {
                    Button find_password_button1 = (Button)findViewById(R.id.find_password_button1);
                    find_password_button1.setVisibility(View.VISIBLE);
                    ImageView find_password_input2_bg = (ImageView)findViewById(R.id.find_password_input2_bg);
                    find_password_input2_bg.setVisibility(View.VISIBLE);
                    EditText find_password_input2 = (EditText)findViewById(R.id.find_password_input2);
                    find_password_input2.setVisibility(View.VISIBLE);
                } else {
                    Button find_password_button1 = (Button)findViewById(R.id.find_password_button1);
                    find_password_button1.setVisibility(View.INVISIBLE);
                    ImageView find_password_input2_bg = (ImageView)findViewById(R.id.find_password_input2_bg);
                    find_password_input2_bg.setVisibility(View.INVISIBLE);
                    EditText find_password_input2 = (EditText)findViewById(R.id.find_password_input2);
                    find_password_input2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}