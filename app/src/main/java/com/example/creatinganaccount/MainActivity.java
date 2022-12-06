package com.example.creatinganaccount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button goo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goo= findViewById(R.id.button);
//        tx= findViewById(R.id.textView);

        Intent intent=getIntent();
        String dev= intent.getExtras().getString("UserToIntent");

        TextView textviewDeveloper= (TextView)findViewById(R.id.textView);
        textviewDeveloper.setText("Developed by: " + dev);

    }
}