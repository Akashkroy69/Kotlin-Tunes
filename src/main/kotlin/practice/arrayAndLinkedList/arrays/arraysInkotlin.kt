package practice.arrayAndLinkedList.arrays



fun main() {
    // Declaration
    //    val arrayName: Array<Type> = arrayOf(element1, element2, ...)

    //creating a simple array
//    val array1 = arrayOf<Int>(1,2,3,4)
//    val array2: Array<Int> = arrayOf(1,2,3,4)
//    val nullableArray = arrayOfNulls<Int>(10) //You can create an array of a given size filled with null values.
//
//    val arrayList = arrayListOf<Int>(1,2,3,4,5)
//    println(array1)
//    println(arrayList)
////    arrayList[5] = 10 will not work as this is fixed size list
////    print(arrayList)
//    arrayList[0] = 11
//    print(arrayList)
//
////    what is the difference between arrayOf and arrayListOf
//
//
//// Immutable Array
//    val immutableArray = listOf(1, 2, 3)

//------------------------- fixed and dynamic sized array------------------------------------------------------------
// Fixed-Size Array
    val intArray = IntArray(5) // Fixed-size array of integers with size 5
    intArray[0] = 10 // Modifying element at index 0
//  Dynamic Array
    val numbers = ArrayList<Int>()
//    operations on dynamic array
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)

    numbers[1] = 12
    println(numbers)
//    dynamicArray.removeAt(index)
//    dynamicArray.remove(element)
//    dynamicArray.clear()

//    val size = dynamicArray.size



}