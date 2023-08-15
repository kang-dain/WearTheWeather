package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
                    //닉네임을 complete 액티비티에 넘겨줌
                    Intent intent = new Intent(getApplicationContext(), complete.class);
                    intent.putExtra("nickname", nickname);
                    intent.putExtra("email", email);
                    startActivity(intent);

                    // 닉네임을 menu 액티비티에 넘겨주는 부분
                    Intent menuIntent = new Intent(getApplicationContext(), menu.class);
                    menuIntent.putExtra("nickname", nickname);
                    startActivity(menuIntent);
                } else {
                    // 삽입 오류 처리
                }
            }
            return false;
        });

        EditText editText = findViewById(R.id.editTextText); // 이 부분은 해당하는 EditText의 ID로 변경해주세요.
        // 초기에 버튼 비활성화
        nickname_button.setEnabled(false);
        // EditText에 텍스트가 입력될 때마다 호출되는 TextWatcher 등록
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // 텍스트 변경 전에 호출됩니다.
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // 텍스트가 변경될 때 호출됩니다.
                // 입력된 텍스트의 길이가 0보다 크면 버튼을 활성화
                if (charSequence.length() > 0) {
                    nickname_button.setBackgroundResource(R.drawable.add_icon2_button5);
                    nickname_button.setEnabled(true);
                } else {
                    nickname_button.setEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
                // 텍스트 변경 후에 호출됩니다.
            }
        });


        ImageButton enter_nickname_back_button = findViewById(R.id.enter_nickname_backbutton1);
        enter_nickname_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enter_password.class);
                startActivity(intent);
            }
        });
    }
}
