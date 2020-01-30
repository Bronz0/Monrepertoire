package com.bronzo.monrepertoire.data;

import android.content.Context;
import android.os.strictmode.InstanceCountViolation;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.Insert;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Ami.class}, version = 1, exportSchema = false)
public abstract class AmiDataBase extends RoomDatabase {

    public abstract AmiDao amiDao();

    private static AmiDataBase INSTANCE;

    public static AmiDataBase getDataBase(Context context){


        if(INSTANCE == null){ // a sertain moument la ram du tlfn sera pleine donc certain var serons stockees dans le cache
            synchronized (AmiDataBase.class){ // si la variable est dans le cache
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context, AmiDataBase.class, "amiDatabase.db").build();
                }
            }
        }
       return INSTANCE;
    }
}

