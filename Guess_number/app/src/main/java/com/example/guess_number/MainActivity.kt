package com.example.guess_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.EditText)
        val result_testView = findViewById<TextView>(R.id.result_text)
        val guess_button = findViewById<Button>(R.id.Button)
        val reset_button = findViewById<Button>(R.id.Button2)
        val editText = findViewById<EditText>(R.id.EditText)

        var validate_num:Int
        val secret : Int = Random().nextInt(10) +1

        guess_button.setOnClickListener{
            textView.text=editText.text
            validate_num=editText.text.toString().toInt()-secret
            var ans_str:String="你猜對了喔"

            if (validate_num>0){
                ans_str="你猜太大了喔"
            }else if (validate_num<0){
                ans_str="你猜太小了喔"
            }
            textView.text=ans_str
            //Toast.makeText(this, editText.text,Toast.LENGTH_LONG).show()
            //AlterDialog.Builder(this).setTitle("onclick").setMessage("onclick").create().show()
        }
        reset_button.setOnClickListener{
            validate_num= Random().nextInt(10)+1
            textView.text="讓我們在猜一次"
        }
    }
}