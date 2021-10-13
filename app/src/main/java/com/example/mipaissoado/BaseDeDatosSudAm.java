package com.example.mipaissoado;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class BaseDeDatosSudAm<context, DATABASE_NAME, DATABASE_VERSION> extends SQLiteAssetHelper {
    private static final String DATABASE_NAME= "basededatosext.db";
    private static final int DATABASE_VERSION= 1;

    //constructor
    public BaseDeDatosSudAm(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION );
    }


}
