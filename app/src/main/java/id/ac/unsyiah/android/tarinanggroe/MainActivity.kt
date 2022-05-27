package id.ac.unsyiah.android.tarinanggroe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.land)

        initComponents()
        button.setOnClickListener {
            button()
        }

    }

    private fun initComponents() {
        button = findViewById(R.id.button)
    }

    private fun button() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }


}