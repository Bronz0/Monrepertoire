package com.bronzo.monrepertoire.data;

import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class AmiRespsitory {
    LiveData<List<Ami>> mesAmis;
    AmiDao amiDao;

    public AmiRespsitory(Context context){
        AmiDataBase db = AmiDataBase.getDataBase(context); // recuperer la base de donnees
        amiDao = db.amiDao(); // recuperer le dao apartir de la base
        mesAmis = amiDao.getAllAmi(); // recuperer la liste des amis
    }

    public LiveData<List<Ami>> getMesAmis(){
        return mesAmis;
    }

    public void ajouterAmi(Ami ami){
        //amiDao.ajouterAmi(ami);
        new AjoutSynchronne(amiDao).execute(ami); // utiliser un thread pour que l'app soit pas bloquer en attendant la reponse de la bdd
    }

    private class AjoutSynchronne extends AsyncTask<Ami, Void, Void> {
        AmiDao amiDao;

        public AjoutSynchronne(AmiDao amiDao) {
            this.amiDao = amiDao;
        }

        @Override
        protected Void doInBackground(Ami... amis) {
            amiDao.ajouterAmi(amis[0]);
            return null;
        }
    }


}
