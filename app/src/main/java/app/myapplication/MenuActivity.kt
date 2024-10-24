package app.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import app.myapplication.firstapp.FirstAppActivity
import app.myapplication.imccalculator.imcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)

        btnSaludApp.setOnClickListener{navigateToSaludApp()}
        btnIMCApp.setOnClickListener{navigateToIMCApp()}


    }

    private fun navigateToSaludApp() {
        val saludAppIntent = Intent(this, FirstAppActivity::class.java)
        startActivity(saludAppIntent)
    }private fun navigateToIMCApp() {
        val imcAppIntent = Intent(this, imcCalculatorActivity::class.java)
        startActivity(imcAppIntent)
    }






}