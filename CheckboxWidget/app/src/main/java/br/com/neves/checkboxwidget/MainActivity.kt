package br.com.neves.checkboxwidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCheckboxClicked(view: View ) {
        //Log.d("Checks", "Checkbox clicked")
        view as CheckBox
        var isChecked: Boolean = view.isChecked

        when(view.id) {
            R.id.checkVeggies -> if (isChecked) { Log.d("Veggies", "IsChecked") } else { Log.d("Veggies", "NoChecked") }
            R.id.checkMeat -> if (isChecked) {  Log.d("Meat", "IsChecked") } else { Log.d("Meat", "NoChecked") }
            R.id.checkFruit -> if (isChecked) { Log.d("Fruit", "IsChecked") } else { Log.d("Fruit", "NoChecked") }
        }
    }
}
