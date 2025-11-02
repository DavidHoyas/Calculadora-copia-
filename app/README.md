# Calculadora (copia)

## Introducción

Es una aplicación qeu dada tres cajas de introducción de datos, pase los parámetros introducidos a una segunda pantalla.

---

## Activity.kt

### MainActivity.kt

``` kotlin
package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
enableEdgeToEdge()
setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.tvbuttonNavegar)

        boton.setOnClickListener { view ->
            val intent = Intent(this, SegundaActivity::class.java).apply{
                putExtra("Nombre", "David");
                putExtra("Apellidos", "Hoyas Navarro");
                putExtra("edad", 19);
            }
            startActivity(intent)

        }

    }

}
```

---

### SegundaActivity.kt

``` kotlin
package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
enableEdgeToEdge()
setContentView(R.layout.activity_segunda)

        val boton: Button = findViewById(R.id.tvNavegar)
        boton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val extras = intent.extras
        val name = extras?.getString("Nombre")
        val surname = extras?.getString("Apellidos")
        val age = extras?.getInt("edad")

        val tvNombre = findViewById<TextView>(R.id.tvName2)
        val tvApellidos = findViewById<TextView>(R.id.tvSurname2)
        val tvEdad = findViewById<TextView>(R.id.tvAge2)

        tvNombre.text = name
        tvApellidos.text = surname
        tvEdad.text = age.toString()
    }
}
```

---

## Layout.xml

### Activity_main.xml

``` kotlin
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">

    <TextView
        android:id="@+id/tvMain"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/Texto"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.193" />

    <Button
        android:id="@+id/tvbuttonNavegar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="111dp"
        android:layout_marginTop="42dp"
        android:layout_marginEnd="112dp"
        android:layout_marginBottom="208dp"
        android:text="@string/msg_click_boton"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.52"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvAge" />

    <EditText
        android:id="@+id/tvName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="104dp"
        android:layout_marginTop="39dp"
        android:layout_marginEnd="97dp"
        android:ems="10"
        android:inputType="text"
        android:text="@string/Name"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvMain" />

    <EditText
        android:id="@+id/tvSurname"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="104dp"
        android:layout_marginTop="44dp"
        android:layout_marginEnd="97dp"
        android:ems="10"
        android:inputType="text"
        android:text="@string/Surname"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvName" />

    <EditText
        android:id="@+id/tvAge"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="103dp"
        android:layout_marginTop="48dp"
        android:layout_marginEnd="98dp"
        android:ems="10"
        android:inputType="number"
        android:text="@string/Age"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvSurname" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

---

### Activity_segunda.xml

``` kotlin
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".SegundaActivity">

    <TextView
        android:id="@+id/tvSegunda"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="159dp"
        android:layout_marginEnd="159dp"
        android:text="@string/Texto_Segunda"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.193" />

    <Button
        android:id="@+id/tvNavegar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="111dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="112dp"
        android:layout_marginBottom="208dp"
        android:text="@string/msg_click_boton"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvAge2" />

    <EditText
        android:id="@+id/tvName2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="100dp"
        android:layout_marginTop="56dp"
        android:layout_marginEnd="101dp"
        android:ems="10"
        android:inputType="text"
        android:text="@string/Name"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvSegunda" />

    <EditText
        android:id="@+id/tvSurname2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="99dp"
        android:layout_marginTop="38dp"
        android:layout_marginEnd="102dp"
        android:ems="10"
        android:inputType="text"
        android:text="@string/Surname"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvName2" />

    <EditText
        android:id="@+id/tvAge2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="98dp"
        android:layout_marginTop="47dp"
        android:layout_marginEnd="103dp"
        android:ems="10"
        android:inputType="number"
        android:text="@string/Age"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tvSurname2" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

--- 

## Strings.xml

``` kotlin
<resources>
    <string name="app_name">My Application 2</string>
    <string name="Boton">Ir</string>
    <string name="Texto">Activity1</string>
    <string name="Texto_Segunda">Activity2</string>
    <string name="BotonNavegar">Navegar</string>
    <string name="msg_click_boton">Ir</string>
    <!-- Strings used for fragments for navigation -->

    <string name="Name">Nombre</string>
    <string name="Surname">Apellidos</string>
    <string name="Age">Edad</string>
</resources>
```