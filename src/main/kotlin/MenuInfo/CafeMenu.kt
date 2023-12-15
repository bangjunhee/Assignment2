import MenuInfo.MenuInfo
import MenuHandler.MenuInterface
import MenuInfo.MenuList
import UserTools.Cart
import UserTools.Payment
import kotlin.system.exitProcess

class CafeMenu: MenuInterface {
    private var choiceString: String = ""
    private var choice = 0
    private var option = 0
    private lateinit var selectedCafe: MenuInfo
    var payment = Payment()
    var menuList1 = MenuList().cafeList
    var menuList2 = MenuList().beverageList
    override fun printMenu(): MenuInfo {
        while(true) {
            println("\n\n\n\n\n\n\n\n\n\n\n")
            println("          [ Cafe Menu ]         ")
            println("                         Hot    Iced")
            for (menu in menuList1) {
                if (menu.number != 0) {
                    if (!menu.option) menu.displayInfo()
                    else println("  /  ${menu.price}￦")
                }
            }
            println("")
            println("       [ Beverage Menu ]        ")
            for (menu in menuList2){
                menu.displayInfo()
                println("")
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
                    return menuList1[0]
                }
                choice = choiceString.toInt()
                if(choice == 8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    readlnOrNull()
                    continue
                }
                else if(choice == 9) return menuList1[0]
                else if (choice == 0) exitProcess(0)
                else if(choice in 1 .. 4){
                    println("Would you like it Hot or Iced?")
                    println("1. Iced  /  2. Hot")
                    option = readln().toInt()
                    // 선택에 맞는 MenuInfo.MenuInfo 클래스를 배열 인덱스로 리턴
                    selectedCafe = if (option == 1) menuList1[(choice*2)]
                    else if(option == 2) menuList1[choice*2-1]
                    else{
                        println("목록에 없는 선택 입니다.")
                        readlnOrNull()
                        continue
                    }
                }
                else selectedCafe = menuList2[choice-5]
            } catch (e: NumberFormatException) {
                println("숫자로 입력 하세요.")
                readlnOrNull()
                continue
            }
            return selectedCafe
        }
    }
}
