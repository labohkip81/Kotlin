package laban.program
//the universal way to define the main function in kotlin.
fun main(args: Array<String>){
    //using String templates

    var a = 1
// simple name in template:
    val s1 = "a is $a"
    a = 2
// arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    //this is picking items from the function defined below

    val bigValue =maxof(20,60)

   println(bigValue)
}

//using if statements

fun maxof(num1:Int,num2:Int): Int{
    if (num1>num2){
        return  num1
    }
    else {
        return num2
    }
}