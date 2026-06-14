package com.example.iplacexrestaurantapp_askotlin.modelo

class Pedido {

    private val pastelDeChoclo =
        Platillo("Pastel de Choclo", 12000)

    private val cazuela =
        Platillo("Cazuela", 10000)

    fun calcularSubtotalPastel(cantidad: Int): Int {
        return cantidad * pastelDeChoclo.precio
    }

    fun calcularSubtotalCazuela(cantidad: Int): Int {
        return cantidad * cazuela.precio
    }

    fun calcularTotal(
        cantidadPastel: Int,
        cantidadCazuela: Int
    ): Int {

        return calcularSubtotalPastel(cantidadPastel) +
                calcularSubtotalCazuela(cantidadCazuela)
    }

    fun calcularPropina(total: Int): Int {
        return (total * 0.10).toInt()
    }
}