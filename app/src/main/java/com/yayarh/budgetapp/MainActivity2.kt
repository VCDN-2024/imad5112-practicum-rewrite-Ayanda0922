package com.yayarh.budgetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var button: Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button = findViewById(R.id.button2)
        button.setOnClickListener { R.id.button2 }

        button.setOnClickListener {
        val intent = Intent(this,MainActivity3::class.java)
        }
    }
}
// Declare and initialize parallel arrays to store daily spending data
val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
val morningSpending = DoubleArray(7) { 0.0 } // Stores morning spending for each day
val afternoonSpending: DoubleArray = DoubleArray(7) { 0.0 } // Stores afternoon spending for each day
val expenseNotes = Array(7) { "" } // Stores expense notes for each day

// Function to record spending for a specific day
fun recordSpending(dayIndex: Int, morning: Double, afternoon: Double, note: String) {
    if (dayIndex in 0..6) {
        morningSpending[dayIndex] = morning
        afternoonSpending[dayIndex] = afternoon
        expenseNotes[dayIndex] = note
    } else {
        println("Invalid day index. Please provide a value between 0 and 6.")
    }
}

// Function to display spending for a specific day
fun displayDailySpending(dayIndex: Int) {
    if (dayIndex in 0..6) {
        println("Day: ${daysOfWeek[dayIndex]}")
        println("Morning Spending: R${morningSpending[dayIndex]}")
        println("Afternoon Spending: R${afternoonSpending[dayIndex]}")
        println("Notes: ${expenseNotes[dayIndex]}")
    } else {
        println("Invalid day index. Please provide a value between 0 and 6.")
    }
}

// Function to calculate total weekly spending
fun calculateTotalSpending(): Double {
    var totalSpending = 0.0
    for (i in 0..6) {
        totalSpending += morningSpending[i] + afternoonSpending[i]
    }
    return totalSpending
}

// Main function for testing
fun main() {
    // Record spending for the week
    recordSpending(0, 60.0, 100.0, "Purchased lunch and snacks.")
    recordSpending(1, 12.0, 200.0, "Bought coffee and study supplies.")
    recordSpending(2, 50.0, 80.0, "Groceries and snacks.")
    recordSpending(3, 40.0, 70.0, "Transport and meals.")
    recordSpending(4, 30.0, 60.0, "Books and stationery.")
    recordSpending(5, 90.0, 120.0, "Weekend outing.")
    recordSpending(6, 0.0, 0.0, "Forgot wallet at home.")

    // Display spending for each day
    for (i in 0..6) {
        displayDailySpending(i)
        println("---------------")
    }

    // Calculate and display total weekly spending
    val totalSpending = calculateTotalSpending()
    println("Total Weekly Spending: R$totalSpending")
}
