package com.example.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var isFragmentGameStartLoaded = true
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Start = findViewById<Button>(R.id.Btn_start)
        ShowHomeScreen()
        Start.setOnClickListener({
            if  (isFragmentGameStartLoaded)
                ShowGameStart()
             else
                ShowHomeScreen()
        })
    }



    fun ShowHomeScreen (){
        val transaction =  manager.beginTransaction()
        val fragment = HomeScreen()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentGameStartLoaded = true


    }
    fun ShowGameStart (){
        val transaction =  manager.beginTransaction()
        val fragment = Game_Start()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

        isFragmentGameStartLoaded = false


    }

}
