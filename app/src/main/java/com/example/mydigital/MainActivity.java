package com.example.mydigital;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

import com.example.mydigital.Adapters.OfferAdapter;
import com.example.mydigital.Models.Offer;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    RecyclerView recyclerViewOffer;
    CardView cardViewgopizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        recyclerViewOffer=findViewById(R.id.recyclerviewoffer);
//         LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerViewOffer.setLayoutManager(layoutManager);
//        recyclerViewOffer.setHasFixedSize(true);
//        List<Offer> offerList=new ArrayList<>();
//        offerList.add(new Offer("kfc Sandwich","10%",R.drawable.sandwich));
//        offerList.add(new Offer("Pizza 4 saisons","20%",R.drawable.p4));
//        offerList.add(new Offer("Burger","10%",R.drawable.p1));
//        offerList.add(new Offer("kfc Sandwich","10%",R.drawable.sandwich));
//        OfferAdapter adapter= new OfferAdapter(offerList);
//       recyclerViewOffer.setAdapter(adapter);
//        SharedPreferences sharedPreferences = getSharedPreferences("userinformations", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        String name=sharedPreferences.getString("name","your name not found");
//        editor.commit();
//        setTitle("Hello"+name);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
//        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        setTitle("Digital Food");
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_favorites, R.id.nav_modifyprofile,R.id.nav_aboutus,R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        cardViewgopizza=findViewById(R.id.gopizza);
        cardViewgopizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,pizzaproduct.class);
                startActivity(intent);
            }
        });
//        buttongopizza.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,pizzaproduct.class);
//                startActivity(intent);
//
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void logout(MenuItem item) {
        SharedPreferences sharedPreferences = getSharedPreferences("userinformations", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isconnected",false);
        editor.commit();
        Intent intent=new Intent(MainActivity.this,signin.class);
        startActivity(intent);
    }
}