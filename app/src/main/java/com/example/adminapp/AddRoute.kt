package com.example.adminapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.icu.util.Calendar
import com.example.adminapp.database.DataRecording
import com.example.adminapp.database.RouteInfo
import com.example.adminapp.databinding.AddRouteBinding

import android.widget.DatePicker
import java.text.SimpleDateFormat
import android.app.DatePickerDialog
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker


class AddRoute : AppCompatActivity() {

    lateinit var binding : AddRouteBinding
    private val calendar = Calendar.getInstance()
    lateinit var route : RouteInfo
    lateinit var record : DataRecording

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddRouteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*fun getRouteInfo() {
            route.depPoint = binding.DeparturePText.toString()
            route.arrivalPoint = binding.ArrivalPText.toString()
            route.depTime = binding.DepTimeText.toString()
            route.arrivalTime = binding.ArrivalTimeText.toString()
        }*/

        binding.DateText.setOnClickListener {
            val datePickerDialog = DatePickerDialog(
                this, { DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    // Create a new Calendar instance to hold the selected date

                    val selectedDate = Calendar.getInstance()
                    // Set the selected date using the values received from the DatePicker dialog
                    selectedDate.set(year, monthOfYear, dayOfMonth)
                    // Create a SimpleDateFormat to format the date as "dd/MM/yyyy"
                    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                    // Format the selected date into a string
                    val formattedDate = dateFormat.format(selectedDate.time)
                    // Update the TextView to display the selected date with the "Selected Date: " prefix
                    binding.DateText.text = "$formattedDate"

                },
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            )
            datePickerDialog.show()
        }

        binding.AddButton.setOnClickListener {
            /*
    *  мы считываем информацию о рейсе (место отправления
    *  и прибытия,время и цена одинаковые)+
    *  далее проверяем какие дни недели отмечены в чекбоксе
    *  через биндинг и if
    *  далее циклом пройтись до конца года (31/12/2023) и найти дату
    *  каждого отмеченного дня недели. внести данные в бд
    * */

            route = RouteInfo(binding.DeparturePText.text.toString(), binding.ArrivalPText.text.toString(),
                binding.DepTimeText.text.toString(), binding.ArrivalTimeText.text.toString(),
                binding.SeatsAmountText.text.toString(), binding.PriceText.text.toString(),
                binding.DateText.text.toString())



        }

    }

}