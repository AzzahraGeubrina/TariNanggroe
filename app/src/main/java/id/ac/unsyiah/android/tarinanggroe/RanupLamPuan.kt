package id.ac.unsyiah.android.tarinanggroe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class RanupLamPuan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ranuplampuan)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}