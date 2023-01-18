//todo: Du hast heute ranges kennengelernt.
// In der Aufgabendatei findest du eine Liste namens satz.
// Verwende für jede Teilaufgabe eine Schleife deiner Wahl.
// (Es darf auch die gleiche Schleife für alle Teilaufgaben sein)
// a) Gib den Inhalt der Liste rückwärts in der Konsole aus.
// In der Konsole sollte folgendes ausgegeben werden:
// Heute ist ein sehr schöner Tag

//todo: b) Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus.
// Diesmal allerdings nur jedes zweite Wort.
// In der Konsole sollte folgendes ausgegeben werden:
// ist sehr Tag

//todo: c) Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus. allerdings nur die ersten 3 Wörter.
// In der Konsole sollte folgendes ausgegeben werden:
// Heute ist ein

fun main() {
    val satz: List<String> = listOf("Tag ", "schöner ", "sehr ", "ein ", "ist ", "Heute ")

    var a = satz.asReversed()
    println(a)
    println("")

    var b = a
    for(i in 1..b.size-1 step 2){
        println(b[i])
    }
    println("")

    var c = a
    for(i in 0..2){
        println(c[i])
    }
}
