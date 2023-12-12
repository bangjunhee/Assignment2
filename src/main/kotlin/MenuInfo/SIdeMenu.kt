
class SIdeMenu: MenuInterface {
    private var choice = 0
    override fun printMenu(): Int {
        while(true) {
            println("\n\n\n\n\n")
            println("           [ Sides Menu ]           ")
            println("1. Tomato Chicken Snack Wrap  |  3.0")
            println("2. Coleslaw                   |  1.9")
            println("3. French Fries               |  2.2")
            println("4. McNuggets®                 |  2.6")
            println("          [ Desserts Menu ]         ")
            println("5. Ice Cream Cone             |  1.1")
            println("6. Oreo McFlurry              |  3.3")
            println("7. Oreo Affogato              |  3.8\n")
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
        return choice
    }
}