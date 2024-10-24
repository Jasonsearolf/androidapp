package app.myapplication.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import app.myapplication.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener{
            val name: String = etName.text.toString()

            if (name.isNotEmpty()) {

                val resultNameIntent = Intent(this, ResultActivity::class.java)
                resultNameIntent.putExtra("EXTRA_NAME", name)
                startActivity(resultNameIntent)
            }
        }





    }
}