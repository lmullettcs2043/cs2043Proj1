package com.uniqueandrocode.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.uniqueandrocode.loginandregistration.api.MyRetrofit;
import com.uniqueandrocode.loginandregistration.model.MyUserData;
import com.uniqueandrocode.loginandregistration.model.UserData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
EditText etemail,etpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView createnewac=findViewById(R.id.createnewac);
       etemail=findViewById(R.id.etemail);
        etpass=findViewById(R.id.mypass);

        Button btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logIn();
            }
        });




        createnewac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));


            }
        });
    }

    private void logIn() {
        String email=etemail.getText().toString().trim();
        String pass=etpass.getText().toString();
        if (TextUtils.isEmpty(email)){
            etemail.setError("Please Enter Email");
            etemail.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(pass)){
            etpass.setError("Please Enter Password");
            etpass.requestFocus();
            return;
        }
      Call<MyUserData>call=MyRetrofit.getInstance().getMyApi().logIn(email,pass);
      call.enqueue(new Callback<MyUserData>() {
          @Override
          public void onResponse(Call<MyUserData> call, Response<MyUserData> response) {

              String myname=response.body().getName();
              String email=response.body().getEmail();
             Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
             intent.putExtra("name",myname);
              intent.putExtra("email",email);
              startActivity(intent);
          }

          @Override
          public void onFailure(Call<MyUserData> call, Throwable t) {

          }
      });

    }
}
