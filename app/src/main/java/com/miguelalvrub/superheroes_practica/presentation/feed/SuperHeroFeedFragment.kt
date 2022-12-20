package com.miguelalvrub.superheroes_practica.presentation.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.miguelalvrub.superheroes_practica.databinding.FragmentSuperHeroPracticaFeedBinding
import com.miguelalvrub.superheroes_practica.presentation.SuperHeroFactory

class SuperHeroFeedFragment() : Fragment() {

    private var binding: FragmentSuperHeroPracticaFeedBinding? = null //creo un binding para poder usarlo en el onCreate y en el onDestroy (para que no se quede en memoria) y que no sea null (por eso el ?)
    private val viewModel = SuperHeroFactory().provideSuperHeroViewModel() //se añaden las dependencias del view model en el fragment

    override fun onCreateView(  //creo el onCreateView para que se ejecute al iniciar la app (y se pueda ver)
        inflater: LayoutInflater, //inflamos el layout (lo que hace es coger el xml y convertirlo en codigo) y lo guardamos en el binding (para que no se quede en memoria)
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? { //cuando la actividad es destruida necesitamos poner el binding a null
        binding = FragmentSuperHeroPracticaFeedBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    private fun setupObserver(){
        val superHeroFeedSubscriber = Observer<SuperHeroFeedViewModel.UiState> { uiState ->
            //Aqui se recibe el modelo con los estados.
        }
        viewModel.uiState.observe(viewLifecycleOwner, superHeroFeedSubscriber)
    }
}