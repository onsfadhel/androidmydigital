package com.example.mydigital.ui.profile;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mydigital.R;
import com.example.mydigital.databinding.FragmentModifyprofileBinding;

public class ModifyProfileFragment extends Fragment {

    private ModifyProfileViewModel slideshowViewModel;
    private FragmentModifyprofileBinding binding;
    EditText edittextmailprofile, edittextadresseprofile,edittextphoneprofile,edittextnameprofile,edittextfamilynameprofile;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(ModifyProfileViewModel.class);

        binding = FragmentModifyprofileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textSlideshow;
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        edittextmailprofile = root.findViewById(R.id.editTextTextEmailAddress4);
        edittextadresseprofile=root.findViewById(R.id.editTextTextPostalAddress2);
        edittextphoneprofile=root.findViewById(R.id.editTextPhone2);
        edittextnameprofile=root.findViewById(R.id.textInputLayout);
        edittextfamilynameprofile=root.findViewById(R.id.familyname);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("userinformations", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email", "email not found");
        String location=sharedPreferences.getString("location","Adress not found");
        String phone=sharedPreferences.getString("phoneNumber","your phone number not found");
        String name=sharedPreferences.getString("name","your name not found");
        String familyname=sharedPreferences.getString("family name","family name not found");
        edittextmailprofile.setText(email);
        edittextphoneprofile.setText(phone);
        edittextadresseprofile.setText(location);
        edittextnameprofile.setText(name);
        edittextfamilynameprofile.setText(familyname);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}