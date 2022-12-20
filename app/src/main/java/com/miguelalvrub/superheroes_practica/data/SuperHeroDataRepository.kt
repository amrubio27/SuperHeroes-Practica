package com.miguelalvrub.superheroes_practica.data

import com.miguelalvrub.superheroes_practica.domain.Biography
import com.miguelalvrub.superheroes_practica.domain.BiographyRepository
import com.miguelalvrub.superheroes_practica.domain.SuperHero
import com.miguelalvrub.superheroes_practica.domain.SuperHeroRepository

class SuperHeroDataRepository : SuperHeroRepository {

    override suspend fun getSuperHero(): List<SuperHero> {
        TODO("Not yet implemented")
    }

    override suspend fun getSuperHeroByiD(superHeroId: Int): SuperHero? {
        TODO("Not yet implemented")
    }


}