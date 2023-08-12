package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.techtown.weartheweather.databinding.ActivityEnterEmailBinding;

public class enter_email extends AppCompatActivity {

    ActivityEnterEmailBinding binding;
    DatabaseHelper databaseHelper;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterEmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.enterEmailButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.enterEmailInput1.getText().toString();
                String password = binding.editTextTextPassword.getText().toString();
                String confirmPassword = binding.editTextTextPassword2.getText().toString();
                if(email.equals("")||password.equals("")||confirmPassword.equals(""))
                    Toast.makeText(enter_email.this, "모든 항목을 채워주세요.", Toast.LENGTH_SHORT).show();
                else{
                    if(password.equals(confirmPassword)){
                        Boolean checkUserEmail = databaseHelper.checkEmail(email);
                        if(checkUserEmail == false){
                            Boolean insert = databaseHelper.insertData(email, password);
                            if(insert == true){
                                Toast.makeText(enter_email.this, "회원가입 성공!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), enter_nickname.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(enter_email.this, "회원가입 실패!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(enter_email.this, "이미 존재하는 사용자입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(enter_email.this, "암호가 잘못되었습니다.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        binding.enterEmailButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(enter_email.this, enter_nickname.class);
                startActivity(intent);
            }
        });
    }
}