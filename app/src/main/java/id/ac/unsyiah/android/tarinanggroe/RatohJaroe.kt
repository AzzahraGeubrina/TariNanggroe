package id.ac.unsyiah.android.tarinanggroe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class RatohJaroe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ratohjaroe)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}