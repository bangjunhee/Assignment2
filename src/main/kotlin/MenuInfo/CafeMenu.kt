
class CafeMenu: MenuInterface {
    private var choice = 0
    override fun printMenu(): Int {
        while(true) {
            println("\n\n\n\n\n")
            println("          [ Cafe Menu ]         ")
            println("                     Hot    Iced")
            println("1. Americano      |  2.6  /  2.6")
            println("2. Drip Coffee    |  2.0  /  1.8")
            println("3. Café Latte     |  3.3  /  3.3")
            println("4. Vanilla Latte  |  3.8  /  3.8\n")
            println("       [ Beverage Menu ]        ")
            println("5. Plum Peach Chiller     |  3.0")
            println("6. Jeju Hallabong Chiller |  3.0")
            println("7. Soft Drink             |  1.7\n")
            println("9. Home    0. Exit")
            println("================================")
            try {
                choice = readln().toInt()
                if(choice == 8 || choice < 0 || choice > 9){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else break
            } catch (e: NumberFormatException) {
                println("숫자로 입력 하세요.")
                continue
            }
        }
        return choice
    }
}
