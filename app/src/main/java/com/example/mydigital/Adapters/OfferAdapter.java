package com.example.mydigital.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.Models.Offer;
import com.example.mydigital.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferViewHolder> {
    private Context context;
    private List<Offer> offerList;

    public OfferAdapter(Context context) {
        this.context = context;
    }

    public OfferAdapter(List<Offer> offerList) {
        this.offerList = offerList;
    }

    @Override
    public OfferViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offers,parent,false);
        return new OfferViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  OfferViewHolder holder, int position) {
        Offer offer = offerList.get(position);
        holder.textViewNameOffer.setText(offer.getName());
        holder.textViewOffer.setText(offer.getOffer());
        holder.imageViewOffer.setImageResource(offer.getImage());

    }

    @Override
    public int getItemCount() {
        return offerList.size();
    }
}
