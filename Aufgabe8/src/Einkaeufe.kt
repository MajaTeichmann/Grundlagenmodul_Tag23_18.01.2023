//todo: In dieser Aufgabe geht es darum, eine MutableList zu verändern. In der Aufgabendatei findest du eine Liste mit
// dem Namen shoppingList, in der Lebensmittel in Form von Strings gespeichert sind.
// Deine Aufgabe ist es vor jedes Lebensmittel die Stelle zu schreiben, an der es in der MutableList steht.
// Verwende in deiner Lösung eine Schleife deiner Wahl.
// Du sollst also die MutableList von
// "Reis", "Tofu", "Brokkoli", ... zu "1. Reis", "2. Tofu", "3. Brokkoli", ... ändern.
// Tipp: Wenn du einen Integer zu einem String hinzufügen willst, musst du .toString() verwenden.

// Ein Beispiel:
// var name: String = "Keanu"
// var alter: Int = 21
// var nameUndAlter = alter.toString() + name

fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    var aufzaehlung: List<String> = listOf("1. ","2. ","3. ","4. ","5. ","6. ","7. ","8. ","9. ")

//    for(i in 0..shoppingList.size-1) {
//        if (shoppingList[i] == "Reis") {
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Tofu"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Brokkoli"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Nudeln"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Apfelsaft"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Zitronen"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Eis"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Erdbeeren"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//        if (shoppingList[i] == "Torte"){
//            shoppingList[i] = aufzaehlung[i] + shoppingList[i]
//        }
//    }
//    println(shoppingList)

    for(i in 0..shoppingList.size-1) {
        shoppingList[i] = aufzaehlung[i] + shoppingList[i]
    }
    println(shoppingList)
}