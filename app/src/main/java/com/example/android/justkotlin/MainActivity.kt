/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 *
 * package com.example.android.justjava;
 */
package com.example.android.justkotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

import com.example.android.justkotlin.R

/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {

    internal var quantity = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {

        val price = calculatePrice()

        displayMessage(createOrderSummary(price))

        //Toast to01 = Toast.makeText(this,"Order created!",10);
        //to01.show();

        //Log.i("tag01","Bau! Bau! Bau! Here is your order!");
    }


    /**
     * This method is called when the + button is clicked.
     */
    fun increment(view: View) {
        quantity = quantity + 1
        displayQuantity(quantity)
    }

    /**
     * This method is called when the - button is clicked.
     */
    fun decrement(view: View) {
        quantity = quantity - 1
        displayQuantity(quantity)
    }

    /**
     * This method displays the given quantity value on the screen.

     * @param numberOfCoffees number of coffee cups
     */
    private fun displayQuantity(numberOfCoffees: Int) {
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + numberOfCoffees
    }

    /**
     * This method displays the given price on the screen.

     * @param message is the message to display
     */

    private fun displayMessage(message: String) {
        val orderSummaryTextView = findViewById<View>(R.id.order_summary_text_view) as TextView
        orderSummaryTextView.text = message
    }


    /**
     * Calculates the price of the order.

     * @return total price
     */
    private fun calculatePrice(): Int {
        return quantity * 5
    }

    /**
     * Creates a summary of the order

     * @param price is the price of the item ordered
     * *
     * @return the summary
     */
    private fun createOrderSummary(price: Int): String {
        val summary = "Name: Andrei Chitic\nQuantity: $quantity\nTotal: $$price\nThank you!"
        return summary
    }
}

