class naslednic(var anomer:String, var adata:String, var atime:Int, var akod:Int):phone(anomer, adata, atime, akod) {

    var cena:Int = 3
    override fun price() {
        println("Стоимость разговора ${atime * cena}")
    }

    override fun info() {
        println("Номер $nomer\nДата разговора: $data\nВремя разговора: $time\nКод города: $kod")
    }
}