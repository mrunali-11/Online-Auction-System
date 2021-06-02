package com.example.onlineauctionsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Cardlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardlist);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyProductList[] myProductLists = new MyProductList[]{
                new MyProductList("Asus Gaming Laptop","8GB RAM 1TB HDD","LiveNow",R.drawable.lapi),
                new MyProductList("Audi Q7","2017 Model","Premiere Soon",R.drawable.q7),
                new MyProductList("SamSung QLED","4K SmartTV","Premiere Soon",R.drawable.qled),
                new MyProductList("Dining Table","Made with Maple Wood","Closed",R.drawable.images),
                new MyProductList("Electric Cycle","12hrs Battery Life","Closed Week ago",R.drawable.cycle),
                new MyProductList("Wooden Couch","Traditional Style ","Closed 2 Weeks ago",R.drawable.couch),
        };
        MyProductAdapter myProductAdapter = new MyProductAdapter(myProductLists,Cardlist.this);
        recyclerView.setAdapter(myProductAdapter);
    }
}