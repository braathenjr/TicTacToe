package com.example.tictactoe

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import java.util.ArrayList

class Game_Start : Fragment(){

    val TAG = "GameStartTwo"

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    var activePlayer = 1

    private fun playGame(cellID: Int, btnSelected: Button) {

        if(activePlayer == 1){
            btnSelected.text = "X"

            player1.add(cellID)
            activePlayer = 2
            //autoPlay()
        }
        else{
            btnSelected.text = "O"

            player2.add(cellID)
            activePlayer = 1
        }

        btnSelected.isEnabled = false

        checkWinner()

    }

    fun checkWinner() {
        var winner = -1

        //row 1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner = 1
        }
        else if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner = 2
        }

        //row 2
        else if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner = 1
        }
        else if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner = 2
        }

        //row 3
        else if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner = 1
        }
        else if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner = 2
        }

        //col 1
        else if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner = 1
        }
        else if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner = 2
        }

        //col 2
        else if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner = 1
        }
        else if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner = 2
        }

        //col 3
        else if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner = 1
        }
        else if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner = 2
        }

        //lef to right
        else if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner = 1
        }
        else if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winner = 2
        }

        //right to left
        else if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winner = 1
        }
        else if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner = 2
        }

        if(winner != -1){
            if(winner == 1){
                Toast.makeText(this, "Player 1 won!", Toast.LENGTH_LONG).show()

            }else if (winner == 2){
                Toast.makeText(this, "Player 2 won!", Toast.LENGTH_LONG).show()
            }
        }
    }



    fun buClick(view: View){
        val btnSelected = view as Button
        var cellID = 0
        when(btnSelected.id) {
            R.id.btn1 -> cellID = 1
            R.id.btn2 -> cellID = 2
            R.id.btn3 -> cellID = 3
            R.id.btn4 -> cellID = 4
            R.id.btn5 -> cellID = 5
            R.id.btn6 -> cellID = 6
            R.id.btn7 -> cellID = 7
            R.id.btn8 -> cellID = 8
            R.id.btn9 -> cellID = 9

        }
        playGame(cellID,btnSelected)

    }

    override fun onAttach(context: Context?) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView")
        return inflater!!.inflate(R.layout.game_start,container,false)
}

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestoy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }

}