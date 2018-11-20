package dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import OpenHelper.DBCon;

public class PeriodoDAO extends DBCon{
    DBCon con;
    Context context;
    SQLiteDatabase db;
    Cursor cur;
    String sql;

    public PeriodoDAO(Context context) {
        super(context);
        this.context=context;
    }
}
