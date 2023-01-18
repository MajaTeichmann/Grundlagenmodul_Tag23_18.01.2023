//todo: In der ersten Aufgabe sollst du eine For-Schleife schreiben. Du findest in der Aufgabendatei eine Liste mit dem
// Namen "menu", in der verschiedene Gerichte stehen.
// Deine Aufgabe ist es diese Gerichte nun mit einer For-Schleife einzeln auszugeben.

val menu: List<String> = listOf("Hühnchen", "Kartoffeln", "Fisch")
var gericht = 0

fun gerichteAusgeben(){
    for(i in menu){
        println(menu[gericht])
        gericht++
    }
}

fun main(){
    gerichteAusgeben()
}