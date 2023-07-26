/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    println(getMaxNumberString(3,3))
}

fun getMaxNumberString(first:Int, second:Int): String{
    val result = if(first>second)
            "первое число больше"
        else if (second>first)
            "второе число больше"
        else
            "числа равны"

    return result
}