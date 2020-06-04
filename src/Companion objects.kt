class Persons {
    companion object Test {
        fun callMee() = println("I'm called.")
    }
    fun callMes() = println("I'm called.")
}
fun String.removeFirstLssastChar(): String =  this.substring(1, this.length - 1)
fun String.addchajr(a:String):String=this.replace("a",a);
fun main(args: Array<String>) {
    //Persons.callMee()
    val myString= "Hello Everyone"

    val str="daafdfq"
println( myString.removeFirstLssastChar())
    println( str.addchajr("zeee"))

}