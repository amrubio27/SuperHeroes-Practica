package com.miguelalvrub.superheroes_practica.presentation.feed

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miguelalvrub.superheroes_practica.domain.GetSuperHeroFeedUseCase

class SuperHeroFeedViewModel(private val getSuperHeroFeedUseCase: GetSuperHeroFeedUseCase) :
    ViewModel() { //añandimos el useCase al viewModel que nos devuelve el feed de superHero

        val uiState: MutableLiveData<UiState> by lazy { //creamos un livedata que nos va a devolver un UiState
            MutableLiveData<UiState>() //el livedata es un observable que nos va a devolver un UiState
        }

        data class UiState(
            val isLoading: Boolean = false, //indica si la vista esta cargando o no
            val superHeroFeed: List<GetSuperHeroFeedUseCase.SuperHeroFeed>? = null, //variable que nos devuelve el feed de superHero (lista de superHeroes) y puede ser nula.
        )

}