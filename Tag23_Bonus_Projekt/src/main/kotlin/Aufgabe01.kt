//todo: In dieser Aufgabe sollt ihr ein Spiel programmieren, bei dem es darum geht in ein Museum einzubrechen und Gemälde zu
// stehlen. Ihr steckt die Gemälde alle in einen Beutel mit unendlich großem Raum. Am Anfang befinden sich alle Gemälde
// in einem Museum. Nachdem ihr ein Gemälde gestohlen habt, befindet es sich in eurem Beutel und nicht mehr im Museum.
// Außerdem soll es in dem Museum unterschiedlich teure Gemälde geben. Überlegt euch eine faire Aufteilung zwischen
// teurer und billiger Kunst, die im Museum ausgestellt wird z.B. 4 sehr billige, 3 billige, 2 normale, 2 teure und 1
// sehr teures Gemälde. Die Polizei ist euch dabei allerdings immer auf den Versen. Jedes mal, wenn ihr ein Gemälde
// stehlt, soll der Verdacht gegen euch steigen, sodass es immer riskanter wird ein weiteres Gemälde mitzunehmen.
//
//todo: Wir simulieren den Verdacht mit einem Würfelwurf. Es soll ein Wert zwischen 1 und 100 gewürfelt werden, der entscheidet,
// ob die Polizei uns erwischt z.B. bei allen Werten unter 25 haben wir verloren und die Polizei hat uns erwischt.
// Wenn wir also ein Gemälde stehlen wollen, wird gewürfelt und das Ergebnis entscheidet jedes mal, ob wir Erfolg haben
// oder nicht und der nächste Wurf soll dann riskanter werden. Um den Wurf riskanter zu machen, soll der nächste Wurf
// dann nur noch eine Zahl zwischen 1 und 90 sein. Der Spieler soll auch jedes mal die Möglichkeit haben die Flucht zu
// ergreifen, wenn es zu riskant wird. Dadurch wird das Spiel auch beendet.
//
//todo: Zusatz: Wertet am Ende aus wie viele Gemälde ihr gestohlen habt und gebt ihnen eventuell auch einen Preis auf dem
// Schwarzmarkt. Baut eventuell Möglichkeiten ein euren Verdacht zu verringern.

//TODO: hier dein Code
fun main() {
    var museum = mutableMapOf<String,Int>(
        "Mona Lisa von Leonardo da Vinci" to 870000000, // sehr teuer
        "Sternennacht von Vincent van Gogh" to 100000000, // teuer
        "Wasser-Garten und das Japanische Steg" to 800000000, // sehr teuer
        "Woman III von Willem de Kooning" to 13750, // sehr billig
        "Montagne Sainte-Victoire von Paul Cézanne" to 20780000, // billig
        "Salvator Mundi von Leonardo da Vinci" to 450000000, // sehr teuer
        "Meules (Heuhaufen) von Claude Monet" to 110700000, // teuer
        "Der Schrei von Edvard Munch" to 119900000, // teuer
        "Birkenwald von Klimt" to 104600000, // normal
        "Junger Mann mit Medaillon von Botticelli" to 92200000, // normal
        "Salvator Mundi von Leonardo da Vinci" to 900000000) // sehr teuer
    var verfuegbareBilder = museum.size-1
    var bildStehlen:String
    var beutel = mutableMapOf<String,Int>()
    var verdachtRange = 1..100
    var polizeiVerdacht = verdachtRange.random()

    println("""
        |Hallo lieber Dieb! Ich hoffe du hast genug Platz in deinem Beutel für diesen großen Raubzug!
        |Aber sei vorsichtig, denn die Polizei hat einen anonymen Tipp bekommen und hält die Augen auf!
    """.trimMargin())
    while (museum.size >= 1){
        println("""
            |Wähle ein Bild:
            |${museum.keys}""".trimMargin())
        bildStehlen = readln()
        if(museum.keys.contains(bildStehlen)){
            beutel.put(bildStehlen,museum.getValue(bildStehlen))
            museum.remove(bildStehlen)
            println(beutel)
            println(museum)
            var beutelGesamtWert = beutel.values.toString()
            println("Gesamtwert der Beute: ${beutelGesamtWert}€")
        }
    }
}