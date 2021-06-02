package com.example.onlineauctionsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyProductAdapter extends RecyclerView.Adapter<MyProductAdapter.ViewHolder>{
    MyProductList[] myProductLists;
    Context context;
    public MyProductAdapter(MyProductList[] myProductLists,Cardlist activity) {
        this.myProductLists = myProductLists;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.eg_lists,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyProductAdapter.ViewHolder holder, int position) {
        final MyProductList myProductList = myProductLists[position];
        holder.text1.setText(myProductList.getTxt1());
        holder.text2.setText(myProductList.getTxt2());
        holder.text3.setText(myProductList.getTxt3());
        holder.img.setImageResource(myProductList.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,myProductList.getTxt1(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myProductLists.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text1;
        TextView text2;
        TextView text3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.t1);
            text2 = itemView.findViewById(R.id.t2);
            text3 = itemView.findViewById(R.id.t3);
            img = itemView.findViewById(R.id.imageview);

        }
    }
}
