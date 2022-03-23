package com.example.mydigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextConfirmPassword;
    EditText editTextPhone;
    EditText editTextLocalisation;
    TextView TextViewError;
    EditText edittextname;
    EditText edittextfname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void goLog(View view) {
        edittextname=findViewById(R.id.editTextTextPersonName);
        edittextfname=findViewById(R.id.editTextTextPersonName2);
        editTextEmail=findViewById(R.id.editTextTextEmailAddress2);
        editTextPassword=findViewById(R.id.editTextTextPassword);
        editTextConfirmPassword=findViewById(R.id.editTextNumberPassword);
        editTextPhone=findViewById(R.id.editTextPhone);
        editTextLocalisation=findViewById(R.id.editTextTextPostalAddress);
        TextViewError=findViewById(R.id.textViewError);
        String email,password,confirmPassword,location,phone,name,familyname;
        name=edittextname.getText().toString();
        familyname=edittextfname.getText().toString();
        email=editTextEmail.getText().toString();
        phone=editTextPhone.getText().toString();
        password=editTextPassword.getText().toString();
        confirmPassword=editTextConfirmPassword.getText().toString();
        location=editTextLocalisation.getText().toString();
        if((email.isEmpty()) ||(password.isEmpty()) || (location.isEmpty()) || (phone.isEmpty())|| (name.isEmpty())|| (familyname.isEmpty())){
            TextViewError.setText("remplir tous les champs");
            TextViewError.setTextColor(Color.parseColor("#F44336"));
        }
        else if(!(password.equals(confirmPassword))){
            TextViewError.setText("! 2 passwords are incompatible ");
            TextViewError.setTextColor(Color.parseColor("#F44336"));

        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            TextViewError.setText("! email invalide");
            TextViewError.setTextColor(Color.parseColor("#F44336"));

        }
        else if(!Patterns.PHONE.matcher(phone).matches()){
            TextViewError.setTextColor(Color.parseColor("#F44336"));

        }
        else if(password.length()<8){
            TextViewError.setText("! Veuillez entrer un mot de passe plus long de 8 caracteres");
            TextViewError.setTextColor(Color.parseColor("#F44336"));
        }
        else{
            Intent intent=new Intent(signup.this,signin.class);
            intent.putExtra("email",email);
            intent.putExtra("location",location);
            intent.putExtra("phoneNumber",phone);
            intent.putExtra("password",password);
            //créer un fichier
            SharedPreferences sharedPreferences=getSharedPreferences("userinformations", Context.MODE_PRIVATE);
            //créer une copie du fichier
            SharedPreferences.Editor editor= sharedPreferences.edit();
            editor.putString("email",email);
            editor.putString("password",password);
            editor.putString("location",location);
            editor.putString("phoneNumber",phone);
            editor.putString("name",name);
            editor.putString("family name",familyname);
            editor.putBoolean("isconnected",false);
            //save modification
            editor.commit();
            startActivity(intent);
        }
    }
}