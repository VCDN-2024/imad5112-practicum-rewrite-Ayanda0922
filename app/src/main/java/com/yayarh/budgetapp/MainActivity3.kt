package com.yayarh.budgetapp

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import java.time.DayOfWeek


private val Any.textView: Int
    get() {
        TODO("Not yet implemented")
    }
private val Any.button: Int
    get() {
        TODO("Not yet implemented")
    }
val Int.id: Any
    get() {
        TODO("Not yet implemented")
    }
private val <T> Class<T>.activity_main3: Any
    get() = Unit

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onCreate(savedInstanceState)
    }

    var value = setContentView(R.javaClass.activity_main3)

    private fun setContentView(activityMain3: Any): Any {
        TODO("Not yet implemented")
    }


    val ButtonBack: Button = findViewById(R.id.button)
    val textViewSummary: TextView = findViewById(R.id.textView)


    // Example data
    val daysOfWeek =
        arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val morningSpending = doubleArrayOf(60.0, 12.0, 0.0, 0.0, 0.0, 0.0, 0.0)
    val afternoonSpending = doubleArrayOf(100.0, 200.0, 0.0, 0.0, 0.0, 0.0, 0.0)
    val expenseNotes = arrayOf(
        "Purchased lunch and snacks",
        "Bought coffee and study supplies",
        "No spending",
        "No spending",
        "No spending",
        "No spending",
        "Forgot wallet at home"
    )

    // Calculate the day with the highest expense
    val totalSpending =
        morningSpending.zip(afternoonSpending) { morning, afternoon -> morning + afternoon }
    val maxSpendingDayIndex = totalSpending.indexOf(totalSpending.maxOrNull() ?: 0.0)
    val maxSpendingDay = daysOfWeek[maxSpendingDayIndex]

    // Calculate average daily spending
    val averageSpending = totalSpending.average()

    // Display summary
    val summary = """
            Day with the highest expense: $maxSpendingDay
            Average daily spending: R${"%.2f".format(averageSpending)}
        """.trimIndent()
}































