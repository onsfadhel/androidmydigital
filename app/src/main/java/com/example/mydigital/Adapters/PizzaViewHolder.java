package com.example.mydigital.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.R;

import org.jetbrains.annotations.NotNull;

public class PizzaViewHolder  extends RecyclerView.ViewHolder {
    TextView textViewpizzaname,textViewdeliveryhour;
    ImageView imageViewpizza;
    ConstraintLayout itempizza;
    public PizzaViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        textViewpizzaname=itemView.findViewById(R.id.textviewpizzaname);
        textViewdeliveryhour=itemView.findViewById(R.id.textviewdeliveryhour);
        imageViewpizza=itemView.findViewById(R.id.imageviewpizza);
        itempizza=itemView.findViewById(R.id.itempizza);
    }
}
