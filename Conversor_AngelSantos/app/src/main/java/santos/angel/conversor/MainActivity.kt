package santos.angel.conversor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var valor = 0
    var resultado = 0
    var operacion = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edtConversor = findViewById<EditText>(R.id.edtConversor)
        val btnLongitud = findViewById<Button>(R.id.btnLongitud)
        val btnPeso = findViewById<Button>(R.id.btnPeso)
        val btnTemp = findViewById<Button>(R.id.btnTemp)
        val btnVolumen = findViewById<Button>(R.id.btnVolumen)
        val btnConvertir = findViewById<Button>(R.id.btnConvertir)
        val txtConvertir = findViewById<TextView>(R.id.txtConvertir)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnLongitud.setOnClickListener {
            txtConvertir.text = "Convertir Metros a Millas"
            edtConversor.visibility = View.VISIBLE
            operacion = "Longitud"
        }
        btnPeso.setOnClickListener {
            txtConvertir.text = "Convertir Kilogramos a Libras"
            edtConversor.visibility = View.VISIBLE
            operacion = "Peso"
        }
        btnTemp.setOnClickListener {
            txtConvertir.text = "Convertir Celcius a Fahrenheit"
            edtConversor.visibility = View.VISIBLE
            operacion = "Temperatura"
        }
        btnVolumen.setOnClickListener {
            txtConvertir.text = "Convertir Litros a Galones"
            edtConversor.visibility = View.VISIBLE
            operacion = "Volumen"
        }
        btnConvertir.setOnClickListener {
            if (edtConversor.text.toString() != "") {
                valor = edtConversor.text.toString().toInt()
                if (operacion == "Longitud") {
                    resultado = (valor * 0.000621371).toInt()
                    txtResultado.text = resultado.toString() + " Millas"
                }
                if (operacion == "Peso") {
                    resultado = (valor * 2.20462).toInt()
                    txtResultado.text = resultado.toString() + " Libras"
                }
                if (operacion == "Temperatura") {
                    resultado = ((valor * 1.8) + 32).toInt()
                    txtResultado.text = resultado.toString() + " Fahrenheit"
                }
                if (operacion == "Volumen") {
                    resultado = (valor * 0.264172).toInt()
                    txtResultado.text = resultado.toString() + " Onzas"
                }
            }
        }
    }
}