package UserTools

import kotlin.math.round

class Payment {
    fun payment() {
        var choice = 0
        var money = 0.0
        println("\n\n")
        Cart.printMenuInCart()
        while (true) {
            println("1. Payment     2. Cancel")
            choice = readln().toInt()
            if (choice == 1) {
                print("Input money: ")
                money = readln().toDouble()
                if (money < Cart.sumPrice) {
                    println("Not enough money!")
                    continue
                } else {

                    println("Recieved Amount: $money   Total Price: ${Cart.sumPrice}")
                    println("Changes: ${round((money - Cart.sumPrice) * 10) / 10}")
                    println("Thank you!")
                    readlnOrNull()
                    Cart.myCart = mutableListOf()
                    break
                }
            } else if (choice == 2) {
                Cart.myCart = mutableListOf()
                break
            }
            else {
                println("잘못 입력했습니다.")
                continue
            }
        }
    }
}