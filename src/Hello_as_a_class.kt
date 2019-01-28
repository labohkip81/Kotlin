package laban.program
import java.util.*
//this takes hello world as an object
class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Hello World")
            println(sum(1,20))
            println(laban)

        }
    }
}
var laban: Int = Test_average(100,60,90)


//using a function in kotlin
fun sum(a:Int,b:Int):Int{
    return a+b
}
//This program calculates the average for a test taken by students
fun Test_average(Math:Int,Kis:Int,Eng:Int):Int{
    return (Math+Kis+Eng)/3
}