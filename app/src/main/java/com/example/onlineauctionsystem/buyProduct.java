package com.example.onlineauctionsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class buyProduct extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    int counter = 0;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_product);
        t1 = (TextView) findViewById(R.id.textView3);
        t2 = (TextView) findViewById(R.id.textView8);
        t3 = (TextView) findViewById(R.id.textView6);
        t4 = (TextView) findViewById(R.id.textView10);
        t5 = (TextView) findViewById(R.id.counter);
        t6 = (TextView) findViewById(R.id.textView23);
        btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                t5.setText(Integer.toString(counter));
                Toast.makeText(buyProduct.this,
                        "+500 added to user:gaurav's bid!! ",Toast.LENGTH_LONG).show();
            }
        });
        String username = getIntent().getStringExtra("key");
        String username1 = getIntent().getStringExtra("key1");
        String username2 = getIntent().getStringExtra("key2");
        String username3 = getIntent().getStringExtra("key3");
        String username4 = getIntent().getStringExtra("key4");
        t1.setText(username);
        t2.setText(username1);
        t3.setText(username2);
        t4.setText(username3);
        t6.setText(username4);

    }
}