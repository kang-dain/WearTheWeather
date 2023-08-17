package org.techtown.weartheweather;

import static java.sql.Types.NULL;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class calender_daily extends AppCompatActivity {
    private TextView dateEditText;
    private TextView keywordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_daily);


        // 이전 액티비티에서 전달받은 날짜 정보 받기
        dateEditText = findViewById(R.id.DATE);
        int year = getIntent().getIntExtra("year", -1);
        int month = getIntent().getIntExtra("month", -1);
        int day = getIntent().getIntExtra("day", -1);

        if (year != -1 && month != -1 && day != -1) {
            String selectedDate = year + "년 " + month + "월 " + day + "일";
            dateEditText.setText(selectedDate); // 선택한 날짜를 EditText에 설정
        }

        //이전 액티비티에서 전달받은 키워드 정보 받기
        keywordText = findViewById(R.id.KEYWORD);
        Intent intent = getIntent();
        String keyword1 = intent.getStringExtra("keyword1");
        String keyword2 = intent.getStringExtra("keyword2");
        String keyword3 = intent.getStringExtra("keyword3");

        if (keyword1 != null) {
            if (keyword2 != null && keyword3 !=null){
                keywordText.setText("#"+keyword1+" #"+keyword2+" #"+keyword3);
            } else if (keyword2 != null && keyword3 == null) {
                keywordText.setText("#"+keyword1+" #"+keyword2);
            } else if (keyword2 == null && keyword3 != null) {
                keywordText.setText("#"+keyword1+" #"+keyword3);
            }
        } else {
            if (keyword2 != null && keyword3 != null){
                keywordText.setText("#"+keyword2+" #"+keyword3);
            } else if (keyword2 != null && keyword3 == null) {
                keywordText.setText("#"+keyword2);
            } else if (keyword2 == null && keyword3 != null) {
                keywordText.setText("#"  + keyword3);
            }
        }

        // 이전 액티비티에서 전달받은 seekbar data 수신
        int receivedSliderValue = getIntent().getIntExtra("sliderValue", 0);
        SeekBar seekBar = findViewById(R.id.seekBar3);
        seekBar.setProgress(receivedSliderValue);

        // 이전 액티비티에서 전달받은 temperature 수신
        TextView tempText = findViewById(R.id.TEMP);
        int receicedTemp = getIntent().getIntExtra("tempValue", 0);
        tempText.setText(receicedTemp);


        
        ImageButton calender_daily_button1 = (ImageButton) findViewById(R.id.calender_daily_button1);
        calender_daily_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnCaptureClick(view);
                //ImageView calenderDailyButton3 = findViewById(R.id.calender_daily_button3);
                //calenderDailyButton3.setVisibility(View.VISIBLE);
                View rootView = getWindow().getDecorView();
                File screenShot = ScreenShot(rootView);
                if (screenShot != null) {
                    // 이미지 공유 기능 호출
                    shareImage(screenShot);
                }
            }
        });

        ImageView calender_daily_button3 = (ImageView) findViewById(R.id.calender_daily_button3);
        calender_daily_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView calender_daily_button3 = (ImageView)findViewById(R.id.calender_daily_button3);
                calender_daily_button3.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton calender_daily_common_closebutton = (ImageButton) findViewById(R.id.calender_daily_common_closebutton);
        calender_daily_common_closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
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
    //캡쳐버튼클릭
    public void mOnCaptureClick(View v){
        //전체화면
        View rootView = getWindow().getDecorView();

        File screenShot = ScreenShot(rootView);
        if(screenShot!=null){
            String imagePath = screenShot.getAbsolutePath(); // 이미지 파일의 경로
            //갤러리에 추가
            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + imagePath)));

            // 이미지 공유 기능 호출
            shareImage(screenShot);
        }
    }

    //화면 캡쳐하기
    public File ScreenShot(View view){
        view.setDrawingCacheEnabled(true);  //화면에 뿌릴때 캐시를 사용하게 한다

        Bitmap screenBitmap = view.getDrawingCache();   //캐시를 비트맵으로 변환

        String filename = "screenshot.png";
        File file = new File(Environment.getExternalStorageDirectory()+"/Pictures", filename);  //Pictures폴더 screenshot.png 파일
        FileOutputStream os = null;
        try{
            os = new FileOutputStream(file);
            screenBitmap.compress(Bitmap.CompressFormat.PNG, 90, os);   //비트맵을 PNG파일로 변환
            os.close();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

        view.setDrawingCacheEnabled(false);
        return file;
    }
    // 이미지 공유 메소드
    private void shareImage(File imageFile) {
        // 이미지 파일의 경로를 지정해야 합니다.
        String imagePath = "/sdcard/Pictures/screenshot.png";

        // 이미지 파일의 경로로부터 Uri 생성
        Uri screenshotUri = Uri.parse(imagePath);

        // 공유 인텐트 생성
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("image/*"); // 이미지 파일 타입을 지정

        // 이미지 Uri를 인텐트에 추가
        sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);

        // 공유할 수 있는 앱을 선택할 수 있는 액티비티 실행
        startActivity(Intent.createChooser(sharingIntent, "이미지 공유하기"));
    }
    public void onBackPressed() {
        // 뒤로가기 버튼을 눌렀을 때 원하는 동작을 수행
        // 예: 특정 조건을 검사하고 동작을 수행하거나, 데이터를 저장한 후 종료 등

        // 원래 뒤로가기 동작 수행 (액티비티 종료)
        super.onBackPressed();
    }
}