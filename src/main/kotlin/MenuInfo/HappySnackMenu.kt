
class HappySnackMenu: MenuInterface {
    private var choice = 0
    val snackList: MutableList<MenuInfo> = mutableListOf()
    override fun printMenu(): Int {
        while(true) {
            println("\n\n\n\n\n")
            println("                [ Snack Menu ]                ")
            println("1. Sausage Snack Wrap                   |  3.1")
            println("2. Taro Pie                             |  1.8")
            println("3. McSpicy® Chicken Tenders 2pcs        |  2.2")
            println("4. Golden Mozzarella Cheese Sticks 2pcs |  2.0\n")
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
        return choice
    }
}