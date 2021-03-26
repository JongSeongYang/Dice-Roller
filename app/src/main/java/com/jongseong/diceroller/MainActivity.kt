package com.jongseong.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.jongseong.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val toast = Toast.makeText(this, "DICE ROLLED!", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        }
    }

    private fun rollDice() {
        val diceRoll = Dice(6).roll()
        binding.textView.text=diceRoll.toString()
    }
}

class Dice(val numSides: Int){

    fun roll(): Int {
        return (1..numSides).random()
    }
}