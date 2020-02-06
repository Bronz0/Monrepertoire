package com.bronzo.monrepertoire.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.bronzo.monrepertoire.data.Ami;
import com.bronzo.monrepertoire.data.AmiRespsitory;

import java.util.List;

public class AmiViewModel extends AndroidViewModel {

    AmiRespsitory amiRespsitory;
    LiveData<List<Ami>> mesAmis;

    public AmiViewModel(@NonNull Application application) {
        super(application);
        amiRespsitory = new AmiRespsitory(application);
        mesAmis = amiRespsitory.getMesAmis();
    }

    public LiveData<List<Ami>> getMesAmis(){
        return mesAmis;
    }

    public void addContact(Ami ami){
        amiRespsitory.ajouterAmi(ami);
    }

}
