package ru.startandroid.weath;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.TownViewHolder> {

    public static class TownViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView townName;
        TownViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            townName = (TextView)itemView.findViewById(R.id.town_name);
        }
    }
    Context con;
    List<Town> towns;
    Bundle bn;
    View v;
    RVAdapter(List<Town> towns, Context context, Bundle bundle, View view){
        this .towns = towns;
        con = context;
        bn = bundle;
        v = view;
    }


    @NonNull
    @Override
    public RVAdapter.TownViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.maket_1, parent, false);
        RVAdapter.TownViewHolder tvh = new RVAdapter.TownViewHolder(v);
        return tvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.TownViewHolder holder, final int position) {
        holder.townName.setText(towns.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String par;
                par = towns.get(position).name;

                RetrofitHelper rtHelper = new RetrofitHelper();
                rtHelper.toWeatherFragment(par, bn, v);

            }
        });
    }

    @Override
    public int getItemCount() { return towns.size(); }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super .onAttachedToRecyclerView(recyclerView);
    }

}
