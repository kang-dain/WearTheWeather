package org.techtown.weartheweather;


import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class calender_daily extends AppCompatActivity {
    private TextView dateEditText;
    private TextView keywordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_daily);

        // 이전 액티비티에서 전달받은 데이터 받기
        Intent currentDateintent = getIntent();
        String currentDate = currentDateintent.getStringExtra("currentDate");

        // 날짜 정보를 TextView에 설정
        dateEditText = findViewById(R.id.DATE);
        if (currentDate != null) {
            dateEditText.setText(currentDate);
        }

        // 이전 액티비티에서 전달받은 날짜 정보 받기
        dateEditText = findViewById(R.id.DATE);
        int year = getIntent().getIntExtra("year", -1);
        int month = getIntent().getIntExtra("month", -1);
        int day = getIntent().getIntExtra("day", -1);

        if (year != -1 && month != -1 && day != -1) {
            //String selectedDate = year + "년 " + month + "월 " + day + "일";
            String selectedDate = String.format("%04d-%02d-%02d", year, month, day);

            // 날짜 정보를 TextView에 설정
            TextView dateEditText = findViewById(R.id.DATE);
            dateEditText.setText(selectedDate);
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
        // tempText.setText(receicedTemp); -> 지우면 오류는 없어지만 설정도 안돼

        // 이전 액티비티에서 전달받은 fashion 수신
        int fashion_Outer = getIntent().getIntExtra("fashionOuter",0);
        int fashion_Top = getIntent().getIntExtra("fashionTop",0);
        int fashion_Pants = getIntent().getIntExtra("fashionPants",0);
        int fashion_Shoes = getIntent().getIntExtra("fashionShoes",0);


        /**
         List<user_input> receivedDataList = (List<user_input>) getIntent().getSerializableExtra("dataList");
         */

        /**
        Intent intent = getIntent();
        String retrievedValue = intent.getStringExtra("retrievedValue");
        */

        /** 변수명 수정해서 실행해봤으나 오류 많아서 가독성 좋은 수정 전 버전으로 주석처리
         setContentView(R.layout.activity_calendar_daily);

         String selectedDate = getIntent().getStringExtra("selected_date");

         DatabaseHelper dbHelper = new DatabaseHelper(this);

         UserInputData inputData = dbHelper.getUserInputData(selectedDate);

         if (inputData != null) {
         TextView temperatureTextView = findViewById(R.id.temperatureTextView);
         TextView keywordTextView = findViewById(R.id.keywordTextView);

         temperatureTextView.setText("Temperature: " + inputData.getTemperature());
         keywordTextView.setText("Keywords: " + inputData.getKeyword1() + ", " + inputData.getKeyword2() + ", " + inputData.getKeyword3());
         */

        /**
         ArrayList<String> userDataList = getIntent().getStringArrayListExtra("userInputList");

         if (userDataList != null) {
             StringBuilder data = new StringBuilder();
             for (String userData : userDataList) {
                data.append(userData).append("\n");
             }
            textView.setText(data.toString());
         }
         */

        /** ver 11
        Cursor cursor = getIntent().getParcelableExtra("userInputCursor");
        if (cursor != null && cursor.moveToFirst()) {
            StringBuilder data = new StringBuilder();

            do {
                String date = cursor.getString(cursor.getColumnIndex("date"));
                int temperature = cursor.getInt(cursor.getColumnIndex("temperature"));

                data.append("Date: ").append(date).append(", Temperature: ").append(temperature).append("\n");
            } while (cursor.moveToNext());

            textView.setText(data.toString());

            cursor.close();
         */
        /** 가져오는 값 변수가 다르지만 변형시도해봄 ver13
         DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());

         String query = "SELECT * FROM " + DatabaseHelper.TABLE_NAME +
         " WHERE temperature BETWEEN ? AND ? " +
         " AND strftime('%m', date) IN (" + getSelectedMonths() + ")" +
         " ORDER BY ABS(temperature - ?) ASC, temperature ASC";

         Cursor cursor = dbHelper.getReadableDatabase().rawQuery(query, new String[]{String.valueOf(temperature - 3), String.valueOf(temperature + 3), String.valueOf(temperature)});

         StringBuilder userData = new StringBuilder();

         while (cursor.moveToNext()) {
         int userTemperature = cursor.getInt(cursor.getColumnIndex("temperature"));
         String date = cursor.getString(cursor.getColumnIndex("date"));

         userData.append("\n\n▶ 날짜: ").append(date).append("\n");
         userData.append(" 온도: ").append(userTemperature).append("°C\n\n");
         }
         cursor.close();

         */
        ImageButton calender_daily_button1 = (ImageButton) findViewById(R.id.calender_daily_button1);
        calender_daily_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnCaptureClick(view);
                View rootView = getWindow().getDecorView();
                Bitmap screenShot = takeScreenShot(rootView);
                if (screenShot != null) {
                    // 이미지 공유 기능 호출
                    saveAndShareImage(screenShot);
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
                Intent intent = new Intent(getApplicationContext(), search_user.class);
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

    // 스크린샷 캡처
    private Bitmap takeScreenShot(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    // 이미지 저장 및 공유
    private void saveAndShareImage(Bitmap imageBitmap) {
        // 이미지 파일 저장
        ContentResolver contentResolver = getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MediaStore.Images.Media.DISPLAY_NAME, "screenshot.png");
        contentValues.put(MediaStore.Images.Media.MIME_TYPE, "image/png");

        // 이미지 파일을 외부 저장소의 Pictures 디렉토리에 저장
        Uri imageUri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        try {
            OutputStream outputStream = contentResolver.openOutputStream(imageUri);
            imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            outputStream.close();

            // 이미지를 공유하기 위한 인텐트 생성
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("image/*");
            sharingIntent.putExtra(Intent.EXTRA_STREAM, imageUri);

            // 공유할 수 있는 앱을 선택할 수 있는 액티비티 실행
            startActivity(Intent.createChooser(sharingIntent, "이미지 공유하기"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        view.setDrawingCacheEnabled(true);  //화면에 뿌릴때 캐시를 사용

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
    // 이미지 공유
    private void shareImage(File imageFile) {
        // 이미지 파일의 경로를 지정
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
        // 뒤로가기(액티비티 종료)
        super.onBackPressed();
    }

}