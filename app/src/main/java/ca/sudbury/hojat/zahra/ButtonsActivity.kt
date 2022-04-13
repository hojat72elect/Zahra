package ca.sudbury.hojat.zahra

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ca.sudbury.hojat.zahra.databinding.ActivityButtonsBinding

class ButtonsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_buttons)
        binding.raisedButton.setOnClickListener {
            Toast.makeText(this, "Raised Button Clicked!", Toast.LENGTH_SHORT).show()
        }
        binding.flatButton.setOnClickListener {
            Toast.makeText(this, "Flat Button Clicked!", Toast.LENGTH_SHORT).show()

        }
    }
}