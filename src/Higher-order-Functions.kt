
// lambda expression
var lambda = {
    a:Int -> 5*a
}
fun lam( lmbd: (Int) -> Int ) {     // accepting lambda as parameter
var a=lmbd(2);
println(a)
}

fun printMe(s:Int,n:Int,b:Int): Int{
    return s+n;
}

fun higherfunc( v:Int) : (Int,Int,Int) -> Int{
  return  ::printMe;
}

fun mul(a: Int, b: Int): Int{
    return a*b
}
//higher-order function declaration
fun higherfuncs(a:Int) : (Int,Int)-> Int{
    return ::mul
}

fun higherfunc( str : String, mycall :(String)-> Unit) {
    //inovkes the print() by passing the string str
    mycall("eeeeeeee")
}


fun main(args: Array<String>) {

    lam {2};
    // invoke higher-order function
   //var a=:: higherfunc
   // a(2,::printMe)


    val multiply =higherfuncs(2)
    // invokes the mul() function by passing arguments
    val result = multiply(2,2)
    println("The multiplication of two numbers is: $result")
}

