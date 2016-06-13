package com.example.hgmovil.inacapp;
import java.util.ArrayList;
import java.util.HashMap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DBController  extends SQLiteOpenHelper
{
    public DBController(Context applicationcontext)
    {
        super(applicationcontext, "DBAndroid.db", null, 1);
    }

    public void onCreate(SQLiteDatabase database)
    {
        String query;
        query = "CREATE TABLE Alumno ( Rut INTEGER PRIMARY KEY, Nombre TEXT, Contraseña TEXT, Correo TEXT, Carrera_id TEXT)";
        database.execSQL(query);
    }
    public void onUpgrade(SQLiteDatabase database, int version_old, int current_version) {
        String query;
        query = "DROP TABLE IF EXISTS Alumno";
        database.execSQL(query);
        onCreate(database);
    }
    public void insertRut(HashMap<String, String> queryValues) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Rut", queryValues.get("Rut"));
        values.put("udpateStatus", "no");
        database.insert("Alumno", null, values);
        database.close();
    }
    public ArrayList<HashMap<String, String>> getAllUsers() {
        ArrayList<HashMap<String, String>> wordList;
        wordList = new ArrayList<HashMap<String, String>>();
        String selectQuery = "SELECT  * FROM Alumno";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("Rut", cursor.getString(0));
                map.put("Contraseña", cursor.getString(1));
                wordList.add(map);
            } while (cursor.moveToNext());
        }
        database.close();
        return wordList;
    }


    public void insertContraseña(HashMap<String, String> queryValues) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("Contraseña", queryValues.get("Contraseña"));
        values.put("udpateStatus", "no");
        database.insert("Alumno", null, values);
        database.close();
    }
    public String composeJSONfromSQLite() {
        ArrayList<HashMap<String, String>> wordList;
        wordList = new ArrayList<HashMap<String, String>>();
        String selectQuery = "SELECT  * FROM Alumno where udpateStatus = '" + "no" + "'";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("Rut", cursor.getString(0));
                map.put("Contraseña", cursor.getString(1));
                wordList.add(map);
            } while (cursor.moveToNext());
        }
        database.close();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(wordList);
    }
    //Obtener estado de sincronización de SQLite
    public String getSyncStatus()
    {
        String msg = null;
        if(this.dbSyncCount() == 0){
            msg = "SQLite y MySQLRemota  Sincronizada!";
        }
        else
        {
            msg = "DB No sincronizada";
        }
        return msg;
    }

    public int dbSyncCount(){
        int count = 0;
        String selectQuery = "SELECT  * FROM Alumno where udpateStatus = '"+"no"+"'";
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);
        count = cursor.getCount();
        database.close();
        return count;
    }

    //Actualizar el estado de sincronización contra cada ID de usuario
    public void updateSyncStatus(String id, String status){
        SQLiteDatabase database = this.getWritableDatabase();
        String updateQuery = "Update Alumno set udpateStatus = '"+ status +"' where Rut="+"'"+ id +"'";
        Log.d("query",updateQuery);
        database.execSQL(updateQuery);
        database.close();
    }


}