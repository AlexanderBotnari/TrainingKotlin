/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.


На вход приходит возраст и стаж водителя. Вывести сообщение о том, может ли он пользоваться каршерингом
и какие авто ему доступны.
*/

fun main() {
    val age = 28
    val trainingAge = 7

    if (age >= 21 && trainingAge >= 2)
        println("Common vehicle")
    else
        println("Error")

    if (age >= 26 && trainingAge >= 6)
        println("Audi and BMW is avaible")
    else
        println("Error")
}