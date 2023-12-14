import kotlin.system.exitProcess

class CafeMenu: MenuInterface {
    private var choice = 0
    private var option = 0
    private lateinit var selectedCafe: MenuInfo
    private val cafeList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("home", 0, 0.0, false),
        MenuInfo("Americano", 1, 2.6, false),
        MenuInfo("Americano-iced", 1, 2.8, true),
        MenuInfo("Drip Coffee", 2, 2.0, false),
        MenuInfo("Drip Coffee-iced", 2, 1.8, true),
        MenuInfo("Café Latte", 3, 3.3, false),
        MenuInfo("Café Latte-iced", 3, 3.5, true),
        MenuInfo("Vanilla Latte", 4, 3.8, false),
        MenuInfo("Vanilla Latte-iced", 4, 4.0, true)
    )
    private val beverageList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("Plum Peach Chiller", 5, 3.0, false),
        MenuInfo("Jeju Hallabong Chiller", 6, 3.0, false),
        MenuInfo("Soft Drink", 7, 1.7, false),
    )
    override fun printMenu(): MenuInfo {
        while(true) {
            println("\n\n")
            println("          [ Cafe Menu ]         ")
            println("                         Hot    Iced")
            for (menu in cafeList) {
                if (menu.number != 0) {
                    if (!menu.option) menu.displayInfo()
                    else println("  /  ${menu.price}￦")
                }
            }
            println("")
            println("       [ Beverage Menu ]        ")
            for (menu in beverageList){
                menu.displayInfo()
                println("")
            }

            Cart.printMenuInCart()

            print("9. Home    0. Exit")
            if (Cart.myCart.size == 0) println("")
            else println("     q: Order")
            print("Input: ")
            try {
                choice = readln().toInt()
                if(choice == 8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else if(choice == 9) return cafeList[0]
                else if (choice == 0) exitProcess(0)
                else if(choice in 1 .. 4){
                    println("Would you like it Hot or Iced?")
                    println("1. Iced  /  2. Hot")
                    option = readln().toInt()
                    // 선택에 맞는 MenuInfo 클래스를 배열 인덱스로 리턴
                    selectedCafe = if (option == 1) cafeList[(choice*2)]
                    else if(option == 2) cafeList[choice*2-1]
                    else{
                        println("목록에 없는 선택 입니다.")
                        continue
                    }
                }
                else selectedCafe = beverageList[choice-5]
            } catch (e: NumberFormatException) {
                println("숫자로 입력 하세요.")
                continue
            }
            return selectedCafe
        }
    }
}
