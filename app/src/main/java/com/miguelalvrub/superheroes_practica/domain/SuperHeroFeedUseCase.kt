package com.miguelalvrub.superheroes_practica.domain

class GetSuperHeroFeedUseCase(
    private val superHeroRepository: SuperHeroRepository,
    private val biographyRepository: BiographyRepository,
    private val workRepository: WorkRepository
) {
    /**
     * En este apartado habra que desarrollar las funciones descritas en el repositorio (o repositorios que tengamos para que funcionen correctamente)
     * Casos de uso, lo que queremos que haga la aplicacion. Ej: ver una lista de superheroes.
     * Eso requiere pedir los datos para poder mostrarlos (capa de dominio)
     * y mostrarlos por medio de la UI (capa de presentacion)
     */
    /**
     * Tengo que importar las interfaces (como private val) que me he creado en los repositorios,
     *      PD: no se si al hacer en algun caso varios se importa directamente el repo. o no
     * tengo 3 interfaces: superheroes, biography y work
     * no se si el tema de las private val es porque no es necesario que esten en otro lado más que aquí
     */

    suspend operator fun invoke(): List<SuperHeroFeed> { //creo/llamo? a la funcion invoke para que me devuelva una lista (a la que llamaré SuperHeroFeed)

        val superHeros =
            superHeroRepository.getSuperHero() //me creo una variable que almacene la lista de superHeroes entera (para luego coger cachos)


        //me creo una variable que almacene la lista filtra da que yo quiero
        val list =
            //map transforma los datos que le pase de tipo A a tipo B.
            superHeros.map { superHero -> //si no recuerdo mal, poner un nombre y una flecha ayuda a saber que esta devolviendo (creo que si no pone this.loquesea y es menos claro)
                //creo una variable que almacene work y uso la funcion de su repositorio y le paso el id (poniendo antes el superHero que he dicho, si no es this.id))
                val work = workRepository.getWork(superHero.id)
                //hago lo mismo para la bio
                val biography = biographyRepository.getBiography(superHero.id)
                //Ahora necesito hacer si o si superheroFeed (que será una data class que puede hacerse aqui) describiendo la estructura
                //Describo la estructura de (data class) de superherofeed y de donde se consiguen los datos
                SuperHeroFeed(
                    superHero.id,
                    superHero.name,
                    superHero.getUlrImageM(),
                    work.occupation,
                    biography.realName,
                )
            }
        return list
    }

    //Hago la data class de SuperHeroFeed (con mayuscula y parentesis igual que los otros)
    data class SuperHeroFeed(
        val id: Int,
        val nameSuperHero: String,
        val urlImage: String,
        val occupation: String,
        val realName: String
    )
}


