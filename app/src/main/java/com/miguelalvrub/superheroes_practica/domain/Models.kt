package com.miguelalvrub.superheroes_practica.domain

/** He empezado creando el archivo "Models", donde pondré qué datos espero recoger:
 * - para la clase de datos SuperHero en este caso, se coge el id, name y la url de las imagenes con su tipo (si los hubiera)
 * - para la clase de datos byography ...
 * - para la clase de datos work work
 * */
data class SuperHero(val id: Int, val name: String, val urlImages: List<String>) {
    /**En este caso como hay varias imagenes podemos parsarle una lista de ellas, que definiremos entre las llaves
     * getUrlImages es una funcion local que coge cada direccion de las fotos y las guarda en un string en la lista de antes*/

    fun getUrlImageS(): String = urlImages[0]
    fun getUlrImageM(): String = urlImages[1]
    fun getUrlImageL(): String = urlImages[2]
    fun getUrlImageXL(): String = urlImages[3]

}

data class Biography(val realName: String, val alignment: String)
data class Work(val occupation: String)