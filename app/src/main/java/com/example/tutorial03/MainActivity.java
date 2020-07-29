package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        EditText email = (EditText)findViewById(R.id.edtEmail);
        String e = String.valueOf(email.getText());
        EditText pass = (EditText)findViewById(R.id.edtPass);
        String p = String.valueOf(pass.getText());
        if(e.equals("admin@gmail.com") && p.equals("admin")){
            Intent intent = new Intent(MainActivity.this, Welcome.class);
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Username or Password is incorrect", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}