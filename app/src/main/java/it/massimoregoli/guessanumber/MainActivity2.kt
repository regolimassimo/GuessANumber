package it.massimoregoli.guessanumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import it.massimoregoli.guessanumber.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivIcon
        binding.btnOK.text = "Ok"
        binding.btnOK.setOnClickListener {
            Toast.makeText(this, "HAI PREMUTO OK", Toast.LENGTH_LONG).show()
        }
    }
}