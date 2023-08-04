package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.techtown.weartheweather.databinding.ActivityMainLoginBinding;

public class main_login extends AppCompatActivity {

    ActivityMainLoginBinding binding;
    DatabaseHelper databaseHelper;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.mainLoginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.mainemailinput.getText().toString();
                String password = binding.mainpasswordinput.getText().toString();
                if(email.equals("")||password.equals(""))
                    Toast.makeText(main_login.this, "모든 항목을 채워주세요.", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkCredentials = databaseHelper.checkEmailPassword(email, password);
                    if(checkCredentials == true){
                        Toast.makeText(main_login.this, "로그인 성공!", Toast.LENGTH_SHORT).show();
                        Intent intent  = new Intent(getApplicationContext(), main_weather.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(main_login.this, "잘못된 자격증명입니다.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        binding.mainLoginButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(main_login.this, enter_email.class);
                startActivity(intent);
            }
        });

        ImageButton find_password_button = (ImageButton) findViewById(R.id.main_login_button2);
        find_password_button.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), find_password.class);
            startActivity(intent);
        });
    }
}
