package com.example.iplacexrestaurantapp_askotlin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iplacexrestaurantapp_askotlin.modelo.Pedido
import com.google.android.material.materialswitch.MaterialSwitch
import coil.load
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var imgLogo: ImageView
    private lateinit var edtPastel: EditText
    private lateinit var edtCazuela: EditText

    private lateinit var txtSubPastel: TextView
    private lateinit var txtSubCazuela: TextView

    private lateinit var txtTotal: TextView
    private lateinit var txtPropina: TextView
    private lateinit var txtFinal: TextView

    private lateinit var swPropina: MaterialSwitch

    private val pedido = Pedido()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        inicializarControles()
        configurarEventos()
        actualizarTotales()
    }

    private fun inicializarControles() {

        imgLogo = findViewById(R.id.imgLogo)
        imgLogo.load("https://thumbs.dreamstime.com/b/s%C3%ADmbolo-del-logotipo-restaurante-de-la-comida-con-gorra-chef-cuchillo-cocina-cruzado-e-icono-vector-horquilla-263741713.jpg?w=768")

        edtPastel = findViewById(R.id.edtPastel)
        edtCazuela = findViewById(R.id.edtCazuela)

        txtSubPastel = findViewById(R.id.txtSubPastel)
        txtSubCazuela = findViewById(R.id.txtSubCazuela)

        txtTotal = findViewById(R.id.txtTotal)
        txtPropina = findViewById(R.id.txtPropina)
        txtFinal = findViewById(R.id.txtFinal)

        swPropina = findViewById(R.id.swPropina)
    }

    private fun configurarEventos() {

        val textWatcher = object : TextWatcher {

            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
                actualizarTotales()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        }

        edtPastel.addTextChangedListener(textWatcher)
        edtCazuela.addTextChangedListener(textWatcher)

        swPropina.setOnCheckedChangeListener { _, _ ->
            actualizarTotales()
        }
    }

    private fun actualizarTotales() {

        val cantidadPastel =
            edtPastel.text.toString().toIntOrNull() ?: 0

        val cantidadCazuela =
            edtCazuela.text.toString().toIntOrNull() ?: 0

        val subtotalPastel =
            pedido.calcularSubtotalPastel(cantidadPastel)

        val subtotalCazuela =
            pedido.calcularSubtotalCazuela(cantidadCazuela)

        val total =
            pedido.calcularTotal(
                cantidadPastel,
                cantidadCazuela
            )

        val propina =
            if (swPropina.isChecked)
                pedido.calcularPropina(total)
            else
                0

        val totalFinal = total + propina

        val formato =
            NumberFormat.getCurrencyInstance(
                Locale("es", "CL")
            )

        txtSubPastel.text =
            getString(R.string.subtotal, formato.format(subtotalPastel))

        txtSubCazuela.text =
            getString(R.string.subtotal, formato.format(subtotalCazuela))

        txtTotal.text = formato.format(total)

        txtPropina.text = formato.format(propina)

        txtFinal.text = formato.format(totalFinal)
    }
}