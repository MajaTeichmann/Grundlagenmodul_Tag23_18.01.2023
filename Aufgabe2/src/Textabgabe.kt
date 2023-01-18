//todo: Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
// Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}

/*
Schreibe hier deine Antwort hin.

-> in der fun main() wird eine Konstante Liste namens 'books' angelegt und mit 4 Filmen gefüllt.
-> für jedes Buch in der Liste 'books' soll die Schleife wiederholt werden, bis das Ende der Liste erreicht wurde.
-> jedes Buch wird pro Runde einzeln in die Konstante 'book' abgespeichert und überschreibt das vorherige (erst das Buch an Index-Stelle 0, dann 1, dann 2, dann 3)
-> jedesmal wenn ein Buch in der Konstante 'book' abgespeichert wurde, wird in der Konsole der Index und der Name des Buchs in der Konstante 'book' ausgegeben
-> wenn die Liste 'books' am Ende angelangt ist, wird die Schleife verlassen und die Konsole gibt "Das waren alle Buecher" wieder.

 */