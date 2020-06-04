import java.io.FileWriter

abstract class People(name: String) {

    init {
        println("My name is $name.")
    }

    open fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String) : People(name) {
    override fun displaySSN(ssn: Int) {

    }

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    try {
        var t= FileWriter("J:/KotlinTutorial/azs.txt",true);
        t.write("eeeeeee")
        t.close()
    }catch (e:Exception){

    }
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}