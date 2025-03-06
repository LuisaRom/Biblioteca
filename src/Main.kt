//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val lstLibros = mutableListOf<Libro>()

    val Libro1 = Libro("Cien años de Soledad","Gabriel Garcia Maquez", "12345", 432, 50.000, 3 )
    val Libro2 = Libro("El Principito", "Antoine de Saint-Exupery", "67890", 96, 35.000, 1 )
    val Libro3 = Libro("Deja de ser Tu", "Joe Dispenza", "24680", 350, 45.000, 5)


    lstLibros.add(Libro1)
    lstLibros.add(Libro2)
    lstLibros.add(Libro3)


    while (true){
        println("BIBLIOTECA")
        println("1. Prestar Libro:")
        println("2. Devolver Libro:")
        println("3. Informacion Libros:")
        println("4. Salir")
        println("Selecciona una opcion:")

        when (readln().toIntOrNull()) {
            1 -> {
                print("\nIngresa el ISBN del libro que quieres prestar: ")
                val isbn = readln()
                val libro = lstLibros.find { it.isbn == isbn }
                if (libro != null) {
                    libro.prestarLibro()
                } else {
                    println("No hay un libro con ese ISBN.")
                }
            }

            2 -> {
                print("\nIngresa el ISBN del libro que quieres devolver: ")
                val isbn = readln()
                val libro = lstLibros.find { it.isbn == isbn }
                if (libro != null) {
                    libro.devolverLibro()
                } else {
                    println("No hay un libro con ese ISBN.")
                }
            }

            3 -> {
                print("\nIngresa el ISBN del libro que quieres ver: ")
                val isbn = readln()
                val libro = lstLibros.find { it.isbn == isbn }
                if (libro != null) {
                    libro.infoLibro()
                } else {
                    println("No hay un libro con ese ISBN.")
                }
            }

            4 -> {
                println("Saliendo de la biblioteca")
                break
            }

            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    }
}