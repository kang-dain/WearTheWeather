package org.techtown.weartheweather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class search_tip_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_tip2);

        getWindow().setWindowAnimations(0);


        ImageButton tip_closebutton2 = (ImageButton) findViewById(R.id.common_closebutton_tip2);
        tip_closebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), search_month.class);
                startActivity(intent);
            }
        });

    }
}