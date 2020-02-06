package com.bronzo.monrepertoire.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bronzo.monrepertoire.R;

public class ListAmiAdapter extends RecyclerView.Adapter<ListAmiAdapter.AmiViewHolder> {

    @NonNull
    @Override
    public AmiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AmiViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AmiViewHolder extends RecyclerView.ViewHolder{
        TextView tv_nom, tv_prenom, tv_tel;

        public AmiViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nom = itemView.findViewById(R.id.tv_nom);
            tv_prenom = itemView.findViewById(R.id.tv_prenom);
            tv_tel = itemView.findViewById(R.id.tv_tel);
        }
    }
}
