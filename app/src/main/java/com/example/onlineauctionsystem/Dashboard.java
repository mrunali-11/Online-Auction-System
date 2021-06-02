package com.example.onlineauctionsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {
    private ImageButton logout1;
    private Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn = (Button) findViewById(R.id.sell_bt);
        btn1 = (Button) findViewById(R.id.listProduct);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openActivity();
           }
       });
        logout1 = (ImageButton) findViewById(R.id.imageButton3);
        logout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(Dashboard.this,MainActivity.class));
            }
        });
    }

    private void openActivity1() {
        Intent intent1 = new Intent(Dashboard.this,Cardlist.class);
        startActivity(intent1);
    }


    private void openActivity() {
        Intent intent = new Intent(Dashboard.this,selling.class);
        startActivity(intent);
    }

}