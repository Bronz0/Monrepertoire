package com.bronzo.monrepertoire.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AmiDao {

    @Insert
    void ajouterAmi(Ami ami);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void modifierAmi(Ami ami);

    @Query("select * from ami_table")
    LiveData<List<Ami>> getAllAmi();
}
