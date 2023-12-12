fun main() {
    val mainScreen = MainScreen()
    val menuPrint = MenuControl()
    var choosednum = 1
    while(true) {
        mainScreen.screenPrint()
        choosednum = menuPrint.menuSelect(mainScreen.userChoice)
        if(choosednum == 9) continue
        else break
    }
}