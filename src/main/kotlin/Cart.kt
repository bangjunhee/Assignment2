import kotlin.math.round

object Cart {
    var selectedMenuNum: Int = 0
    var myCart: MutableList<MenuInfo> = mutableListOf()
    var sumPrice = 0.0
    fun printMenuInCart(){
        var totalPrice = 0.0
        var count: Int = 1
        println("======================================")
        for(myMenu in myCart){
            println("$count. ${myMenu.name}")
            println("----------Price: ${myMenu.price}")

            totalPrice += myMenu.price
            count++
        }
        println("======================================")
        println(">>>> Total Price: ${round(totalPrice * 10) / 10}")
        sumPrice = totalPrice
    }
}