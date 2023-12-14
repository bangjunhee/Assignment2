
class MenuControl {
    private lateinit var choosedMenu: MenuInterface
    var cart = Cart()
    lateinit var selectedMenu: MenuInfo
    fun menuSelect(x: Int){
        var num = x
        while(true) {
            when (num) {
                1 -> choosedMenu = BurgerMenu()
                2 -> choosedMenu = HappySnackMenu()
                3 -> choosedMenu = SIdeMenu()
                4 -> choosedMenu = CafeMenu()
                else -> {println("구현 예정")
                    break}
            }
            if (choosedMenu.printMenu().number == 0) break
            else cart.myCart.add(choosedMenu.printMenu())
        }
    }
}