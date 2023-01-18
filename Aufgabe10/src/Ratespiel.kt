import kotlin.random.Random

//todo: Wir wollen ein kleines Ratespiel schreiben.
// a) Das Spiel besteht aus einem Spieler (Du) und einem Computerspieler.
// Wenn das Programm gestartet wird, denkt sich der Computer eine zufällige Zahl zwischen 1 und 100 aus.
// (Dieser Teil ist bereits vorgegeben.)
// Der Spieler versucht dann die Zahl zu erraten.
// Der Spieler gibt über die Konsole mit der readln()-Funktion eine Zahl ein.
// Wenn die eingegebene Zahl kleiner ist, als die Zahl des Computers, wird in der Konsole "Zu klein!" ausgegeben.
// Wenn die eingegebene Zahl größer ist, als die Zahl des Computers, wird in der Konsole "zu groß" ausgegeben.
// Ist die eingegebene Zahl gleich der Zahl des Computers, wird in der Konsole "Du hast gewonnen!" ausgegeben.
// Wenn die eingegebene Zahl kleiner oder größer war (Der Spieler also falsch lag), wird die Runde wiederholt, solange
// bis der Spieler die Zahl erraten hat.
// b) Zähle jetzt zusätzlich auch die Anzahl an Versuche, die der Spieler gebraucht hat, bis er die Zahl des Computers erraten konnte.
// c) Sei kreativ und erweitere dein Spiel wie du möchtest und mach es somit einzigartig.

fun main() {
    val computerGuess = Random.nextInt(1, 100)

}