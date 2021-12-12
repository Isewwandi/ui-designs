package com.techleadintl.android.app1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList<model> models;
    Context context;

    public MyAdapter(ArrayList<model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //create view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        //set logo toimage
         holder.imageView.setImageResource(models.get(position).getLogo());
//set logo to text
         holder.textView.setText(models.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        //initialize variable
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView =itemView.findViewById(R.id.image_view);
            textView =itemView.findViewById(R.id.text_view);

        }
    }
}
