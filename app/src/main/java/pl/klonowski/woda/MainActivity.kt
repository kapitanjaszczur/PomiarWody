package pl.klonowski.woda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText
import pl.klonowski.woda.Pomiar.Companion.arrP
import java.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adres = findViewById<TextInputEditText>(R.id.TIETAdres)
        val ilosc = findViewById<EditText>(R.id.editTextNumberIlosc)
        val przyciskDodaj = findViewById<Button>(R.id.buttonAdd)
        val przyciskOdswiez = findViewById<Button>(R.id.buttonRefresh)

        val recycler = findViewById<RecyclerView>(R.id.RV1)
        var listaPomiarow = arrP()
        val adapter = AdapterPomiar(listaPomiarow)
        recycler.adapter = adapter

        fun clear() {
            adres.text = null
            ilosc.text = null
        }

        przyciskOdswiez.setOnClickListener {
            clear()
            recycler.layoutManager = LinearLayoutManager(parent, RecyclerView.VERTICAL, false)
        }

        przyciskDodaj.setOnClickListener {
            val a = adres.text.toString()
            val i = ilosc.text.toString()

            if (a!="" && i!="") {
                listaPomiarow += Pomiar(a, i)
                clear()
                Toast.makeText(this,"Zapisano!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this,"Niedozwolona wartość!", Toast.LENGTH_SHORT).show()
            }



        }


    }
}