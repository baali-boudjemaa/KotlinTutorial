fun main(args:Array<String>) {



    va(2)
}
val va : (Int) -> Boolean = { it < 2
}

val filter = { x : Int -> x < 2 }

var  v3={ val1: Int, val2: Int  ->
    println(val1*val2)

}(2,3)