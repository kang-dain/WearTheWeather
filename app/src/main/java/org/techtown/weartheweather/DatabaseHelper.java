package org.techtown.weartheweather;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

import androidx.annotation.Nullable;
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String databaseName = "SignLog.db";
    public DatabaseHelper(@Nullable Context context) {
        super(context, "SignLog.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create Table users(email TEXT primary key, password TEXT)");
        // user_input 테이블 생성
        MyDatabase.execSQL("create Table user_input(" +
                "date TEXT," +
                "temperature INTEGER," +
                "slider INTEGER," +
                "keyword1 TEXT," +
                "keyword2 TEXT," +
                "keyword3 TEXT," +
                "fashion_outer INTEGER," +
                "fashion_top INTEGER," +
                "fashion_pants INTEGER," +
                "fashion_shoes INTEGER" +
                ")");
    }
    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");
        //
        MyDB.execSQL("drop Table if exists user_input");
    }
    public Boolean insertData(String email, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email", email);
        contentValues.put("password", password);
        long result = MyDatabase.insert("users", null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Boolean checkEmail(String email){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where email = ?", new String[]{email});
        if(cursor.getCount() > 0) {
            return true;
        }else {
            return false;
        }
    }
    public Boolean checkEmailPassword(String email, String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where email = ? and password = ?", new String[]{email, password});
        if (cursor.getCount() > 0) {
            return true;
        }else {
            return false;
        }
    }

    //닉네임을 저장할 테이블 생성
    public void createNicknameTable() {
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        MyDatabase.execSQL("create Table nicknames(email TEXT primary key, nickname TEXT)");
    }

    //닉네임을 nicknames 테이블에 삽입하는 메서드
    public Boolean insertNickname(String email, String nickname) {
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email", email);
        contentValues.put("nickname", nickname);
        long result = MyDatabase.insert("nicknames", null, contentValues);
        return result != -1;
    }

    public boolean isNicknameTableExists() {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='nicknames'", null);
        boolean exists = cursor.getCount() > 0;
        cursor.close();
        return exists;
    }

    // 사용자 입력값
    public Boolean insertUserInputData(String date, int temperature, int slider, String keyword1, String keyword2,
                                               String keyword3, int fashion_outer, int fashion_top,
                                               int fashion_pants, int fashion_shoes) {
        SQLiteDatabase MyDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("date", date);
        contentValues.put("temperature", temperature);
        contentValues.put("slider", slider);
        contentValues.put("keyword1", keyword1);
        contentValues.put("keyword2", keyword2);
        contentValues.put("keyword3", keyword3);
        contentValues.put("fashion_outer", fashion_outer);
        contentValues.put("fashion_top", fashion_top);
        contentValues.put("fashion_pants", fashion_pants);
        contentValues.put("fashion_shoes", fashion_shoes);

        int rowsAffected = MyDatabase.update("user_input", contentValues,
                "date = ? AND temperature = ?", new String[]{date, String.valueOf(temperature)});

        if (rowsAffected > 0) {
            // 업데이트가 성공한 경우
            return true;
        } else {
            // 해당 조건의 데이터가 없는 경우, 새로운 데이터로 추가
            long result = MyDatabase.insert("user_input", null, contentValues);
            return result != -1;
        }
    }
    public boolean isInsertOperation(String date, int temperature) {
        SQLiteDatabase MyDatabase = this.getReadableDatabase();

        Cursor cursor = MyDatabase.rawQuery("SELECT * FROM user_input WHERE date = ? AND temperature = ?",
                new String[]{date, String.valueOf(temperature)});

        boolean isInsert = cursor.getCount() == 0;
        cursor.close();
        return isInsert;
    }
    // 데이터 입력 유효성 검사 메서드 추가
    public boolean someDataIsMissing(int slider, int fashionOuter, int fashionTop, int fashionPants, int fashionShoes,
                                     String keyword1, String keyword2, String keyword3) {
        return slider == 0 || fashionOuter == 0 || fashionTop == 0 || fashionPants == 0 || fashionShoes == 0 ||
                TextUtils.isEmpty(keyword1) || TextUtils.isEmpty(keyword2) || TextUtils.isEmpty(keyword3);
    }

}