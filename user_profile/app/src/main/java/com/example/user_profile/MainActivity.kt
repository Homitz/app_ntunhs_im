package com.example.user_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.app.DatePickerDialog
import android.widget.DatePicker
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datePicker = findViewById<DatePicker>(R.id.date1)

        // 设置DatePicker的默认日期为当前日期
        val calendar = Calendar.getInstance()
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
            object : DatePicker.OnDateChangedListener {
                override fun onDateChanged(view: DatePicker?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
                    // 在此处添加您希望在日期更改时执行的操作
                }
            })

        // 创建DatePickerDialog并显示
        val datePickerDialog = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                // 在此处添加您希望在用户设置日期后执行的操作
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH))
        datePickerDialog.show()
    }
}
