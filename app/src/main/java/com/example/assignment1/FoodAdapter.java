package com.example.assignment1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {


    private ArrayList<Food> foodToAdapt;

    public void setData (ArrayList<Food> foodToAdapt) {
        this.foodToAdapt = foodToAdapt;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        final Food foodAtPosition = foodToAdapt.get(position);

        holder.nameTextView.setText(foodAtPosition.getName());
        holder.descriptionTextView.setText(foodAtPosition.getDescription());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("foodID", foodAtPosition.getFoodId());
                context.startActivity(intent);
            }
        });


        holder.shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Context context = view.getContext();
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, foodAtPosition.getDescription());
                intent.setType("text/plain");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }


    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView descriptionTextView;
        public ImageView shareImageView;
        public TextView priceTextView;

        public FoodViewHolder (View v) {
            super(v);
            view = v;
            nameTextView = v.findViewById(R.id.foodName);
            descriptionTextView = v.findViewById(R.id.foodDescription);
            shareImageView = v.findViewById(R.id.foodPicture);
        }
    }
}
