package id.ac.unsyiah.android.tarinanggroe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Home : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        initComponents()

        button1.setOnClickListener {
            tari1()
        }
        button2.setOnClickListener {
            tari2()
        }
        button3.setOnClickListener {
            tari3()
        }
        button4.setOnClickListener {
            tari4()
        }
        button5.setOnClickListener {
            tari5()
        }
        button6.setOnClickListener {
            tari6()
        }
    }

    private fun initComponents() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
    }

    private fun tari1() {
        val intent = Intent(this, Likok_pulo::class.java)
        startActivity(intent)
    }

    private fun tari2() {
        val intent = Intent(this, RanupLamPuan::class.java)
        startActivity(intent)
    }
    private fun tari3() {
        val intent = Intent(this, RatohJaroe::class.java)
        startActivity(intent)
    }
    private fun tari4() {
        val intent = Intent(this, Saman::class.java)
        startActivity(intent)
    }
    private fun tari5() {
        val intent = Intent(this, Seudati::class.java)
        startActivity(intent)
    }
    private fun tari6() {
        val intent = Intent(this, TarekPukat::class.java)
        startActivity(intent)
    }

}