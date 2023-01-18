//todo: Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
// Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}

/*
Schreibe hier deine Antwort hin.

-> in der fun main() wird eine Konstante Liste namens 'guests' angelegt und mit 6 Namen gefüllt.
-> für jeden abgefragten Index (i) vom Index 0 bis letzten Index der Liste (also Index 5), soll die Schleife wiederholt werden (Range).
-> wenn der abgefragte Index in der Range gleich "Lukas" ist, soll "Hey Lukas kommt!" ausgegeben werden.
-> wenn der abgefragte Index in der Range gleich "Keanu" ist, soll "Oh cool, Keanu is auch dabei!" ausgegeben werden.
-> wenn der abgefragte Index in der Range gleich "Michael" ist, soll "Wie es Michael wohl geht?" ausgegeben werden.
-> wenn nichts, von diesen 3 "if's" zutrifft, bleibt die Konsole leer.

 */