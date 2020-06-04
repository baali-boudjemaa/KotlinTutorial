object Test {
    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}

fun main(args: Array<String>) {
    val result: Int

    result = Test.makeMe12()

    println("b = ${Test.b}")
    println("result = $result")
}