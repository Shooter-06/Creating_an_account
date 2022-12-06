package com.example.creatinganaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CreateaAcc extends AppCompatActivity {

    FloatingActionButton go;
    EditText userr, passs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createa_acc);

        userr= findViewById(R.id.userText);
        passs= findViewById(R.id.passwordText);

        go=findViewById(R.id.goFloat);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr= "User12";
                String pass= "1234";

                if(userr.getText().toString().equals(usr) && passs.getText().toString().equals(pass)){
                    Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("UserToIntent", usr);
                    startActivity(intent);
                }
            }
        });
    }
}