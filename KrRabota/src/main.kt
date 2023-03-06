import kotlinx.coroutines.*
import java.lang.NumberFormatException

suspend fun main() = coroutineScope{
    println("Сколько будет фунций?")
    val n:Int = readln()!!.toInt()
    for(i in 1..n){
        println("Введите номер")
        val nomer:String = readln()!!.toString()
        println("Введите дату разговора")
        val data:String = readln()!!.toString()

        try{
            println("Сколько длился разговор (указать в минутах)")
            val time:Int = readln()!!.toInt()
            if(time <= 0){
                println("Время разговора не может быть меньше или равно нулю")
            }
            else{
                println("Введите код города")
                val kod:Int = readln()!!.toInt()
                if(kod <= 0) println("Код города не может быть меньше или равен нулю")

                else{
                    var phone1 = naslednic(nomer, data, time, kod )
                    launch {
                        phone1.price()
                        delay(100)
                    }
                    delay(5000)
                    phone1.info()

                }
            }
        }
        catch (e: NumberFormatException){
            println("Необходимо ввести число")
        }
    }


}