package laban.program

fun main(args: Array<String>){

println("The length of the string is: ${returnLength(100)}")
}

fun returnLength(obj:Any):Int?{
    if (obj is String){
        return obj.length
    }
    else{
        return null
    }
}