// todo: Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
//  Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}

/*
Schreibe hier deine Antwort hin.

-> in der fun main() wird eine Konstante Liste namens 'weekDays' angelegt und mit den Wochentagen von Montag bis Sonntag gefüllt.
-> für jeden Wochentag in der Liste 'weekDays' soll die Schleife wiederholt werden, bis das Ende der Liste erreicht wurde.
-> wenn der abgefragte Tag Samstag ist, soll in der Konsole "am Samstag hab ich frei." ausgegeben werden.
-> wenn der abgefragte Tag Sonntag ist, soll in der Konsole "am Sonntag hab ich frei." ausgegeben werden.
-> ansonsten soll "am Montag (/Dienstag/Mittwochen/Donnerstag/Freitag) muss ich arbeiten." ausgegeben werden

 */