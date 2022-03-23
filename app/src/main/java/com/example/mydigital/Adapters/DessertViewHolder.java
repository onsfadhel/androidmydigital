package com.example.mydigital.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.R;

import org.jetbrains.annotations.NotNull;

public class DessertViewHolder extends RecyclerView.ViewHolder {
    TextView textViewNameDessert;
    ImageView imageViewDessert;
    public DessertViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        textViewNameDessert=itemView.findViewById(R.id.textViewnamedessert);
        imageViewDessert=itemView.findViewById(R.id.imageViewdessert1);

    }
}
