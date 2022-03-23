package com.example.mydigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class pizzadetail extends AppCompatActivity {
    TextView textViewnamerestaurant,textViewpizzaname,textViewpizzadelivery,textViewpizzaprice;
    ImageView imageViewpizzadetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzadetail);
        String namerestaurant=getIntent().getStringExtra("namerestaurant");
        String namepizza=getIntent().getStringExtra("namePizza");
        String hourpizza=getIntent().getStringExtra("deliveryPizza");
        int imagepizza=getIntent().getIntExtra("imagePizza",0);
        Float pricepizza=getIntent().getFloatExtra("pricePizza",0);
        textViewnamerestaurant=findViewById(R.id.textViewnamerestaurant);
        textViewpizzaname=findViewById(R.id.textViewpizzaname);
        textViewpizzadelivery=findViewById(R.id.textViewpizzadelivery);
        textViewpizzaprice=findViewById(R.id.textViewpizzaprice);
        imageViewpizzadetail=findViewById(R.id.imageViewpizzadetail);
        //
        setTitle(namepizza);
        textViewpizzaname.setText(namepizza);
        textViewnamerestaurant.setText(namerestaurant);
        textViewpizzadelivery.setText(hourpizza);
        textViewpizzaprice.setText(pricepizza+"dt");
        imageViewpizzadetail.setImageResource(imagepizza);

    }
}