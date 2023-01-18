//todo: Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
// Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

fun main() {
    val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)
    for (i in 0..speedLimits.size - 1) {
        if (speedLimits[i] == 30) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 80) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 120) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        }
    }
}

/*
Schreibe hier deine Antwort hin.

-> in der fun main() wird eine Konstante Liste namens 'speedLimits' angelegt und mit 5 Integern gefüllt.
-> für jeden abgefragten Index (i) vom Index 0 bis letzten Index der Liste (also Index 4), soll die Schleife wiederholt werden (Range).
-> wenn der abgefragte Index gleich 30 ist, soll "auf der " + (Indexposition) + ". Strasse kann man " + 30 "km/h fahren." in der Konsole ausgegeben werden.
-> wenn die 1. bedingung NICHT zutrifft, soll stattdessen geprüft werden, ob der abgefragte Index gleich 80 ist.
 trifft dies zu, soll "auf der " + (Indexposition) + ". Strasse kann man " + 80 "km/h fahren." in der Konsole ausgegeben werden.
 -> wenn diese Bedingung ebenfalls NICHT nicht zutrifft, soll stattdessen geprüft werden, ob der abgefragte Index gleich 120 ist.
 trifft dies zu, soll "auf der " + (Indexposition) + ". Strasse kann man " + 120 "km/h fahren." in der Konsole ausgegeben werden.
 -> trifft das immernoch NICHT zu, bleibt die Konsole in dieser Runde leer.
 */