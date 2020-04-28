package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.data.dataValues;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Login");

    }

    public void loginBtnClicked(View view){

        EditText usrName = findViewById(R.id.loginTxtUserName);
        EditText pwd = findViewById(R.id.loginTxtPassword);




        dataValues dValues = new dataValues();

        if (!(dValues.uName.equals(usrName.getText().toString())) || !(dValues.uPwd.equals(pwd.getText().toString()))){

            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Valid", Toast.LENGTH_SHORT).show();
        }


    }
}
