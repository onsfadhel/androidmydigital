package com.example.mydigital.ui.home;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydigital.Adapters.DessertAdapter;
import com.example.mydigital.Adapters.OfferAdapter;
import com.example.mydigital.Models.Dessert;
import com.example.mydigital.Models.Offer;
import com.example.mydigital.R;
import com.example.mydigital.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView recyclerview;
    RecyclerView recyclerViewDessert;
    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        recyclerview=root.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setHasFixedSize(true);
        List<Offer> offerList=new ArrayList<>();
        offerList.add(new Offer("sandwitch","10%", R.drawable.sandwich));
        offerList.add(new Offer("Pizza 4 saisons","20%",R.drawable.p2));
        offerList.add(new Offer("Burger","10%",R.drawable.burger));
        offerList.add(new Offer("glace","30%",R.drawable.d1));
        OfferAdapter offerAdapter= new OfferAdapter(offerList);
        recyclerview.setAdapter(offerAdapter);
        recyclerViewDessert=root.findViewById(R.id.recyclerviewdessert);
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        recyclerViewDessert.setLayoutManager(linearLayoutManager2);
        recyclerViewDessert.setHasFixedSize(true);
        List<Dessert> dessertList=new ArrayList<>();
        dessertList.add(new Dessert("Donuts",R.drawable.dessert1));
        dessertList.add(new Dessert("Glace Paradice",R.drawable.dessert2));
        dessertList.add(new Dessert("Cake chocolaat",R.drawable.dessert3));
        dessertList.add(new Dessert("Jwajem",R.drawable.d2));
        DessertAdapter dessertAdapter=new DessertAdapter(dessertList);
        recyclerViewDessert.setAdapter(dessertAdapter);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("userinformations", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("name","your name not found");
        getActivity().setTitle("Hello"+" "+name);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}