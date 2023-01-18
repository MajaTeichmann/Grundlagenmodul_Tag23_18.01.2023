//todo: Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
// Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}

/*
Schreibe hier deine Antwort hin.

-> in der fun main() werden eine Konstante Liste namens 'fruechteListe' angelegt und mit 4 Fruechten gefüllt
    & eine variable namens 'lieblingsFrucht' mit dem Wert "Erdbeere" angelegt.
-> für jeden abgefragten Index (i) vom Index 3 runter gezählt bis zum Index 0, soll die Schleife wiederholt werden (Range).
-> wenn der abgefragte Index in der Range gleich "Banane" ist, soll die Variable 'lieblingsFrucht' von "Erdbeere" auf "Banane" geändert werden.
-> ansonsten soll, wenn der abgefragte Index NICHT in der Range enthalten ist, die ursprüngliche 'lieblingsFrucht' (="Erdbeere") ausgegeben werden.


 */