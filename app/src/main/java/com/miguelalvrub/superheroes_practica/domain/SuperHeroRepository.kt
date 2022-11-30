package com.miguelalvrub.superheroes_practica.domain

/**
 * Ahora habría que hacer un repositorio por modelo, aunque en este caso se ha decicido que se ponen los 3 "repositorios" (por los 3 modelos/clases que hay en models)
 * en un mismo repositorio que los englobe, porque estos son pequeños o tienen pocos métodos.
 *
 * los repositorios son INTERFACES, implementan funcione/metodos que se usarán en el proyecto pero sin definirlas, eso se hará en los casos de uso
 */
interface SuperHeroRepository {
    /**
     *  suspend fun ... le dice al compilador que a la funcion se le permite "suspenderse" o retrasarse. ¿Se lanza despues que sin ella?
     */
    suspend fun getSuperHero(): List<SuperHero> //creo que esta pedirá la la lista entera de superHeroes
    suspend fun getSuperHeroByiD(superHeroId: Int): SuperHero? //esto pide un superHeroe(con un superhero.id) filtrandolo por id que yo le pase. la interrogacion es que puede devolver null
}

interface BiographyRepository {
    fun getBiography(superHeroId: Int): Biography //Pedimos la biografia con ID por parametro para mostrar solo la del heroe en cuestion
}

interface WorkRepository {
    fun getWork(superHeroId: Int): Work//Pedimos el trabajo por ID igual que la bio
}