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

public class productAdapter extends RecyclerView.Adapter<productAdapter.ViewHolder> {

    ArrayList<modelProduct> models;
    Context context;

    public productAdapter(ArrayList<modelProduct> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public productAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //create view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_item,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productAdapter.ViewHolder holder, int position) {
        //set logo toimage
        holder.imageView.setImageResource(models.get(position).getLogo());
        holder.imageView2.setImageResource(models.get(position).getProduct());
//set logo to text
        holder.textView.setText(models.get(position).getName());
        holder.textView2.setText(models.get(position).getWork());


    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //initialize variable
        ImageView imageView,imageView2;
        TextView textView,textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView =itemView.findViewById(R.id.image_view);
            imageView2 =itemView.findViewById(R.id.product_view);
            textView =itemView.findViewById(R.id.name);
            textView2 =itemView.findViewById(R.id.work);
        }
    }
}
