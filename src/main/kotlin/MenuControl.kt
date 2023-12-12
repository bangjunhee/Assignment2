
class MenuControl {
    private lateinit var choosedMenu: MenuInterface
    fun menuSelect(x: Int): Int {
        when (x) {
            1 -> choosedMenu = BurgerMenu()
            2 -> choosedMenu = HappySnackMenu()
            3 -> choosedMenu = SIdeMenu()
            4 -> choosedMenu = CafeMenu()
        }
        return choosedMenu.printMenu()
    }
}