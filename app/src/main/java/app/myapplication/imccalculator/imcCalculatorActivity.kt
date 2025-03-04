package app.myapplication.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import app.myapplication.R

class imcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponents()
        initListeners()
        setGenderColor()
        initUI()


    }

    private fun initUI() {
        setGenderColor()
    }


    private fun initComponents(){

        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }

    private fun initListeners() {

        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()
        }

        viewFemale.setOnClickListener{
            changeGender()
            setGenderColor()

        }

    }


    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }
    private fun setGenderColor() {

        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))

    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {

        val colorReference = if(isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)

    }
}