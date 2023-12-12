class MenuInfo(val name: String, val number: Int, val price: Double, val option: Boolean) {
    fun displayInfo(){
        println("$number. $name")
        print("                        $price￦")
    }
}