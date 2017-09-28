package com.test.android.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;


public class SQLITEOPENHELPER extends SQLiteOpenHelper {

    public SQLITEOPENHELPER(Context context) {
        super(context, "CursorDemo", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS names ("
                + BaseColumns._ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT first VARCHAR, last VARCHAR)");
        db.execSQL("INSERT INTO NAMES_COLUMN (first, last) VALUES ('John', 'Doe')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Steps to upgrade the database for the new version ...
    }
}
