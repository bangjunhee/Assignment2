import kotlin.system.exitProcess

class SIdeMenu: MenuInterface {
    private var choice = 0
    private lateinit var selectedSide: MenuInfo
    private val sideList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("home", 0, 0.0, false),
        MenuInfo("Tomato Chicken Snack Wrap", 1, 3.0, false),
        MenuInfo("Coleslaw", 2, 1.9, false),
        MenuInfo("French Fries", 3, 2.2, false),
        MenuInfo("McNuggets®", 4, 2.6, false),
        MenuInfo("Ice Cream Cone", 5, 1.7, true),
        MenuInfo("Oreo McFlurry", 6, 3.3, true),
        MenuInfo("Oreo Affogato", 7, 3.8, true)
    )
    override fun printMenu(): MenuInfo {
        while(true) {
            println("\n\n")
            println("        [ Sides Menu ]           ")
            for (menu in sideList) {
                if(menu.number != 0) {
                    if (!menu.option) {
                        menu.displayInfo()
                        println("")
                    }
                }
            }
            println("       [ Desserts Menu ]         ")
            for (menu in sideList) {
                if(menu.number != 0) {
                    if (menu.option) {
                        menu.displayInfo()
                        println("")
                    }
                }
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
                else if(choice == 9) return sideList[0]
                else if (choice == 0) exitProcess(0)
                else selectedSide = sideList[choice]
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                continue
            }
            return selectedSide
        }
    }
}