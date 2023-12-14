class Cart {
    var selectedMenuNum: Int = 0
    var myCart: MutableList<MenuInfo> = mutableListOf()

    fun printMenuInCart(){
        var sumPrice = 0.0
        for(myMenu in myCart){
            println("${myMenu.name}")
            println("          Price: ${myMenu.price}")
            sumPrice += myMenu.price
        }
        println("          Total Price: ${sumPrice}")
    }
    fun addMenuInCart(selectedMenuNum: Int){

    }
}