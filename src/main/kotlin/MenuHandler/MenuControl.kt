package MenuHandler

import BurgerMenu
import CafeMenu
import UserTools.Cart
import HappySnackMenu
import MenuInfo.MenuInfo
import SIdeMenu
import UserTools.MembershipControl

class MenuControl {
    private lateinit var choosedMenu: MenuInterface
    lateinit var selectedMenu: MenuInfo

    fun menuSelect(x: Int){
        while(true) {
            when (x) {
                1 -> {
                    choosedMenu = BurgerMenu()
                    selectedMenu = choosedMenu.printMenu()
                }

                2 -> {
                    choosedMenu = HappySnackMenu()
                    selectedMenu = choosedMenu.printMenu()
                }

                3 -> {
                    choosedMenu = SIdeMenu()
                    selectedMenu = choosedMenu.printMenu()
                }

                4 -> {
                    choosedMenu = CafeMenu()
                    selectedMenu = choosedMenu.printMenu()
                }

                5 -> {
                    Cart.printMenuInCart()
                    println("Home: Press any key")
                    readlnOrNull()
                    break
                }
                6 -> {
                    MembershipControl.membershipCheck()
                    break
                }

                else -> {
                    println("구현 예정")
                    break
                }
            }
            if (selectedMenu.number == 0) break
            else Cart.myCart.add(selectedMenu)
        }
    }
}