
class HappySnackMenu: MenuInterface {
    private var choice = 0
    val snackList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("home", 0, 0.0, false),
        MenuInfo("Sausage Snack Wrap", 1, 3.1, false),
        MenuInfo("Taro Pie", 2, 1.8, false),
        MenuInfo("McSpicy® Chicken Tenders 2pcs", 3, 2.2, false),
        MenuInfo("Golden Mozzarella Cheese Sticks 2pcs", 4, 2.0, false)
    )
    override fun printMenu(): MenuInfo {
        while(true) {
            println("\n\n")
            println("                [ Snack Menu ]                ")
            for (menu in snackList){
                menu.displayInfo()
                println("")
            }
            println("9. Home    0. Exit")
            println("==============================================")
            try {
                choice = readln().toInt()
                if(choice in 5..8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else break
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                continue
            }
        }
        return snackList[0]
    }
}