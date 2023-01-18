<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Schleifen</h3>

#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 23. Heute üben wir die Schleifen die wir in den letzten Tagen kennengelernt haben. Viel Spaß!




#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Schleifen → Verstehen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.9kdfa734exf0)
  - [Handbuch: Schleifen → Implementieren → for-in-Schleife implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.n1r5ogj2srdx)

---


<details>
<summary> <b> Aufgabe 1 - Menu </b> </summary>

In der ersten Aufgabe sollst du eine For-Schleife schreiben.
Du findest in der Aufgabendatei eine Liste mit dem Namen "menu",  
in der verschiedene Gerichte stehen.  
Deine Aufgabe ist es diese Gerichte nun mit einer For-Schleife einzeln auszugeben.

**Modul für die Aufgabe:** Aufgabe1  
**Datei für die Aufgabe:** Menu.kt

</details>

---

<details>
<summary> <b> Aufgabe 2 - Programmfluss verstehen I </b> </summary>

- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
fun main() {
  val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
  for(i in 0..books.size-1) {
    val book = books[i]
    println("Das Buch an der Stelle $i ist $book.")
  }
  println("Das waren alle Buecher")
}
```

**Modul für die Aufgabe:** Aufgabe2  
**Datei für die Aufgabe:** TextAbgabe.kt

</details>

---

<details>
<summary> <b> Aufgabe 3 - Programmfluss verstehen II </b> </summary>

- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
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
```

**Modul für die Aufgabe:** Aufgabe3  
**Datei für die Aufgabe:** TextAbgabe.kt

</details>

---

<details>
<summary> <b> Aufgabe 4 - Programmfluss verstehen III </b> </summary>

- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
fun main() {
  val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
  for (i in 2..brands.size - 1) {
    println(brands[i])
  }
}
```

**Modul für die Aufgabe:** Aufgabe4  
**Datei für die Aufgabe:** TextAbgabe.kt

</details>


---

<details>
<summary> <b> Aufgabe 5 - Programmfluss verstehen IV </b> </summary>

- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
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
```

**Modul für die Aufgabe:** Aufgabe5  
**Datei für die Aufgabe:** TextAbgabe.kt


</details>

---

<details>
<summary> <b> Aufgabe 6 - Programmfluss verstehen V </b> </summary>

- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
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
```

**Modul für die Aufgabe:** Aufgabe6  
**Datei für die Aufgabe:** TextAbgabe.kt

</details>

---

<details>
<summary> <b> Aufgabe 7 - Programmfluss verstehen VI </b> </summary>

- Beschreibe in einem Text Schritt für Schritt, was das folgende Programm macht.
- Schreibe deine Antwort dann in den Kommentar in der Aufgabendatei.

```kotlin
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
```

**Modul für die Aufgabe:** Aufgabe7  
**Datei für die Aufgabe:** TextAbgabe.kt

</details>

---

<details>
<summary> <b> Aufgabe 8 - Einkäufe auflisten </b> </summary>

In dieser Aufgabe geht es darum, eine MutableList zu verändern. 
In der Aufgabendatei findest du eine Liste mit dem 
Namen shoppingList, in der Lebensmittel in Form von Strings gespeichert sind.   
Deine Aufgabe ist es vor jedes Lebensmittel die Stelle zu schreiben, an der es 
in der MutableList steht.

- Verwende in deiner Lösung eine Schleife deiner Wahl.

Du sollst also die MutableList von 

"Reis", "Tofu", "Brokkoli", ... 

zu

"1. Reis", "2. Tofu", "3. Brokkoli", ... 

ändern.

Tipp: Wenn du einen Integer zu einem String hinzufügen willst, musst du .toString() verwenden.  
Ein Beispiel:
```kotlin
var name: String = "Keanu"
var alter: Int = 21
var nameUndAlter = alter.toString() + name
```

**Modul für die Aufgabe:** Aufgabe8  
**Datei für die Aufgabe:** Einkaeufe.kt

</details>

---

<details>
<summary> <b> Aufgabe 9 - Schleifen und Listen </b> </summary>

Du hast heute ranges kennengelernt.  
In der Aufgabendatei findest du eine Liste namens satz.  

- Verwende für jede Teilaufgabe eine Schleife deiner Wahl.  
  (Es darf auch die gleiche Schleife für alle Teilaufgaben sein)

a)

Gib den Inhalt der Liste rückwärts in der Konsole aus.

In der Konsole sollte folgendes ausgegeben werden:  
`Heute ist ein sehr schöner Tag `

b)

Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus.  
Diesmal allerdings nur jedes zweite Wort.  

In der Konsole sollte folgendes ausgegeben werden:  
`ist sehr Tag`

c)

Gib den Inhalt der Liste noch einmal rückwärts in der Konsole aus.
allerdings nur die ersten 3 Wörter.

In der Konsole sollte folgendes ausgegeben werden:  
`Heute ist ein`


**Modul für die Aufgabe:** Aufgabe9  
**Datei für die Aufgabe:** SchleifenUndListen.kt
</details>

---

<details>
<summary> <b> Aufgabe 10 - Ratespiel </b> </summary>

Wir wollen ein kleines Ratespiel schreiben.

a)

Das Spiel besteht aus einem Spieler (Du) und einem Computerspieler.  
Wenn das Programm gestartet wird, denkt sich der Computer eine 
zufällige Zahl zwischen 1 und 100 aus.  
(Dieser Teil ist bereits vorgegeben.)

Der Spieler versucht dann die Zahl zu erraten.

- Der Spieler gibt über die Konsole mit der readln()-Funktion eine Zahl ein.
  - Wenn die eingegebene Zahl kleiner ist, als die Zahl des Computers,
  wird in der Konsole "Zu klein!" ausgegeben.
  - Wenn die eingegebene Zahl größer ist, als die Zahl des Computers,
  wird in der Konsole "zu groß" ausgegeben.
  - Ist die eingegebene Zahl gleich der Zahl des Computers, 
  wird in der Konsole "Du hast gewonnen!" ausgegeben.
  

- Wenn die eingegebene Zahl kleiner oder größer war (Der Spieler also falsch lag), wird die Runde wiederholt,
solange bis der Spieler die Zahl erraten hat.

b)

Zähle jetzt zusätzlich auch die Anzahl an Versuche, die der Spieler 
gebraucht hat, bis er die Zahl des Computers erraten konnte.

c)

Sei kreativ und erweitere dein Spiel wie du möchtest und mach es somit einzigartig.

**Modul für die Aufgabe:** Aufgabe10  
**Datei für die Aufgabe:** TextAbgabe.kt
</details>

---
