package com.example.homework03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
//import kotlin.random.Random
import java.util.*
private lateinit var ImageView: ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtCom = findViewById<TextView>(R.id.txtCom)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val imgScissors = findViewById<ImageButton>(R.id.imgScissors)
        val imgRock = findViewById<ImageButton>(R.id.imgRock)
        val imgpaper = findViewById<ImageButton>(R.id.imgpaper)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imgRock.setOnClickListener{
            val iComPlay = Random().nextInt(3)+1
            when(iComPlay){
                1->{
                    imageView.setImageResource(R.drawable.scissor)
                    txtResult.setText(getString(R.string.win))
                }
                2->{
                    imageView.setImageResource(R.drawable.rock)
                    txtResult.setText(getString(R.string.draw))
                }
                3->{
                    imageView.setImageResource(R.drawable.paper)
                    txtResult.setText(getString(R.string.lose))
                }
            }
        }
        imgpaper.setOnClickListener{
            val iComPlay = Random().nextInt(3)+1
            when(iComPlay){
                1->{
                    imageView.setImageResource(R.drawable.rock)
                    txtResult.setText(getString(R.string.win))
                }
                2->{
                    imageView.setImageResource(R.drawable.paper)
                    txtResult.setText(getString(R.string.draw))
                }
                3->{
                    imageView.setImageResource(R.drawable.scissor)
                    txtResult.setText(getString(R.string.lose))
                }
            }
        }
        imgScissors.setOnClickListener{
            val iComPlay = Random().nextInt(3)+1
            when(iComPlay){
                1->{
                    imageView.setImageResource(R.drawable.paper)
                    txtResult.setText(getString(R.string.win))
                }
                2->{
                    imageView.setImageResource(R.drawable.scissor)
                    txtResult.setText(getString(R.string.draw))
                }
                3->{
                    imageView.setImageResource(R.drawable.rock)
                    txtResult.setText(getString(R.string.lose))
                }
            }
        }
    }
}
