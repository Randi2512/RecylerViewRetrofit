package com.example.recyclerviewretrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private ArrayList<Result> arrayList;

    public Adapter(ArrayList<Result> marrayList){
        arrayList = marrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        // Get position of MyViewHolder class
        holder.name.setText(arrayList.get(position).getNama());
        holder.email.setText(arrayList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    // This ViewHolder of RecycleView
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name,email;
        public MyViewHolder(View itemView) {
            super(itemView);

            // Find ID of layout
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);
        }
    }

    public void setData(ArrayList<Result> newlist) {
        this.arrayList = newlist;
    }
}
