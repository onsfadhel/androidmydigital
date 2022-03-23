package com.example.mydigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    TextView textviewemail;
    TextView textviewpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void gohome(View view) {
        SharedPreferences sharedPreferences=getSharedPreferences("userinformations", Context.MODE_PRIVATE);
        String email=sharedPreferences.getString("email","email not found");
        String password=sharedPreferences.getString("password","password not found");
        textviewemail=findViewById(R.id.editTextTextEmailAddress);
        textviewpassword=findViewById(R.id.editTextTextPassword4);
        String logemail=textviewemail.getText().toString();
        String logpassword=textviewpassword.getText().toString();
        //declaration du var is connected
        Boolean isconnected=sharedPreferences.getBoolean("isconnected",false);
        if (!(email.equals(logemail))){
            Toast.makeText(this,"email is not found",Toast.LENGTH_LONG).show();
        }
        else if(!(password.equals(logpassword))){
            Toast.makeText(this,"password is not found",Toast.LENGTH_LONG).show();
        }else{
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putBoolean("isconnected",true);
            editor.commit();
            Intent intent=new Intent(signin.this,MainActivity.class);
            startActivity(intent);
        }
    }

    public void goregister(View view) {

        startActivity(new Intent(signin.this,signup.class));
    }

}