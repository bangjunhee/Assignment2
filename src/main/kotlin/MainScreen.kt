class MainScreen {
    var userChoice = 0
    fun screenPrint(){
        while(true) {
            println("\n\n\n\n\n")
            println("[ McDonald's Menu ]")
            println("1. Burger")
            println("2. Happy Snack")
            println("3. Sides & Desserts")
            println("4. McCafe & Beverages\n")
            println("0. Exit")
            println("===================")
            try {
                userChoice = readln().toInt()
                if(userChoice < 0 || userChoice > 4){
                    println("목록에 없는 선택 입니다.")
                    continue
                }
                else break
            } catch (e: NumberFormatException) {
                println("잘못된 형식입니다.")
                continue
            }
        }
    }
}