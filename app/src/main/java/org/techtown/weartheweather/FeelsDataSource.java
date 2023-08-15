package org.techtown.weartheweather;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;


public class FeelsDataSource {
    /**다른 버전
    private SQLiteOpenHelper dbHelper;
    private SQLiteDatabase db;

    public FeelsDataSource(Context context) {
        dbHelper = new DatabaseHelper(context);
    }


    public void open() {
        db = dbHelper.getReadableDatabase();
    }

    public void close() {
        db.close();
        dbHelper.close();
    }



    public List<String> getSearchResults(String searchDate, int searchTemperature) {
        List<String> searchResults = new ArrayList<>();

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(
                "user_input",
                new String[]{"date", "temperature"},
                "date = ? AND temperature = ?",
                new String[]{searchDate, String.valueOf(searchTemperature)},
                null, null, null
        );
        //주석의 주석
        // 데이터베이스에서 temperature와 date 필드 가져오기
        Cursor cursor = db.query(
                "user_input",
                new String[]{"date", "temperature"},
                null,
                null,
                null,
                null,
                null
        );


        while (cursor.moveToNext()) {
            String date = cursor.getString(cursor.getColumnIndexOrThrow("date"));
            int temperature = cursor.getInt(cursor.getColumnIndexOrThrow("temperature"));

            // 이제 date와 temperature 값을 사용할 수 있음
            String result = "Date: " + date + "\nTemperature: " + temperature;
            searchResults.add(result);
        }

        cursor.close();
        db.close();

        return searchResults;
    }
}
*/


private SQLiteDatabase database;
private DatabaseHelper dbHelper;

public FeelsDataSource(Context context) {
    dbHelper = new DatabaseHelper(context);
}

public void open() {
    database = dbHelper.getWritableDatabase();
}

public void close() {
    dbHelper.close(); }


    /**
    public boolean insertUserInputData(String date, int temperature, int slider, String keyword1, String keyword2,
                                   String keyword3, int fashionOuter, int fashionTop,
                                   int fashionPants, int fashionShoes) {
    ContentValues values = new ContentValues();
    values.put("date", date);
    values.put("temperature", temperature);
    values.put("slider", slider);
    values.put("keyword1", keyword1);
    values.put("keyword2", keyword2);
    values.put("keyword3", keyword3);
    values.put("fashion_outer", fashionOuter);
    values.put("fashion_top", fashionTop);
    values.put("fashion_pants", fashionPants);
    values.put("fashion_shoes", fashionShoes);

    long result = database.insert("user_input", null, values);
    return result != -1;
}
     */


public List<String> getSearchResults(String searchDate, int searchTemperature) {
    List<String> searchResults = new ArrayList<>();

    //데이터베이스 연결 열기
    //SQLiteDatabase database1 = dbHelper.getReadableDatabase();

    Cursor cursor = database.query("user_input",
            new String[]{"date", "temperature", "slider", "keyword1", "keyword2", "keyword3"},
            "date = ? AND temperature = ?",
            new String[]{searchDate, String.valueOf(searchTemperature)},
            null, null, null);

    if (cursor != null) {
        while (cursor.moveToNext()) {
            String date = cursor.getString(cursor.getColumnIndexOrThrow("date"));
            int temperature = cursor.getInt(cursor.getColumnIndexOrThrow("temperature"));
            int slider = cursor.getInt(cursor.getColumnIndexOrThrow("slider"));
            String keyword1 = cursor.getString(cursor.getColumnIndexOrThrow("keyword1"));
            String keyword2 = cursor.getString(cursor.getColumnIndexOrThrow("keyword2"));
            String keyword3 = cursor.getString(cursor.getColumnIndexOrThrow("keyword3"));
            int fashionOuter = cursor.getInt(cursor.getColumnIndexOrThrow("fashion_outer"));
            int fashionTop = cursor.getInt(cursor.getColumnIndexOrThrow("fashion_top"));
            int fashionPants = cursor.getInt(cursor.getColumnIndexOrThrow("fashion_pants"));
            int fashionShoes = cursor.getInt(cursor.getColumnIndexOrThrow("fashion_shoes"));

            //searchResults.add("Keyword 1: " + keyword1 + "\nKeyword 2: " + keyword2 + "\nKeyword 3: " + keyword3);
            String result = "Date: " + date +
                    "\nTemperature: " + temperature +
                    "\nSlider: " + slider +
                    "\nKeyword 1: " + keyword1 +
                    "\nKeyword 2: " + keyword2 +
                    "\nKeyword 3: " + keyword3 +
                    "\nFashion Outer: " + fashionOuter +
                    "\nFashion Top: " + fashionTop +
                    "\nFashion Pants: " + fashionPants +
                    "\nFashion Shoes: " + fashionShoes;
            searchResults.add(result);
        }
        cursor.close();
    }

    //데이터베이스 연결 닫기
    //database1.close();

    return searchResults;
}
}


