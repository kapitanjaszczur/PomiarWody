package pl.klonowski.woda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val przyciskPowrot = findViewById<Button>(R.id.buttonBack)
        val przyciskOdswiez = findViewById<Button>(R.id.buttonRefresh)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        var listaPomiarow = Pomiar.arrP()
        val adapter = AdapterPomiar(listaPomiarow)
        recycler.adapter = adapter

        przyciskOdswiez.setOnClickListener {
            recycler.layoutManager = LinearLayoutManager(parent, RecyclerView.VERTICAL, false)
        }

        przyciskPowrot.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}