package com.ainadia.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ainadia.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.scheduleBtn.setOnClickListener {
            //
            //open a new page atau activity
            // create an Intent (dr mana (this)
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name",binding.nameEditText.text.toString())
            intent.putExtra("address",binding.addressEditText.text.toString())
            intent.putExtra("city", binding.cityEditText.text.toString())
            intent.putExtra("state", binding.provinceEditText.text.toString())
            intent.putExtra("postcode", binding.poscodeEditText.text.toString())
            intent.putExtra("country", binding.countryEditText.text.toString())
            startActivity(intent)
        }
    }
}