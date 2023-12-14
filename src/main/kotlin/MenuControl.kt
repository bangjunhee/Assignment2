
class MenuControl {
    private lateinit var choosedMenu: MenuInterface
    lateinit var selectedMenu: MenuInfo

    fun menuSelect(x: Int){
        val num = x
        while(true) {
            when (num) {
                1 -> {choosedMenu = BurgerMenu()
                    selectedMenu = choosedMenu.printMenu()}
                2 -> {choosedMenu = HappySnackMenu()
                    selectedMenu = choosedMenu.printMenu()}
                3 -> {choosedMenu = SIdeMenu()
                    selectedMenu = choosedMenu.printMenu()}
                4 -> {choosedMenu = CafeMenu()
                    selectedMenu = choosedMenu.printMenu()}
                5 -> {
                    Cart.printMenuInCart()
                    println("Home: Press any key")
                    readlnOrNull()
                    break
                }
                else -> {println("구현 예정")
                    break}
            }
            if (selectedMenu.number == 0) break
            else Cart.myCart.add(selectedMenu)
        }
    }
}