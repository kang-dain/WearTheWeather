package org.techtown.weartheweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class user_input_fashion extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_fashion);

        getWindow().setWindowAnimations(0);

        ImageButton fashion_left = (ImageButton) findViewById(R.id.user_input_fashion_common_big_arrow_left);
        fashion_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_input_keyword.class);
                startActivity(intent);
            }
        });

        ImageButton user_input_temperature_backbutton4 = (ImageButton) findViewById(R.id.user_input_temperature_backbutton4);
        user_input_temperature_backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), main_weather.class);
                startActivity(intent);
            }
        });

        ImageView user_input_fashion_3 = (ImageView) findViewById(R.id.user_input_fashion_3);

        Button bg1 = (Button) findViewById(R.id.bg1);
        Button bg2 = (Button) findViewById(R.id.bg2);
        Button bg3 = (Button) findViewById(R.id.bg3);
        Button bg4 = (Button) findViewById(R.id.bg4);
        Button bg5 = (Button) findViewById(R.id.bg5);
        bg1.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bg1.setBackgroundResource(R.drawable.user_input_fashion_button_6_blue);
                bg2.setBackgroundResource(R.drawable.user_input_fashion_button_7);
                bg3.setBackgroundResource(R.drawable.user_input_fashion_button_8);
                bg4.setBackgroundResource(R.drawable.user_input_fashion_button_9);
                bg5.setBackgroundResource(R.drawable.user_input_fashion_button_10);
                user_input_fashion_3.setBackgroundResource(R.drawable.user_input_fashion_3);
            }
            return false;
        });
        bg2.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bg1.setBackgroundResource(R.drawable.user_input_fashion_button_6);
                bg2.setBackgroundResource(R.drawable.user_input_fashion_button_7_blue);
                bg3.setBackgroundResource(R.drawable.user_input_fashion_button_8);
                bg4.setBackgroundResource(R.drawable.user_input_fashion_button_9);
                bg5.setBackgroundResource(R.drawable.user_input_fashion_button_10);
            }
            return false;
        });
        bg3.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bg1.setBackgroundResource(R.drawable.user_input_fashion_button_6);
                bg2.setBackgroundResource(R.drawable.user_input_fashion_button_7);
                bg3.setBackgroundResource(R.drawable.user_input_fashion_button_8_blue);
                bg4.setBackgroundResource(R.drawable.user_input_fashion_button_9);
                bg5.setBackgroundResource(R.drawable.user_input_fashion_button_10);
            }
            return false;
        });
        bg4.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bg1.setBackgroundResource(R.drawable.user_input_fashion_button_6);
                bg2.setBackgroundResource(R.drawable.user_input_fashion_button_7);
                bg3.setBackgroundResource(R.drawable.user_input_fashion_button_8);
                bg4.setBackgroundResource(R.drawable.user_input_fashion_button_9_blue);
                bg5.setBackgroundResource(R.drawable.user_input_fashion_button_10);
            }
            return false;
        });
        bg5.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                bg1.setBackgroundResource(R.drawable.user_input_fashion_button_6);
                bg2.setBackgroundResource(R.drawable.user_input_fashion_button_7);
                bg3.setBackgroundResource(R.drawable.user_input_fashion_button_8);
                bg4.setBackgroundResource(R.drawable.user_input_fashion_button_9);
                bg5.setBackgroundResource(R.drawable.user_input_fashion_button_10_blue);
            }
            return false;
        });

        Button user_input_fashion_button_5 = findViewById(R.id.user_input_fashion_button_5);
        user_input_fashion_button_5.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_5.setBackgroundResource(R.drawable.user_input_fashion_button_5_blue);
            }
            return false;
        });

        Button user_input_fashion_button_1 = findViewById(R.id.user_input_fashion_button_1);
        Button user_input_fashion_button_2 = findViewById(R.id.user_input_fashion_button_2);
        Button user_input_fashion_button_3 = findViewById(R.id.user_input_fashion_button_3);
        Button user_input_fashion_button_4 = findViewById(R.id.user_input_fashion_button_4);
        HorizontalScrollView outer = findViewById(R.id.outer);
        HorizontalScrollView top = findViewById(R.id.top);
        HorizontalScrollView pants = findViewById(R.id.pants);
        HorizontalScrollView shoes = findViewById(R.id.shoes);
        Button none = findViewById(R.id.none);
        Button coat = findViewById(R.id.coat);
        Button padding = findViewById(R.id.padding);
        Button jumper = findViewById(R.id.jumper);
        Button zipup = findViewById(R.id.zipup);
        Button cardigon = findViewById(R.id.cardigon);
        ImageView input_outer = findViewById(R.id.input_outer);
        ImageView input_top = findViewById(R.id.input_top);
        ImageView input_pants = findViewById(R.id.intput_pants);
        ImageView input_shoes = findViewById(R.id.input_shoes);

        user_input_fashion_button_1.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1_blue);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4);
                outer.setVisibility(View.VISIBLE);
                top.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
                shoes.setVisibility(View.INVISIBLE);
            }
            return false;
        });
        none.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_outer.setBackgroundResource(R.mipmap.none_2_foreground);
                none.setText("SELECTED");
                coat.setText("");
                padding.setText("");
                jumper.setText("");
                zipup.setText("");
                cardigon.setText("");
            }
            return false;
        });
        coat.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_outer.setBackgroundResource(R.mipmap.coat_foreground);
                none.setText("");
                coat.setText("SELECTED");
                padding.setText("");
                jumper.setText("");
                zipup.setText("");
                cardigon.setText("");}
            return false;
        });
        padding.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_outer.setBackgroundResource(R.mipmap.padding_foreground);
                none.setText("");
                coat.setText("");
                padding.setText("SELECTED");
                jumper.setText("");
                zipup.setText("");
                cardigon.setText("");}
            return false;
        });
        jumper.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_outer.setBackgroundResource(R.mipmap.jumper_foreground);
                none.setText("");
                coat.setText("");
                padding.setText("");
                jumper.setText("SELECTED");
                zipup.setText("");
                cardigon.setText("");}
            return false;
        });
        zipup.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_outer.setBackgroundResource(R.mipmap.zipup_foreground);
                none.setText("");
                coat.setText("");
                padding.setText("");
                jumper.setText("");
                zipup.setText("SELECTED");
                cardigon.setText("");}
            return false;
        });
        cardigon.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_outer.setBackgroundResource(R.mipmap.cardigon_foreground);
                none.setText("");
                cardigon.setText("SELECTED");
                coat.setText("");
                padding.setText("");
                jumper.setText("");
                zipup.setText("");}
            return false;
        });
        user_input_fashion_button_2.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2_blue);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4);
                top.setVisibility(View.VISIBLE);
                outer.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
                shoes.setVisibility(View.INVISIBLE);
            }
            return false;
        });
        Button hood = findViewById(R.id.hood);
        Button mantoman = findViewById(R.id.mantoman);
        Button knit = findViewById(R.id.knit);
        Button tshirt = findViewById(R.id.tshirt);
        hood.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_top.setBackgroundResource(R.mipmap.hood_foreground);
                hood.setText("SELECTED");
                mantoman.setText("");
                knit.setText("");
                tshirt.setText("");
            }
                return false;
        });
        mantoman.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_top.setBackgroundResource(R.mipmap.mantoman_foreground);
                hood.setText("");
                mantoman.setText("SELECTED");
                knit.setText("");
                tshirt.setText("");
            }
            return false;
        });
        knit.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_top.setBackgroundResource(R.mipmap.knit_foreground);
                hood.setText("");
                mantoman.setText("");
                knit.setText("SELECTED");
                tshirt.setText("");
            }
            return false;
        });
        tshirt.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_top.setBackgroundResource(R.mipmap.tshirts_foreground);
                hood.setText("");
                mantoman.setText("");
                knit.setText("");
                tshirt.setText("SELECTED");
            }
            return false;
        });

        Button shortskirt = findViewById(R.id.shortskirt);
        Button longskirt = findViewById(R.id.longskirt);
        Button longpants1 = findViewById(R.id.longpants1);
        Button longpants2 = findViewById(R.id.longpants2);
        Button shortpants = findViewById(R.id.shortpants);
        Button shortpants2 = findViewById(R.id.shortpants2);
        Button slacks = findViewById(R.id.slacks);
        user_input_fashion_button_3.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3_blue);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4);
                shoes.setVisibility(View.INVISIBLE);
                outer.setVisibility(View.INVISIBLE);
                top.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.VISIBLE);
            }
            return false;
        });
        shortskirt.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.shortskirt_foreground);
                shortskirt.setText("SELECTED");
                longskirt.setText("");
                longpants1.setText("");
                longpants2.setText("");
                shortpants.setText("");
                shortpants2.setText("");
                slacks.setText("");
            }
            return false;
        });
        longskirt.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.longskirt_foreground);
                shortskirt.setText("");
                longskirt.setText("SELECTED");
                longpants1.setText("");
                longpants2.setText("");
                shortpants.setText("");
                shortpants2.setText("");
                slacks.setText("");
            }
            return false;
        });
        longpants1.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.longpants_training_foreground);
                shortskirt.setText("");
                longskirt.setText("");
                longpants1.setText("SELECTED");
                longpants2.setText("");
                shortpants.setText("");
                shortpants2.setText("");
                slacks.setText("");
            }
            return false;
        });
        longpants2.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.longpants_blue_foreground);
                shortskirt.setText("");
                longskirt.setText("");
                longpants1.setText("");
                longpants2.setText("SELECTED");
                shortpants.setText("");
                shortpants2.setText("");
                slacks.setText("");
            }
            return false;
        });
        shortpants.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.shortpants_training_foreground);
                shortskirt.setText("");
                longskirt.setText("");
                longpants1.setText("");
                longpants2.setText("");
                shortpants.setText("SELECTED");
                shortpants2.setText("");
                slacks.setText("");
            }
            return false;
        });
        shortpants2.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.shortpants_blue_foreground);
                shortskirt.setText("");
                longskirt.setText("");
                longpants1.setText("");
                longpants2.setText("");
                shortpants.setText("");
                shortpants2.setText("SELECTED");
                slacks.setText("");
            }
            return false;
        });
        slacks.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_pants.setBackgroundResource(R.mipmap.longpants_slacks_foreground);
                shortskirt.setText("");
                longskirt.setText("");
                longpants1.setText("");
                longpants2.setText("");
                shortpants.setText("");
                shortpants2.setText("");
                slacks.setText("SELECTED");
            }
            return false;
        });


        Button boots = findViewById(R.id.boots);
        Button sneakers = findViewById(R.id.sneakers);
        Button sandals = findViewById(R.id.sandals);

        user_input_fashion_button_4.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                user_input_fashion_button_1.setBackgroundResource(R.drawable.user_input_fashion_button_1);
                user_input_fashion_button_2.setBackgroundResource(R.drawable.user_input_fashion_button_2);
                user_input_fashion_button_3.setBackgroundResource(R.drawable.user_input_fashion_button_3);
                user_input_fashion_button_4.setBackgroundResource(R.drawable.user_input_fashion_button_4_blue);
                shoes.setVisibility(View.VISIBLE);
                outer.setVisibility(View.INVISIBLE);
                top.setVisibility(View.INVISIBLE);
                pants.setVisibility(View.INVISIBLE);
            }
            return false;
        });
        boots.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_shoes.setBackgroundResource(R.mipmap.boots_foreground);
                boots.setText("SELECTED");
                sneakers.setText("");
                sandals.setText("");
            }
            return false;
        });
        sneakers.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_shoes.setBackgroundResource(R.mipmap.sneakers_foreground);
                boots.setText("");
                sneakers.setText("SELECTED");
                sandals.setText("");
            }
            return false;
        });
        sandals.setOnTouchListener((view,motionEvent)-> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                input_shoes.setBackgroundResource(R.mipmap.sandles_foreground);
                boots.setText("");
                sneakers.setText("");
                sandals.setText("SELECTED");
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
    }
}