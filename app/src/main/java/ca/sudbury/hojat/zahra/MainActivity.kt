package ca.sudbury.hojat.zahra

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ca.sudbury.hojat.zahra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // All GUI elements in this repo
        val GUI_Elements =
            arrayListOf("GridLayout", "EditTexts", "AppCompatEditText", "Button")

        // ArrayAdapter for list
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, GUI_Elements)

        binding.listViewMainPage.let {
            it.adapter = arrayAdapter
            it.setOnItemClickListener { _, _, position, _ ->


                when (position) {
                    0 -> {
                        // go to GridLayout
                        startActivity(Intent(this, GridLayoutActivity::class.java))
                    }
                }
            }
        }


    }
}