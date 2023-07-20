package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class user_input_keyword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_keyword);

        getWindow().setWindowAnimations(0);

        ImageButton keyword_right = (ImageButton) findViewById(R.id.user_input_keyword_common_big_arrow_left);
        keyword_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_slider.class);
                startActivity(intent);
            }
        });


        ImageButton keyword_left = (ImageButton) findViewById(R.id.user_input_keyword_common_big_arrow__right);
        keyword_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_fashion.class);
                startActivity(intent);
            }
        });



        ImageButton tipbutton1 = (ImageButton) findViewById(R.id.user_input_keyword_button_1);
        tipbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.user_input_suggestionkey);
                search_tip.setVisibility(View.VISIBLE);

            }
        });

        ImageView closetipbutton1 = (ImageView) findViewById(R.id.user_input_suggestionkey);
        closetipbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.user_input_suggestionkey);
                search_tip.setVisibility(View.INVISIBLE);

            }
        });


    }
}