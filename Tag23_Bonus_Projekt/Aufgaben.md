
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">For Schleifen</h3>


#### Beschreibung:

Willkommen zurück zu den Bonusaufgaben an Tag 23. 




#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Schleifen → Implementieren → for-i Schleife implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.grptvljftk48)
  - [Handbuch: Schleifen → Verstehen → Schleifen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.6sfgr2lqqnys)
  - [Handbuch: Listen → Implementieren → Größe einer Liste lesen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.bvtmwoufzcex)
  - [Handbuch: Listen → Implementieren:MutableList → Wert in MutableList an Index ändern](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.x824jd5wl02t)

---


<details>
<summary> <b> Aufgabe 1 - Gemälderaub </b> </summary>

In dieser Aufgabe sollt ihr ein Spiel programmieren, bei dem es darum geht in ein Museum einzubrechen und Gemälde zu stehlen. Ihr steckt die Gemälde alle in einen Beutel mit unendlich großem Raum. Am Anfang befinden sich alle Gemälde in einem Museum. Nachdem ihr ein Gemälde gestohlen habt, befindet es sich in eurem Beutel und nicht mehr im Museum. Außerdem soll es in dem Museum unterschiedlich teure Gemälde geben. Überlegt euch eine faire Aufteilung zwischen teurer und billiger Kunst, die im Museum ausgestellt wird z.B. 4 sehr billige, 3 billige, 2 normale, 2 teure und 1 sehr teures Gemälde. Die Polizei ist euch dabei allerdings immer auf den Versen. Jedes mal, wenn ihr ein Gemälde stehlt, soll der Verdacht gegen euch steigen, sodass es immer riskanter wird ein weiteres Gemälde mitzunehmen. 

Wir simulieren den Verdacht mit einem Würfelwurf. Es soll ein Wert zwischen 1 und 100 gewürfelt werden, der entscheidet, ob die Polizei uns erwischt z.B. bei allen Werten unter 25 haben wir verloren und die Polizei hat uns erwischt. Wenn wir also ein Gemälde stehlen wollen, wird gewürfelt und das Ergebnis entscheidet jedes mal, ob wir Erfolg haben oder nicht und der nächste Wurf soll dann riskanter werden. Um den Wurf riskanter zu machen, soll der nächste Wurf dann nur noch eine Zahl zwischen 1 und 90 sein. Der Spieler soll auch jedes mal die Möglichkeit haben die Flucht zu ergreifen, wenn es zu riskant wird. Dadurch wird das Spiel auch beendet.       

Zusatz: Wertet am Ende aus wie viele Gemälde ihr gestohlen habt und gebt ihnen eventuell auch einen Preis auf dem Schwarzmarkt. Baut eventuell Möglichkeiten ein euren Verdacht zu verringern.



**Datei für die Aufgabe:** * Aufgabe01.kt*


</details>

---

