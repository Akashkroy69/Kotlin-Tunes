import practice.dataclass.UserDataClass

fun main(args: Array<String>) {
    println("Hello World!")
    var user1 = UserDataClass("akash", 28)
    var user2 = UserDataClass("akash", 28)

    println(user1==user2)
    println(user1.equals(user2)) //Checks if two objects are equal based on their property values.
    println(user1.hashCode()==user2.hashCode())
    println(user1.toString())

    val (name,age) = user1
    println("name: $name, age : $age")

}