package MenuInfo

class MenuList {
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
        MenuInfo("Cheeseburger - Meal", 6, 4.7, true)
    )      //11 -> 6
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
    val cafeList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("home", 0, 0.0, false),
        MenuInfo("Americano", 1, 2.6, false),
        MenuInfo("Americano-iced", 1, 2.8, true),
        MenuInfo("Drip Coffee", 2, 2.0, false),
        MenuInfo("Drip Coffee-iced", 2, 1.8, true),
        MenuInfo("Café Latte", 3, 3.3, false),
        MenuInfo("Café Latte-iced", 3, 3.5, true),
        MenuInfo("Vanilla Latte", 4, 3.8, false),
        MenuInfo("Vanilla Latte-iced", 4, 4.0, true)
    )
    val beverageList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("Plum Peach Chiller", 5, 3.0, false),
        MenuInfo("Jeju Hallabong Chiller", 6, 3.0, false),
        MenuInfo("Soft Drink", 7, 1.7, false),
    )
    val snackList: MutableList<MenuInfo> = mutableListOf(
        MenuInfo("home", 0, 0.0, false),
        MenuInfo("Sausage Snack Wrap", 1, 3.1, false),
        MenuInfo("Taro Pie", 2, 1.8, false),
        MenuInfo("McSpicy® Chicken Tenders 2pcs", 3, 2.2, false),
        MenuInfo("Golden Mozzarella Cheese Sticks 2pcs", 4, 2.0, false)
    )

}