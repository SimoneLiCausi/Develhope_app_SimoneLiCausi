package com.example.develhope_app_simonelicausi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.ui.AppBarConfiguration
import com.example.develhope_app_simonelicausi.databinding.ActivityMain2Binding
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar2)

        binding.activityMain2ButtonReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding


//        binding.activityMain2ButtonEmail.setOnClickListener{
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        binding

//Anche avendo seguito i passaggi di Sasa, mi continua a risultare in errore sia first che second.

        binding.activityMain2ButtonEmail.setOnClickListener{
            binding.first.text = binding.insertYourEmail.text
            if(binding.insertYourEmail.text.contains("@")){
            Snackbar.make(binding.first, binding.insertYourEmail.text, Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(binding.first,R.string.email_not_vaild_error, Snackbar.LENGTH_SHORT).show()

            }
        }
    }
}
