package ca.sudbury.hojat.zahra

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ca.sudbury.hojat.zahra.databinding.ActivityEditTextsBinding


class EditTextsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditTextsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_texts)

        // Registers a text watcher for user name EditText.
        val editTextUserName = binding.editTextUserName
        val layoutUserName = binding.textInputLayoutUserName
        editTextUserName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (editTextUserName.text?.isEmpty() == true) {
                    layoutUserName.isErrorEnabled = true
                    layoutUserName.error = "User name should be entered !!!"
                } else {
                    layoutUserName.isErrorEnabled = false
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })

        // Registers a onFocusChangeListener for the user name EditText.
        editTextUserName.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (editTextUserName.text?.isEmpty() == true) {
                layoutUserName.isErrorEnabled = true
                layoutUserName.error = "User name should be entered !!!"
            } else {
                layoutUserName.isErrorEnabled = false
            }
        }
    }
}