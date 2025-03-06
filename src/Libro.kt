class Libro {

    var titulo: String = ""
    var autor: String = ""
    var isbn: String = ""
    var numpaginas: Int = 0
    var precio: Double = 0.0
    var cantdisponible: Int = 1


    constructor()
    constructor(titulo: String, autor: String, isbn: String, numpaginas: Int, precio: Double, cantdisponible: Int) {
        this.titulo = titulo
        this.autor = autor
        this.isbn = isbn
        this.numpaginas = numpaginas
        this.precio = precio
        this.cantdisponible = cantdisponible
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', isbn='$isbn', numpaginas=$numpaginas, precio=$precio, cantdisponible=$cantdisponible)"
    }

    fun prestarLibro( ): Boolean {
        return if (cantdisponible > 0) {
            cantdisponible--
            println("El libro '${titulo}' ha sido prestado")
            true
        } else {
            println("No exite este libro")
            false
        }
    }

    fun devolverLibro(): Int{
        return if (titulo == this.titulo){
            ++ cantdisponible
        }else{
            cantdisponible
        }
    }

    fun infoLibro(){
        println("Titulo: $titulo")
        println("Autor: $autor")
        println("ISBN: $isbn")
        println("# Paginas: $numpaginas")
        println("Precio: $precio")
        println("Cantidad Disponible: $cantdisponible")

    }

}



