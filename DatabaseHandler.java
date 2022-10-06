package com.example.slip28q2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "college_data";
    private static final String TABLE_CONTACTS = "student";
    private static final String KEY_ROLL_NO = "roll_no";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_CONTACT="contact";
    private static final String KEY_GENDER="gender";
    private static final String KEY_STD="std";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
                + KEY_ROLL_NO + "TEXT" + KEY_NAME + " TEXT"
                + KEY_EMAIL + "TEXT" + KEY_CONTACT + "TEXT"
                + KEY_GENDER+ "TEXT" +KEY_STD+ "TEXT"+ ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        onCreate(db);
    }

    void addContact(Details details) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ROLL_NO, details.getRoll_no());
        values.put(KEY_NAME, details.getName());
        values.put(KEY_EMAIL,details.getEmail());
        values.put(KEY_CONTACT,details.getContact());
        values.put(KEY_GENDER,details.getGender());
        values.put(KEY_STD,details.getStd());

        db.insert(TABLE_CONTACTS, null, values);

        db.close();
    }
}
