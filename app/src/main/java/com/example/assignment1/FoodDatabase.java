package com.example.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class FoodDatabase {


        public static Food getFoodById (int foodID) {
            return fooditems.get(foodID);
        }

        public static ArrayList<Food> getAllFoodItems () {
            return new ArrayList<Food>((List) Arrays.asList(fooditems.values().toArray()));
        }

        private static final HashMap<Integer, Food> fooditems = new HashMap<>();

        static {
            fooditems.put(1, new Food(
                    1, "Hamburger", "Signature flame-grilled beef patty topped with pickles, yellow mustard, and ketchup on a toasted bun", "$8.99", R.drawable.image1_food
            ));

            fooditems.put(2, new Food(
                    2, "Cheeseburger", "Signature flame-grilled. beef patty topped with melted American cheese, pickles, yellow mustard, and ketchup on a toasted bun", "$9.99", R.drawable.image2_food
            ));

            fooditems.put(3, new Food(
                    3, "Bacon & Cheese Burger", "Flame-grilled beef topped bacon, melted cheese, tomatoes, fresh lettuce, creamy mayonnaise, ketchup, pickles, onions on a soft bun", "$12.99", R.drawable.image3_food
            ));

            fooditems.put(4, new Food(
                    4, "Crispy Chicken Burger", "Crispy Chicken Burger made with tender and white meat chicken, topped with fresh lettuce, tomatoes, and creamy mayonnaise all on a soft bun.", "$12.99", R.drawable.image4_food
            ));

            fooditems.put(5, new Food(
                    5, "Grilled Chicken Burger", "Grilled Chicken Burger is made with seasoned white meat chicken filet, marinated with spices, fresh lettuce, tomatoes, on a toasted potato bun.", "$8.99", R.drawable.image5_food
            ));

            fooditems.put(6, new Food(
                    6, "Original Chicken Burger", "Original Chicken Burger is made with white meat chicken, topped with shredded lettuce and creamy mayonnaise on a sesame seed bun.", "$8.99", R.drawable.image6_food
            ));

            fooditems.put(7, new Food(
                    7, "Fish Burger", " Fish Burger is made with a fish patty, topped with tartar sauce, pickles,  on top of a toasted brioche-style bun.", "$8.99", R.drawable.image7_food
            ));

            fooditems.put(8, new Food(
                    8, "Veggie Burger", "Veggie Patty with fresh-cut lettuce, juicy tomatoes, white onions, crunchy pickles, ketchup and mayo all served on a toasted sesame seed bun.", "$8.99", R.drawable.image8_food
            ));

            fooditems.put(9, new Food(
                    9, "Chicken Nuggets", "Chicken Nuggets juicy on the inside and crispy on the outside. Comes with a variety of dipping sauces", "$5.99", R.drawable.image9_food
            ));

            fooditems.put(10, new Food(
                    10, "Garden Salad", "Lettuce, bell peppers, jalapeno peppers, all possible varieties of tomatoes, peas, green beans, cucumbers (regular and pickling), carrots, radishes, zucchini, pumpkins, gourds, melons (water and cantaloupe), and several herbs", "$7.99", R.drawable.image10_food
            ));

            fooditems.put(11, new Food(
                    11, "Fries", "thick cut Salted French Fries are golden on the outside and fluffy on the inside", "$4.99", R.drawable.image11_food
            ));

            fooditems.put(12, new Food(
                    12, "Frozen Coke", "Cool down with a frozen coke", "$2.99", R.drawable.image12_food
            ));

            fooditems.put(13, new Food(
                    13, "Coke", "Can of Coca Cola drink", "$2.99", R.drawable.image13_food
            ));

            fooditems.put(14, new Food(
                    14, "Hershey's Cream Pie", "One part crunchy chocolate crust and one part chocolate crème filling, with a delicious topping and real HERSHEY’S Chocolate Chips.", "$5.99", R.drawable.image14_food
            ));

            fooditems.put(15, new Food(
                    15, "Oreo Vanilla Shake", "Velvety Vanilla Soft Serve, OREO® cookie pieces and vanilla sauce are blended to perfection and finished with a sweet whipped", "6.99", R.drawable.image15_food
            ));


        }
}
