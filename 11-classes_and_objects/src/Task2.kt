/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val round = Round(10)
    round.calculateAria()
    round.calculateRoundLength()
}

class Round(val radius:Int){

    fun calculateAria(){
        println("Aria of round is ${Math.PI*this.radius*this.radius}")
    }

    fun calculateRoundLength(){
        println("Length of round is ${2*Math.PI*this.radius}")
    }
}