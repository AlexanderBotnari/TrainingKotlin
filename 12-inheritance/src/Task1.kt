/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

fun main(){
    val rectangle = Rectangle("red", 10, 10)
    rectangle.moveRight(10)
    println("X=${rectangle.x}, Y=${rectangle.y}")

    val round = Round("blue", 10)
    round.moveDown(20);
    println("X=${round.x}, Y=${round.y}")
}

open class Figure(val color:String){
    var x:Int = 0
    var y:Int = 0

    fun moveLeft(step:Int){
        x -= step
    }

    fun moveRight(step: Int){
        x += step
    }

    fun moveDown(step: Int){
        y -= step
    }

    fun moveUp(step: Int){
        y += step
    }
}
class Rectangle(color: String, val width:Int, val height:Int):Figure(color){

    fun calculateAria(){
        println("Aria of rectangle is ${this.width*this.height}")
    }

    fun calculatePerimeter(){
        println("Perimeter of rectangle is ${2*(this.width+this.height)}")
    }

    fun isRectangleSquare(): Boolean{
        if (this.width == this.height){
            return true
        }else{
            return false
        }
    }
}

class Round(color: String, val radius:Int):Figure(color){

    fun calculateAria(){
        println("Aria of round is ${Math.PI*this.radius*this.radius}")
    }

    fun calculateRoundLength(){
        println("Length of round is ${2*Math.PI*this.radius}")
    }
}