package com.example.pizzamaker

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IngredientsTab : AppCompatActivity() {

    private lateinit var items : TextView
    private lateinit var toppings : String
    var stringList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ingredients_tab)

        items = findViewById(R.id.getToppings)

        }

    fun onToppingsButtonClick(view: View) {

        toppings = when (view.id) {
            R.id.mushroom -> "Mushroom"
            R.id.cheese -> "Cheese"
            R.id.pepperoni -> "Pepperoni"
            R.id.sausage -> "Sausage"

            else -> ""
        }
        stringList.add(toppings)
        items.text = "$stringList selected"
    }

    fun onGetPizzaButtonClick(view: View) {
        items.text = "Selected toppings: $stringList"
        val selectedToppings = stringList
        val pizzaMessage = when (selectedToppings.size) {
            0 -> "You have not selected any toppings"
            1 -> "You have selected a ${selectedToppings[0]} Pizza"
            2 -> {
                if ("Mushroom" in selectedToppings && "Cheese" in selectedToppings) {
                    "You have selected Mushrooms and Cheese Pizza"
                } else if ("Mushroom" in selectedToppings && "Pepperoni" in selectedToppings) {
                    "You have selected Mushrooms and Pepperoni Pizza"
                } else if ("Mushroom" in selectedToppings && "Sausage" in selectedToppings) {
                    "You have selected Mushrooms and Sausage Pizza"
                } else if ("Cheese" in selectedToppings && "Pepperoni" in selectedToppings) {
                    "You have selected Cheese and Pepperoni Pizza"
                } else if ("Cheese" in selectedToppings && "Sausage" in selectedToppings) {
                    "You have selected Cheese and Sausage Pizza"
                } else if ("Pepperoni" in selectedToppings && "Sausage" in selectedToppings) {
                    "You have selected Cheese and Pepperoni Pizza"
                } else {
                    ""
                }
            }
            3 -> {
                if ("Mushroom" in selectedToppings && "Cheese" in selectedToppings && "Pepperoni" in selectedToppings) {
                    "You have selected Mushroom, Cheese and Pepperoni Pizza"
                } else if ("Mushroom" in selectedToppings && "Cheese" in selectedToppings && "Sausage" in selectedToppings) {
                    "You have selected Mushroom, Cheese and Sausage Pizza"
                } else if ("Mushroom" in selectedToppings && "Pepperoni" in selectedToppings && "Sausage" in selectedToppings) {
                    "You have selected Mushroom, Pepperoni and Sausage Pizza"
                } else if ("Cheese" in selectedToppings && "Pepperoni" in selectedToppings && "Sausage" in selectedToppings) {
                    "You have selected Cheese, Pepperoni and Sausage Pizza"
                } else {
                    "You have selected all toppings"
                }

            }
            else -> "You have selected all toppings"

            }
            items.text = pizzaMessage
            stringList.clear()


    }
}
