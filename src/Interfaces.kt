interface MyInterface {

    var test: String   // abstract property

    fun foo(): String          // abstract method
    fun hello() {
        print("ezeaze")
    } //method with default implementation
}
class InterfaceImp : MyInterface {

    override var test: String = "zzzzzeee"
    override fun foo() = "Lol"
}
fun main(args: Array<String>) {
    val obj = InterfaceImp()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing foo(): ")
    println(obj.foo())
}
