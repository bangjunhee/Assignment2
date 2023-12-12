
class BurgerMenu: MenuInterface {
    private var choice = 0
    val burgerList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("Big Mac®", 1, 5.5, false),
        MenuInfo("Big Mac® - Meal", 1, 6.9, true),
        MenuInfo("McSpicy Shanghai Burger", 2, 5.5, false),
        MenuInfo("McSpicy Shanghai Burger - Meal", 2, 6.9, true),
        MenuInfo("1955 Burger", 3, 6.4, false),
        MenuInfo("1955 Burger - Meal", 3, 7.8, true),
        MenuInfo("Bacon Tomato Deluxe", 4, 5.8, false),
        MenuInfo("Bacon Tomato Deluxe - Meal", 4, 7.7, true),
        MenuInfo("Bulgogi Burger", 5, 3.1, false),
        MenuInfo("Bulgogi Burger - Meal", 5, 4.9, true),
        MenuInfo("Cheeseburger", 6, 2.7, false),
        MenuInfo("Cheeseburger - Meal", 6, 4.7, true))
    override fun printMenu(): Int {
        while(true) {
            println("\n\n\n\n\n")
            println("             [ Burger Menu ]             ")
            println("                        burger   Meal")
            for (menu in burgerList){
                if(menu.option == false) menu.displayInfo()
                else println("  /  ${menu.price}￦")
            }
            println("9. Home    0. Exit")
            println("======================================")
            try {
                choice = readln().toInt()
                if(choice in 7..8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else break
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                continue
            }
        }
        return choice
    }
}