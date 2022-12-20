package com.miguelalvrub.superheroes_practica.presentation

import com.miguelalvrub.superheroes_practica.data.BiographyDataRepository
import com.miguelalvrub.superheroes_practica.data.SuperHeroDataRepository
import com.miguelalvrub.superheroes_practica.data.WorkDataRepository
import com.miguelalvrub.superheroes_practica.domain.GetSuperHeroFeedUseCase
import com.miguelalvrub.superheroes_practica.presentation.feed.SuperHeroFeedViewModel

class SuperHeroFactory {

    fun provideSuperHeroViewModel() = SuperHeroFeedViewModel(
        GetSuperHeroFeedUseCase(SuperHeroDataRepository(), BiographyDataRepository(), WorkDataRepository())
    ) //la dependencia del viewModel nos la va a proveer una factoria de objetos (SuperHeroFactory)


}
