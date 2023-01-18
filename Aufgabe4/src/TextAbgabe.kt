//todo: Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
// Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}

/*
Schreibe hier deine Antwort hin.

-> in der fun main() wird eine Konstante Liste namens 'brands' angelegt und mit den Marken "Samsung", "Apple", "PH" und "Microsoft" gefüllt.
-> für jeden abgefragten Index (i) vom Index 2 bis zum Ende der Liste (also Index 3) soll die Schleife wiederholt werden (Range).
-> wenn der abgefragte Index in der Range enthalten ist, soll die Marke auf dem abgefragten Index ausgegeben werden.

 */