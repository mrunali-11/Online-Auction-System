package com.example.onlineauctionsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class selling extends AppCompatActivity {
    private EditText et,et1,et2,et3,et4;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling);
        et = (EditText) findViewById(R.id.editTextDate);
        et1 = (EditText) findViewById(R.id.editTextTime);
        et2 = (EditText) findViewById(R.id.description);
        et3 = (EditText) findViewById(R.id.setet);
        et4 = (EditText) findViewById(R.id.editTextTime3);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userdate = et.getText().toString();
                String usertime = et1.getText().toString();
                String userdesp = et2.getText().toString();
                String userprice = et3.getText().toString();
                String userendtime = et4.getText().toString();
                Intent intent = new Intent(selling.this,buyProduct.class);
                intent.putExtra("key",userdate);
                intent.putExtra("key1",usertime);
                intent.putExtra("key2",userdesp);
                intent.putExtra("key3",userprice);
                intent.putExtra("key4",userendtime);
                startActivity(intent);
            }
        });
    }
}