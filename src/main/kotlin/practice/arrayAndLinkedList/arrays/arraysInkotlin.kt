package practice.arrayAndLinkedList.arrays



fun main() {
    // Declaration
    //    val arrayName: Array<Type> = arrayOf(element1, element2, ...)

    //creating a simple array
    val array1 = arrayOf<Int>(1,2,3,4)
    val array2: Array<Int> = arrayOf(1,2,3,4)
    val nullableArray = arrayOfNulls<Int>(10) //You can create an array of a given size filled with null values.

    val arrayList = arrayListOf<Int>(1,2,3,4,5)
    println(array1)
    println(arrayList)

//    what is the difference between arrayOf and arrayListOf


}