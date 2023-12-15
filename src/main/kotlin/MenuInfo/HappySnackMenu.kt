import MenuInfo.MenuInfo
import MenuHandler.MenuInterface
import MenuInfo.MenuList
import UserTools.Cart
import UserTools.Payment
import kotlin.system.exitProcess

class HappySnackMenu: MenuInterface {
    private var choiceString: String = ""
    private var choice = 0
    private lateinit var selectedSnack: MenuInfo
    var payment = Payment()
    var menuList = MenuList().snackList
    override fun printMenu(): MenuInfo {
        while(true) {
            println("\n\n\n\n\n\n\n\n\n\n\n\n\n")
            println("                [ Snack Menu ]                ")
            for (menu in menuList) {
                if (menu.number != 0) {
                    menu.displayInfo()
                    println("")
                }
            }
            Cart.printMenuInCart()
            print("9. Home    0. Exit")
            if (Cart.myCart.size == 0) println("")
            else println("     q: Order")
            print("Input: ")
            try {
                choiceString = readln()
                if(choiceString == "q") {
                    payment.payment()
                    return menuList[0]
                }
                choice = choiceString.toInt()
                if(choice in 5..8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    readlnOrNull()
                    continue
                }
                else if(choice == 9) return menuList[0]
                else if (choice == 0) exitProcess(0)
                else selectedSnack = menuList[choice]
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                readlnOrNull()
                continue
            }
            return selectedSnack
        }
    }
}