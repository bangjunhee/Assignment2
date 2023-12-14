import kotlin.system.exitProcess

class BurgerMenu: MenuInterface {
    var choice = 0
    private var option = 0
    lateinit var selectedBurger: MenuInfo
    val burgerList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("home", 0, 0.0, false),
        MenuInfo("Big Mac®", 1, 5.5, false),                //0
        MenuInfo("Big Mac® - Meal", 1, 6.9, true),          //1 -> 1
        MenuInfo("McSpicy Shanghai Burger", 2, 5.5, false), //2
        MenuInfo("McSpicy Shanghai Burger - Meal", 2, 6.9, true), //3 -> 2
        MenuInfo("1955 Burger", 3, 6.4, false),             //4
        MenuInfo("1955 Burger - Meal", 3, 7.8, true),       //5 -> 3
        MenuInfo("Bacon Tomato Deluxe", 4, 5.8, false),     //6
        MenuInfo("Bacon Tomato Deluxe - Meal", 4, 7.7, true), // 7 -> 4
        MenuInfo("Bulgogi Burger", 5, 3.1, false),          // 8
        MenuInfo("Bulgogi Burger - Meal", 5, 4.9, true),    //9 -> 5
        MenuInfo("Cheeseburger", 6, 2.7, false),            //10
        MenuInfo("Cheeseburger - Meal", 6, 4.7, true))      //11 -> 6
    override fun printMenu(): MenuInfo {
        while(true) {
            // 메뉴판 출력
            println("\n\n")
            println("             [ Burger Menu ]             ")
            println("                        burger   Meal")
            // MenuInfo의 displayInfo 메소드를 사용해 메뉴 출력
            for (menu in burgerList){
                if(menu.number != 0) {
                    if (!menu.option) menu.displayInfo()
                    else println("  /  ${menu.price}￦")
                }
            }
            println("9. Home    0. Exit")
            println("======================================")
            Cart.printMenuInCart()
            println("======================================")
            print("Input: ")
            // 사용자 입력 부분
            try {
                choice = readln().toInt()
                if(choice in 7..8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                // 9번 선택시 0번 인덱스 불러옴
                else if(choice == 9) return burgerList[0]
                // 0번일 시 종료
                else if (choice == 0) exitProcess(0)
                else {
                    println("Would you like the meal or just the burger?")
                    println("1. Meal  /  2. Burger")
                    option = readln().toInt()
                    // 선택에 맞는 MenuInfo 클래스를 배열 인덱스로 리턴
                    selectedBurger = if (option == 1) burgerList[(choice*2)]
                    else if(option == 2) burgerList[choice*2-1]
                    else{
                        println("목록에 없는 선택 입니다.")
                        continue
                    }
                }
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                continue
            }
            return selectedBurger
        }

    }
}