import java.util.*

/*
4) Réaliser une calculatrice
   Celle-ci permet à l'utilisateur d'effectuer les opérations suivantes :
     - Addition
     - Soustraction
     - Multiplication
     - Division entiere
     - Division réel
     - Le carré d'un nombre
     - Convertir en binaire

    Note : gérer les erreurs possible (cf : la division par zéro)
 */

fun main() {

    println(
        """
        Calculatrice simple d'entier.
        Opération supporter : 
            +   Addition
            -   Soustraction
            x   Multiplication
            //  Division entiere
            /   Division réel
            ^   Carré d'un nombre 
            b   Conversion binaire
    """.trimIndent()
    )

    print("Quel type d'opération : ")
    val op: String = readLine()!!.lowercase(Locale.getDefault())

    val encodeTwoNumber: Boolean = op != "^" || op != "b"

    print(if (encodeTwoNumber) "Encoder le 1er nombre : " else "Encoder la valeur : ")
    val nb1: Int = readLine()!!.toInt()

    val nb2: Int = if (encodeTwoNumber) {
        print("Encoder le 2e nombre : ")
        readLine()!!.toInt()
    } else 0

    var message: String? = null

    val result: Double? = when(op) {
        "+" -> (nb1 + nb2).toDouble()
        "-" -> (nb1 - nb2).toDouble()
        "x", "*" -> (nb1 * nb2).toDouble()
        "//", "div", "/" -> when {
            nb2 == 0 -> {
                message = "Division par Zero !"
                null
            }
            op == "/" -> nb1 / nb2.toDouble()
            else -> (nb1 / nb2).toDouble()
        }
        "^" -> (nb1 * nb1).toDouble()
        "b" -> {
            message = "Valeur binaire: ${Integer.toBinaryString(nb1)}"
            null
        }
        else -> {
            message = "Opérateur non supporté !"
            null
        }
    }

    if(result != null) {
        println("Le resultat de l'opération est : $result")
    }
    else {
        println(message)
    }
}