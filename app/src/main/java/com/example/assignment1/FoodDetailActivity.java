package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private TextView priceTextView;
    private ImageView foodpictureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        Intent newIntent = getIntent();
        int foodID = newIntent.getIntExtra("foodID", 1);

        Food food = FoodDatabase.getFoodById(foodID);

        nameTextView = findViewById(R.id.detailName);
        descriptionTextView = findViewById(R.id.detailDescription);
        priceTextView = findViewById(R.id.detailPrice);
        foodpictureView = findViewById(R.id.detailImage);

        nameTextView.setText(food.getName());
        descriptionTextView.setText(food.getDescription());
        priceTextView.setText(food.getPrice());


        foodpictureView.setImageResource(food.getImageDrawableId());
    }
}
