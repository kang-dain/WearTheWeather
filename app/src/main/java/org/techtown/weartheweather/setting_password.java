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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class setting_password extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_password);



        ImageButton setting_common_backbutton3 = (ImageButton) findViewById(R.id.setting_common_backbutton3);
        setting_common_backbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
            }
        });


        Button setting_password_button1 = findViewById(R.id.setting_password_button1);
        /**setting_password_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView setting_password_6 = (ImageView)findViewById(R.id.setting_password_6);
                setting_password_6.setVisibility(View.VISIBLE);
                ImageView setting_password_2 = (ImageView)findViewById(R.id.setting_password_2);
                setting_password_2.setVisibility(View.VISIBLE);
                ImageView setting_password_3 = (ImageView)findViewById(R.id.setting_password_3);
                setting_password_3.setVisibility(View.VISIBLE);
                ImageView setting_password_4 = (ImageView)findViewById(R.id.setting_password_4);
                setting_password_4.setVisibility(View.VISIBLE);
                ImageView setting_password_5 = (ImageView)findViewById(R.id.setting_password_5);
                setting_password_5.setVisibility(View.VISIBLE);
                Button setting_password_button2 = (Button)findViewById(R.id.setting_password_button2);
                setting_password_button2.setVisibility(View.VISIBLE);
                EditText setting_password2 = (EditText)findViewById(R.id.setting_password2);
                setting_password2.setVisibility(View.VISIBLE);
                EditText setting_password3 = (EditText)findViewById(R.id.setting_password3);
                setting_password3.setVisibility(View.VISIBLE);
            }
        });
         */
        setting_password_button1.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                setting_password_button1.setBackgroundResource(R.drawable.setting_password_button1);
            }

            return false;
        });

        Button setting_password_button2 = findViewById(R.id.setting_password_button2);
        setting_password_button2.setOnTouchListener((view, motionEvent) -> {

            Toast.makeText(getApplicationContext(), "변경되었습니다.", Toast.LENGTH_SHORT).show();

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                setting_password_button2.setBackgroundResource(R.drawable.setting_nickname_button1);
            }

            return false;
        });

        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), recommended_music.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calender.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_temperature.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
        });









        Button settingPasswordButton = findViewById(R.id.setting_password_button1);
        settingPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼의 배경을 비교할 Drawable 리소스 ID
                int desiredBackgroundResource = R.drawable.setting_password_button1;

                if (settingPasswordButton.getBackground().getConstantState()
                        == getResources().getDrawable(desiredBackgroundResource).getConstantState()) {
                    ImageView setting_password_6 = (ImageView)findViewById(R.id.setting_password_6);
                    setting_password_6.setVisibility(View.VISIBLE);
                    ImageView setting_password_2 = (ImageView)findViewById(R.id.setting_password_2);
                    setting_password_2.setVisibility(View.VISIBLE);
                    ImageView setting_password_3 = (ImageView)findViewById(R.id.setting_password_3);
                    setting_password_3.setVisibility(View.VISIBLE);
                    ImageView setting_password_4 = (ImageView)findViewById(R.id.setting_password_4);
                    setting_password_4.setVisibility(View.VISIBLE);
                    ImageView setting_password_5 = (ImageView)findViewById(R.id.setting_password_5);
                    setting_password_5.setVisibility(View.VISIBLE);
                    Button setting_password_button2 = (Button)findViewById(R.id.setting_password_button2);
                    setting_password_button2.setVisibility(View.VISIBLE);
                    EditText setting_password2 = (EditText)findViewById(R.id.setting_password2);
                    setting_password2.setVisibility(View.VISIBLE);
                    EditText setting_password3 = (EditText)findViewById(R.id.setting_password3);
                    setting_password3.setVisibility(View.VISIBLE);
                } else {
                    ImageView setting_password_6 = (ImageView)findViewById(R.id.setting_password_6);
                    setting_password_6.setVisibility(View.INVISIBLE);
                    ImageView setting_password_2 = (ImageView)findViewById(R.id.setting_password_2);
                    setting_password_2.setVisibility(View.INVISIBLE);
                    ImageView setting_password_3 = (ImageView)findViewById(R.id.setting_password_3);
                    setting_password_3.setVisibility(View.INVISIBLE);
                    ImageView setting_password_4 = (ImageView)findViewById(R.id.setting_password_4);
                    setting_password_4.setVisibility(View.INVISIBLE);
                    ImageView setting_password_5 = (ImageView)findViewById(R.id.setting_password_5);
                    setting_password_5.setVisibility(View.INVISIBLE);
                    Button setting_password_button2 = (Button)findViewById(R.id.setting_password_button2);
                    setting_password_button2.setVisibility(View.INVISIBLE);
                    EditText setting_password2 = (EditText)findViewById(R.id.setting_password2);
                    setting_password2.setVisibility(View.INVISIBLE);
                    EditText setting_password3 = (EditText)findViewById(R.id.setting_password3);
                    setting_password3.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}