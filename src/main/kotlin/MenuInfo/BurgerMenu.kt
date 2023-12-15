import MenuInfo.MenuInfo
import MenuHandler.MenuInterface
import MenuInfo.MenuList
import UserTools.Cart
import UserTools.Payment
import kotlin.system.exitProcess

class BurgerMenu: MenuInterface {
    private var choiceString: String = ""
    private var choice = 0
    private var option = 0
    private lateinit var selectedBurger: MenuInfo
    var payment = Payment()
    var menuList = MenuList().burgerList

    override fun printMenu(): MenuInfo {
        while(true) {
            // 메뉴판 출력
            println("\n\n\n\n\n\n\n\n\n\n\n")
            println("             [ Burger Menu ]             ")
            println("                        burger   Meal")
            // MenuInfo의 displayInfo 메소드를 사용해 메뉴 출력
            for (menu in menuList){
                if(menu.number != 0) {
                    if (!menu.option) menu.displayInfo()
                    else println("  /  ${menu.price}￦")
                }
            }

            Cart.printMenuInCart()

            print("9. Home    0. Exit")
            if (Cart.myCart.size == 0) println("")
            else println("     q: Order")
            print("Input: ")
            // 사용자 입력 부분
            try {
                choiceString = readln()
                if(choiceString == "q") {
                    payment.payment()
                    return menuList[0]
                }
                choice = choiceString.toInt()
                if(choice in 7..8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    readlnOrNull()
                    continue
                }
                // 9번 선택시 0번 인덱스 불러옴
                else if(choice == 9) return menuList[0]
                // 0번일 시 종료
                else if (choice == 0) exitProcess(0)
                else {
                    println("Would you like the meal or just the burger?")
                    println("1. Meal  /  2. Burger")
                    option = readln().toInt()
                    // 선택에 맞는 MenuInfo.MenuInfo 클래스를 배열 인덱스로 리턴
                    selectedBurger = if (option == 1) menuList[(choice*2)]
                    else if(option == 2) menuList[choice*2-1]
                    else{
                        println("목록에 없는 선택 입니다.")
                        readlnOrNull()
                        continue
                    }
                }
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                readlnOrNull()
                continue
            }
            return selectedBurger
        }
    }
}