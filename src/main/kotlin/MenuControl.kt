
class MenuControl {
    private lateinit var choosedMenu: MenuInterface
    lateinit var selectedMenu: MenuInfo
    fun menuSelect(x: Int){
        var num = x
        while(true) {
            when (num) {
                1 -> {choosedMenu = BurgerMenu()
                    selectedMenu = choosedMenu.printMenu()}
                2 -> choosedMenu = HappySnackMenu()
                3 -> choosedMenu = SIdeMenu()
                4 -> choosedMenu = CafeMenu()
                else -> {println("구현 예정")
                    break}
            }
            if (selectedMenu.number == 0) break
            else Cart.myCart.add(selectedMenu)
        }
    }
}