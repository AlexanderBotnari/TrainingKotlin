/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/
data class User(val name:String, val age:Int)
fun main() {
    val users = listOf(
        User("Ion", 30),
        User("Sergiu", 33),
        User("Sandu", 33)
    )

    val result = elementsCount(users){it.age == 33}
    println(result)
}

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int{
    var count = 0
    for (user in users){
        if (condition(user)){
            count++
        }
    }
    return count
}