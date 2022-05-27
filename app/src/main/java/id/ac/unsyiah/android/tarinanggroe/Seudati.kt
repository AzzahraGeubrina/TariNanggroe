package id.ac.unsyiah.android.tarinanggroe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Seudati : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seudati)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}