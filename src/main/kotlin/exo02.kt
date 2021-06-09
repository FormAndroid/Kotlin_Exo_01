/*
2) Réaliser un programme de cotation d'un eleve
   L'utilisateur encode une cotation de 0 jusqu'à 20.

   Le programme créer une variable avec le grade correspondant :
      • 20    : Excellent
      • 17-19 : Très bien
      • 13-16 : Bien
      • 10-12 : Suffisant
      • 8-9   : Insuffisant
      • 0-7   : Echec
   Le grade est ensuite affiché sur la console.
 */

fun main() {

    print("Veuillez encoder votre résultat : ")
    val result: Double = readLine()!!.toDouble()

    val grade = when {
        result !in 0.0..20.0 -> null
        result == 20.0 -> "Excellent"
        result >= 17 -> "Très bien"
        result >= 13 -> "Bien"
        result >= 10 -> "Suffisant"
        result >= 8 -> "Insuffisant"
        else -> "Echec"
    }

    if(grade != null) {
        println("Votre grade est $grade")
    }
    else {
        println("Erreur lors de l'encodage du résultat")
    }


//    // Solution alternative
//    val grade = when(result) {
//        !in 0.0..20.0 -> null
//        20.0 -> "Excellent"
//        in 17.0..19.0 -> "Très bien"
//        in 13.0..16.0 -> "Bien"
//        in 10.0..12.0 -> "Suffisant"
//        8.0, 9.0-> "Insuffisant"
//        else -> "Echec"
//    }

}