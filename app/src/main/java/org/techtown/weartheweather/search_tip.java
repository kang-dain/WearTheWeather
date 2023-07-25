package org.techtown.weartheweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class search_tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_tip);


        ImageView closetipbutton2 = (ImageView) findViewById(R.id.search_tip3);
        closetipbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView search_tip = (ImageView)findViewById(R.id.search_tip3);
                search_tip.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(getApplicationContext(), search_month.class);
                startActivity(intent);
            }
        });
    }
}