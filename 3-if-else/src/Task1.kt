/* Вывести на экран большее из двух целых чисел. */

fun main(){
    println("Introduceti prima cifra: ")
    val a = readln().toInt()
    println("Introduceti a doua cifra: ")
    val b = readln().toInt()

    if (a > b)
        println("Prima cifra este mai mare ca cifra a doua")
    else if ( b > a)
        println("A doua cifra este mai mare ca prima cifra")
    else
        println("= sau :(")
}
