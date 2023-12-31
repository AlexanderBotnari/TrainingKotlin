/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    println(getAvaibleAuto(22, 3))
}

fun getAvaibleAuto(age: Int, experience: Int):String{
    val result = if(age >= 26 && experience>=6)
        "all auto avaible"
    else if (age >= 21 && experience >= 2)
        "common auto avaible without audi and bmw"
    else
        "age or experience error"

    return result
}