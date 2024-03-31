package practice.dataclass

data class UserDataClass(val name:String,val age:Int)


fun main() {
    val user1 = UserDataClass("akash", 28)
    val user2 = UserDataClass("akash", 28)
    val user3 = UserDataClass("akash", 28)

//  equals(), hashCode(), toString(), copy()

    println(user1 == user2)
//    print(user1.equals(user2))
    println(user1.hashCode() == user2.hashCode())
    println(user1.toString())
    println("use1 hashcode: ${user1.hashCode()}, user2 hashcode: ${user2.hashCode()}")

    val user4 = user1.copy()
    println(user4.toString())

    val user5 = user1.copy(age=30)
    println(user5.toString())



}



