fun main(args: Array<String>) {

    val p = Personz()
    p.name = "jack"
    println("${p.name}"+"\n"+"${p.email}")
}

class Personz {
    var name: String = "defaultValue"
        get() = field

        set(value) {
            field = value
        }
    var email:String="dsdsdqsd"
        get() = field

        set(value) {
            field = value
        }
    var password:String="dsdsdqsd"
        get() = field

        set(value) {
            field = value
        }
}