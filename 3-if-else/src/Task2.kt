/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    val x = 4
    val y = 3

    if (x > y)
        println("Prima cifra este mai mare ca cifra a doua")
    else if ( y > x)
        println("A doua cifra este mai mare ca prima cifra")
    else
        println("= sau :(")
}