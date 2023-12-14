
class SIdeMenu: MenuInterface {
    private var choice = 0
    val sideList: MutableList<MenuInfo> = mutableListOf(
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
                if (!menu.option) {
                    menu.displayInfo()
                    println("")
                }
            }
            println("       [ Desserts Menu ]         ")
            for (menu in sideList) {
                if (menu.option) {
                    menu.displayInfo()
                    println("")
                }
            }
            println("9. Home     0. Exit")
            println("====================================")
            try {
                choice = readln().toInt()
                if(choice == 8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else break
            } catch (e: NumberFormatException) {
                println("숫자로 입력하세요.")
                continue
            }
        }
        return sideList[0]
    }
}