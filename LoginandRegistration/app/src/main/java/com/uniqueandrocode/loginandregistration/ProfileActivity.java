package com.uniqueandrocode.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.uniqueandrocode.loginandregistration.api.MyRetrofit;
import com.uniqueandrocode.loginandregistration.model.MyUserData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {
TextView username,useremail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        username=findViewById(R.id.username);
        useremail=findViewById(R.id.useremail);
        Intent intent=getIntent();
        String uname=intent.getStringExtra("name");
        String uemail=intent.getStringExtra("email");

        username.setText(uname);
        useremail.setText(uemail);

    }
}
