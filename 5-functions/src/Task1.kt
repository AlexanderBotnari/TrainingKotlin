/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {

    val num1 = 3
    val num2 = 4

    val maxNumber = getMaxNumber(num1, num2)

    println(maxNumber)
}

fun getMaxNumber(first: Int, second: Int): Int{
    val result = if(first > second)
        first
    else
        second
    return result
}