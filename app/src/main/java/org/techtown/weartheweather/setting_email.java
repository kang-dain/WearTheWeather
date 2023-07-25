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

public class setting_email extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_email);


        ImageButton setting_common_backbutton4 = (ImageButton) findViewById(R.id.setting_common_backbutton4);
        setting_common_backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), setting.class);
                startActivity(intent);
            }
        });

        Button imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnTouchListener((view, motionEvent) -> {

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                imageButton2.setBackgroundResource(R.drawable.setting_password_button1);
            }

            return false;
        });

        Button imageButton3 = findViewById(R.id.imageButton3);
        imageButton3.setOnTouchListener((view, motionEvent) -> {

            Toast.makeText(getApplicationContext(), "변경되었습니다.", Toast.LENGTH_SHORT).show();

            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                imageButton3.setBackgroundResource(R.drawable.setting_password_button2);
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























        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼의 배경을 비교할 Drawable 리소스 ID
                int desiredBackgroundResource = R.drawable.setting_password_button1;

                if (imageButton2.getBackground().getConstantState()
                        == getResources().getDrawable(desiredBackgroundResource).getConstantState()) {
                    ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
                    imageView3.setVisibility(View.VISIBLE);
                    EditText editTextText3 = (EditText)findViewById(R.id.editTextText3);
                    editTextText3.setVisibility(View.VISIBLE);
                    EditText editTextTextPassword2 = (EditText)findViewById(R.id.editTextTextPassword2);
                    editTextTextPassword2.setVisibility(View.VISIBLE);
                    Button imageButton3 = (Button)findViewById(R.id.imageButton3);
                    imageButton3.setVisibility(View.VISIBLE);
                } else {
                    ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
                    imageView3.setVisibility(View.INVISIBLE);
                    EditText editTextText3 = (EditText)findViewById(R.id.editTextText3);
                    editTextText3.setVisibility(View.INVISIBLE);
                    EditText editTextTextPassword2 = (EditText)findViewById(R.id.editTextTextPassword2);
                    editTextTextPassword2.setVisibility(View.INVISIBLE);
                    Button imageButton3 = (Button)findViewById(R.id.imageButton3);
                    imageButton3.setVisibility(View.INVISIBLE);

                }
            }
        });

    }
}