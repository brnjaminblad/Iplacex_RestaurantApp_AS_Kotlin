# 🍽️ Restaurant App - Kotlin

Aplicación Android desarrollada en Kotlin para el Taller N°1 de la asignatura **Programación II** de IPLACEX.

## 📖 Descripción

Restaurant App es una aplicación móvil que simula el proceso de toma de pedidos en un restaurante de comida chilena. Permite ingresar la cantidad de platos solicitados por el cliente, calcular automáticamente los subtotales, agregar una propina opcional del 10% y visualizar el total final de la cuenta.

El proyecto fue desarrollado aplicando conceptos fundamentales de Kotlin, Programación Orientada a Objetos (POO) y desarrollo de interfaces Android utilizando componentes de Material Design.

---

## 🚀 Funcionalidades

* Registro de cantidades para cada plato disponible.
* Cálculo automático de subtotales.
* Cálculo del total de la cuenta.
* Inclusión opcional de propina del 10%.
* Actualización dinámica de los montos mediante eventos.
* Formato de moneda en pesos chilenos.
* Interfaz amigable basada en Material Design.

---

## 🍲 Menú disponible

| Plato            | Precio  |
| ---------------- | ------- |
| Pastel de Choclo | $12.000 |
| Cazuela          | $10.000 |

---

## 🛠️ Tecnologías utilizadas

* Kotlin
* Android Studio
* Android SDK
* Material Design Components
* ConstraintLayout
* View System (XML)

---

## 📂 Estructura del proyecto

```text
com.example.iplacexrestaurantapp_askotlin
│
├── MainActivity.kt
│
└── modelo
    ├── Platillo.kt
    └── Pedido.kt
```

### Platillo.kt

Clase que representa un plato del restaurante mediante su nombre y precio.

### Pedido.kt

Clase encargada de la lógica de negocio:

* Cálculo de subtotales.
* Cálculo de total.
* Cálculo de propina.
* Gestión de la lista de platillos disponibles.

### MainActivity.kt

Clase principal responsable de:

* Gestionar la interfaz gráfica.
* Capturar datos ingresados por el usuario.
* Gestionar eventos.
* Actualizar automáticamente los montos mostrados en pantalla.

---

## 📱 Componentes Android utilizados

Para cumplir los requisitos del taller se utilizaron:

* TextView
* EditText
* ImageView
* Switch / MaterialSwitch
* ConstraintLayout
* Eventos TextWatcher
* Eventos OnCheckedChangeListener

---

## ⚙️ Funcionamiento

1. El usuario ingresa la cantidad de Pasteles de Choclo.
2. El usuario ingresa la cantidad de Cazuelas.
3. La aplicación calcula automáticamente los subtotales.
4. El usuario puede activar o desactivar la propina mediante un interruptor.
5. El sistema recalcula automáticamente los montos.
6. Se muestra el total final en pesos chilenos.

---

## 📸 Evidencias

### Pantalla principal

Agregar captura de pantalla.

### Cálculo de pedido

Agregar captura de pantalla.

### Pedido con propina

Agregar captura de pantalla.

---

## 🎯 Objetivos académicos cumplidos

* Uso de variables mutables e inmutables.
* Creación y utilización de funciones.
* Aplicación de Programación Orientada a Objetos.
* Uso de colecciones en Kotlin.
* Desarrollo de interfaces Android mediante XML.
* Uso de ConstraintLayout.
* Gestión de eventos.
* Formateo de moneda mediante NumberFormat.

---

## 👨‍💻 Autor

**Brunno Mori**

Taller N°1 - Programación II

Escuela de Informática y Telecomunicaciones

IPLACEX

2026
