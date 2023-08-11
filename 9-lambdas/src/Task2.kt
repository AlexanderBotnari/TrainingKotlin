/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/
data class User(val name:String, val age:Int)

fun main() {

    val users = listOf(
        User("Ion", 30),
        User("Sergiu", 33),
        User("Sandu", 31)
    )

    val result = containsElement(users){it.age < 30}
    println(result)
}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean{
    var flag = false
    for (user in users){
        if (condition(user)){
            flag = true
            break
        }
    }
    return flag;
}