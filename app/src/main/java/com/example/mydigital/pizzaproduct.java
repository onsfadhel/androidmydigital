package com.example.mydigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mydigital.Adapters.PizzaAdapter;
import com.example.mydigital.Models.Pizza;

import java.util.ArrayList;
import java.util.List;

public class pizzaproduct extends AppCompatActivity {
    RecyclerView recyclerViewPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzaproduct);
        setTitle("Our Pizzas");
        recyclerViewPizza=findViewById(R.id.recyclerviewpizza);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerViewPizza.setLayoutManager(linearLayoutManager);
        recyclerViewPizza.setHasFixedSize(true);
        List<Pizza> pizzaList=new ArrayList<>();
        pizzaList.add(new Pizza("pizza 4 saisons","30min",R.drawable.p4,20,"piacere wood fire pizza"));
        pizzaList.add(new Pizza("Classique végétirienne ","30min",R.drawable.p2,25,"Plan B"));
        pizzaList.add(new Pizza("pizza de la mer","1h",R.drawable.p1,30,"Kfc"));
        pizzaList.add(new Pizza("Cheese pizza","1h",R.drawable.p3,25,"I cheese"));
        pizzaList.add(new Pizza("Classique végétirienne pizza","30min",R.drawable.p2,28,"piacere wood fire pizza"));
        pizzaList.add(new Pizza("pizza de la mer","1h",R.drawable.p1,25,"Plan B"));
        pizzaList.add(new Pizza("Cheese pizza","1h",R.drawable.p3,30,"KFC"));
        pizzaList.add(new Pizza("pizza 4 saisons","30min",R.drawable.p4,15,"Pizza Hot"));
        PizzaAdapter pizzaAdapter=new PizzaAdapter(pizzaList,pizzaproduct.this);
        recyclerViewPizza.setAdapter(pizzaAdapter);


    }
}