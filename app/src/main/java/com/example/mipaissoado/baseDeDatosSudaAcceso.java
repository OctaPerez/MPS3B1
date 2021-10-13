package com.example.mipaissoado;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class baseDeDatosSudaAcceso {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static baseDeDatosSudaAcceso instance;
    Cursor c= null;

    private baseDeDatosSudaAcceso(Context context){
        this.openHelper=new BaseDeDatosSudAm(context);
    }

    public static baseDeDatosSudaAcceso getInstance(Context context){
        if(instance==null){
            instance=new baseDeDatosSudaAcceso(context);
        }
        return instance;
    }
    public void open(){
        this.db=openHelper.getWritableDatabase();
    }
    public void close(){
        if(db!= null){
            this.db.close();
        }
    }

    public String Getpais(String nombre){
        c=db.rawQuery("seleccione pais del listado = '"+nombre+"'", new String[]{});
        StringBuffer buffer= new StringBuffer();
        while(c.moveToNext()){
            String pais = c.getString(0);
            buffer.append(""+pais);
        }
        return buffer.toString();
    }

}
