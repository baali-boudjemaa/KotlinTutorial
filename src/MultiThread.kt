import java.util.*

class  myclass : Thread() {
    override fun run() {
        super.run()
        for (v in 1 .. 100 step 3){
            println("ee"+v)
            Thread.sleep(100
            )
        }


    }


}
class  myclasss : Thread() {
    override fun run() {
        super.run()
        for (v in 1 .. 100 step 2){
            println(v)
            Thread.sleep(100
            )
        }


    }


}
fun  main(){
    var t=myclass();
    var tt=myclasss();
    tt.start()

    t.start()
    }


