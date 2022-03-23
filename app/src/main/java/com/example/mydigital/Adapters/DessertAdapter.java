package com.example.mydigital.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.Models.Dessert;
import com.example.mydigital.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DessertAdapter extends RecyclerView.Adapter<DessertViewHolder> {
    List<Dessert> dessertList;

    public DessertAdapter(List<Dessert> dessertList) {
        this.dessertList = dessertList;
    }

    @NonNull
    @Override
    public DessertViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dessert,parent,false);
        return new DessertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DessertViewHolder holder, int position) {
        Dessert dessert=dessertList.get(position);
        holder.textViewNameDessert.setText(dessert.getName());
        holder.imageViewDessert.setImageResource(dessert.getImage());

    }

    @Override
    public int getItemCount() {
        return dessertList.size();
    }
}
