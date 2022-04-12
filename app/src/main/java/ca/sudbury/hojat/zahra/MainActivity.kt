package ca.sudbury.hojat.zahra

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
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
            arrayListOf("GridLayout", "NavigationDrawer", "AppCompatEditText", "Button")

        // ArrayAdapter for list
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, GUI_Elements)

        binding.listViewMainPage.let {
            it.adapter = arrayAdapter
            it.setOnItemClickListener { _, _, position, _ ->

                Toast.makeText(this, "$position", Toast.LENGTH_SHORT).show()
//                when (position) {
//                    0 -> Toast.makeText(this, "0", Toast.LENGTH_SHORT).show()
//                }
            }
        }


    }
}