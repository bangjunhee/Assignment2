import MenuHandler.MainScreen
import MenuHandler.MenuControl

fun main() {
    val mainScreen = MainScreen()
    val menuPrint = MenuControl()
    while(true) {
        mainScreen.screenPrint()
        menuPrint.menuSelect(mainScreen.userChoice)
    }
}