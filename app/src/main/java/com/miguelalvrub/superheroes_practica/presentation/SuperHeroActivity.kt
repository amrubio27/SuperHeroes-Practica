package com.miguelalvrub.superheroes_practica.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.miguelalvrub.superheroes_practica.databinding.ActivitySuperHeroPracticaBinding

class SuperHeroActivity : AppCompatActivity() { //creo la clase SuperHeroPracticaActivity que hereda de AppCompatActivity (que es una clase de android) y que implementa la interfaz SuperHeroPracticaView (que es la que he creado yo)

    /**ActivitySuperHeroBinding es una clase que se activa en android cuando se pone el view binding
     * el nombre viene del layout activity_super_hero.xml lo convierte a ActivitySuperHeroBinding sustituyendo las barras bajas(underscore) por CamelCase y añadiendo Binding
     * importante revisar si en el BuildGradle
     * en mi caso se llama activity_super_hero_practica será ActivitySuperHeroPracticaBinding
     */

    private var binding: ActivitySuperHeroPracticaBinding? = null //creo un binding para poder usarlo en el onCreate y en el onDestroy (para que no se quede en memoria) y que no sea null (por eso el ?)

    override fun onCreate(savedInstanceState: Bundle?) { //creo el onCreate para que se ejecute al iniciar la app (y se pueda ver)
        super.onCreate(savedInstanceState) //llamo al onCreate de la clase padre (AppCompatActivity) para que se ejecute
        binding = ActivitySuperHeroPracticaBinding.inflate(layoutInflater) //inflamos el layout (lo que hace es coger el xml y convertirlo en codigo) y lo guardamos en el binding (para que no se quede en memoria)
        setContentView(binding!!.root) // le decimos que el layout es el root del binding (el root es el layout) y lo ponemos en el setContentView (para que se vea en pantalla)
    }

    override fun onDestroy() {
        super.onDestroy() // para que no se quede en memoria el binding
        binding = null //cuando la actividad es destruida necesitamos poner el binding a null
    }
}