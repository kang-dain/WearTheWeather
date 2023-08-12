package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class enter_nickname extends Activity {

    Button nickname_button;
    DatabaseHelper databaseHelper;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_nickname);

        databaseHelper = new DatabaseHelper(this);
        if (!databaseHelper.isNicknameTableExists()) {
            databaseHelper.createNicknameTable();
        }

        getWindow().setWindowAnimations(0);

        ImageButton enter_nickname_back_button = findViewById(R.id.enter_nickname_backbutton1);
        enter_nickname_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enter_password.class);
                startActivity(intent);
            }
        });

        nickname_button = findViewById(R.id.nickname_button);
        nickname_button.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                nickname_button.setBackgroundResource(R.drawable.add_icon2_button5);

                // EditText에서 입력한 닉네임을 가져옴
                EditText nicknameEditText = findViewById(R.id.editTextText);
                String nickname = nicknameEditText.getText().toString();

                // 닉네임을 이전 액티비티에서 이메일과 함께 받아와야 함
                String email = getIntent().getStringExtra("email");
                boolean nicknameInserted = databaseHelper.insertNickname(email, nickname);

                if (nicknameInserted) {
                    //닉네임을 다음 액티비티에 넘겨줌
                    Intent intent = new Intent(getApplicationContext(), complete.class);
                    intent.putExtra("nickname", nickname);
                    intent.putExtra("email", email);
                    startActivity(intent);
                } else {
                    // 삽입 오류 처리
                }
            }
            return false;
        });
    }
}
