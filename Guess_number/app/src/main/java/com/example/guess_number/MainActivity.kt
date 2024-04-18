package com.example.guess_number

import android.nfc.Tag
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.ActionMode
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.guess_number.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    val TAG: String = MainActivity::class.java.simpleName
    private lateinit var handler: Handler
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler(Looper.getMainLooper())
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler.postDelayed({
            Toast.makeText(this, "5秒後的操作就行了!", Toast.LENGTH_SHORT).show()
        }, 5000)


        val textView = findViewById<TextView>(R.id.EditText)
        val result_testView = findViewById<TextView>(R.id.result_text)
        val guess_button = findViewById<Button>(R.id.Button)
        val reset_button = findViewById<Button>(R.id.Button2)
        val editText = findViewById<EditText>(R.id.EditText)

        var validate_num: Int
        val secret: Int = Random().nextInt(10) + 1

        guess_button.setOnClickListener {
            binding.EditText.text = editText.text
            validate_num = editText.text.toString().toInt() - secret
            var ans_str: String = "Congrets!"
            if (validate_num > 0) {
                ans_str = "You r so big"
            } else if (validate_num < 0) {
                ans_str = "You guess too small"
            }
            textView.text = ans_str
            //Toast.makeText(this, editText.text,Toast.LENGTH_LONG).show()
            //AlterDialog.Builder(this).setTitle("onclick").setMessage("onclick").create().show()
        }

        binding.Button2.setOnClickListener {
            validate_num = Random().nextInt(10) + 1
            textView.text = "Try again"
        }
    }
        override fun onDestroy() {
            super.onDestroy()
            handler.removeCallbacksAndMessages(null)
        }
    }
