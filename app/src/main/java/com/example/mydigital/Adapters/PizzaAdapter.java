package com.example.mydigital.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.Models.Pizza;
import com.example.mydigital.R;
import com.example.mydigital.pizzadetail;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    private List<Pizza> pizzaList;
    private Context context;

    public PizzaAdapter(List<Pizza> pizzaList,Context context) {
        this.pizzaList = pizzaList;
        this.context = context;
    }

    @NotNull
    @Override

    public PizzaViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza,parent,false);
        return new PizzaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PizzaViewHolder holder, int position) {
        Pizza pizza=pizzaList.get(position);
        holder.textViewpizzaname.setText(pizza.getName());
        holder.textViewdeliveryhour.setText(pizza.getHour());
        holder.imageViewpizza.setImageResource((pizza.getImage()));
        holder.itempizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, pizzadetail.class);
                intent.putExtra("namePizza",pizza.getName());
                intent.putExtra("imagePizza",pizza.getImage());
                intent.putExtra("deliveryPizza",pizza.getHour());
                intent.putExtra("pricePizza",pizza.getPrice());
                intent.putExtra("namerestaurant",pizza.getNamerestaurant());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pizzaList.size();
    }
}
