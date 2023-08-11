/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {
    val r = Rectangle(10, 10)
    r.calculateAria()
    r.calculatePerimeter()
    println(r.isRectangleSquare())
}

class Rectangle(val width:Int, val height:Int){

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