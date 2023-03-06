abstract class phone(var nomer:String, var data:String, var time:Int, var kod:Int) : InterrfacePhone {
    override fun info() {
        println("Выдача информации")
    }

    override fun price() {
        println("Стоимость разговора")
    }
}