package com.example.mipaissoado;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class conexionsql extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NOMBRE = "info_paises.db";
    public static final String TABLA_PAISES = "t_paises";
    public conexionsql(@Nullable Context context) {
       super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {



        sqLiteDatabase.execSQL("CREATE TABLE " + TABLA_PAISES + "(" +
        "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
        "pais TEXT NOT NULL," +         // hacerle otra base y dirigirlo aca
         "idioma TEXT NOT NULL," +
                //"bandera TEXT NOT NULL," +      //ver que onda xq es imagen
                "mapa TEXT NOT NULL," +         // "
                "capital TEXT NOT NULL," +
                "forma_de_gobierno TEXT NOT NULL," +
                "moneda TEXT NOT NULL," +
                "calidad_de_vida TEXT NOT NULL," +          //hacerle otra base y dirigirlo aca
                "clima_y_relieve TEXT NOT NULL)");      //hacerle otra base y dirigirlo aca

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
