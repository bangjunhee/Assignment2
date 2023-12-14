import kotlin.system.exitProcess

class MainScreen {
    var userChoice = 0
    fun screenPrint(){
        while(true) {
            println("\n\n")
            println("[ McDonald's Menu ]")
            println("1. Burger")
            println("2. Happy Snack")
            println("3. Sides & Desserts")
            println("4. McCafe & Beverages")
            println("==== user menu ====")
            println("5. Check Cart")
            println("6. Membership Menu")
            println("===================")
            println("0. Exit")
            print("Input: ")
            try {
                userChoice = readln().toInt()
                if(userChoice < 0 || userChoice > 6){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else if (userChoice == 0) exitProcess(0)
                else break
            } catch (e: NumberFormatException) {
                println("잘못된 형식입니다.")
                continue
            }
        }
    }
}