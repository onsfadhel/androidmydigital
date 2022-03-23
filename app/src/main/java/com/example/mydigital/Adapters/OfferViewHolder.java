package com.example.mydigital.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.R;

import org.jetbrains.annotations.NotNull;

public class OfferViewHolder extends RecyclerView.ViewHolder {
    TextView textViewNameOffer;
    TextView textViewOffer;
    ImageView imageViewOffer;
    public OfferViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        textViewNameOffer =itemView.findViewById(R.id.textViewnameoffer);
        textViewOffer=itemView.findViewById(R.id.textViewoffer);
        imageViewOffer=itemView.findViewById(R.id.imageViewoffer);

    }
   /* public OfferViewHolder(@NonNull View itemView, RecyclerView.RecyclerListener listener) {
        super(itemView);
    }*/
}
