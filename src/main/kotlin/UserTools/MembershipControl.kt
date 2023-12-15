package UserTools

import kotlin.system.exitProcess


object MembershipControl {
    val membershipList: MutableList<MembershipInfo> = mutableListOf(
        MembershipInfo("Bang", 1234, 0.3)
    )
    fun membershipCheck(){
        var phoneNum = 0
        var choice = 0
        var checkNum = 0
        while(true) {
            println("\n\n\n\n\n\n\n\n\n\n")
            println("======[Membership Menu]======")
            println("1. Check my point")
            println("2. Sign up Membership")
            println("=============================")
            println("9. Home      0. Exit")
            print("Input: ")
            choice = readln().toInt()
            if (choice == 1) {
                print("Enter your phone-number(last 4 digits): ")
                phoneNum = readln().toInt()
                for (member in membershipList) {
                    if (member.phoneNumber == phoneNum) {
                        println("===========================")
                        println("Search results")
                        println("name: ${member.name}     CP: ${member.phoneNumber}")
                        println("Point: ${member.point}")
                        readlnOrNull()
                        checkNum ++
                    }
                }
                if(checkNum == 0){
                    println("This number is not registered.")
                    readlnOrNull()
                    break
                }

            }
            else if(choice == 2){
                print("Enter your name: ")
                var name = readln().toString()
                print("Enter your phone number: ")
                var CP = readln().toInt()
                membershipList.add(MembershipInfo(name, CP, 0.0))
                println("Sign up complete.")
                readlnOrNull()
                break
            }
            else if(choice == 9) break
            else if(choice == 0) exitProcess(0)
            else {
                println("잘못 입력하셨습니다.")
                readlnOrNull()
                continue
            }
        }
    }

    // 아직 미구현
//    fun membershipBenefits(){
//        print("Enter your phone-number(last 4 digits): ")
//        var phoneNum = readln().toInt()
//        for (member in membershipList) {
//            if (member.phoneNumber == phoneNum) {
//                println("Membership Benefit Menu")
//                println("1. Use Point     2. Earn Point")
//                var choice = readln().toInt()
//                if (choice == 1){
//                    println("Point: ${member.point}")
//                    print("1. use    2. cancel")
//                    if(choice == 1)
//                }
//            }
//
//        }
//    }
}