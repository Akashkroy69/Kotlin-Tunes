package practice.arrayAndLinkedList.linkedlist

data class Node1(val data:Int, var next:Node1?=null)

class LL{
    var head: Node1? = null

    fun isEmpty():Boolean{
        return head == null
    }

    fun insertAtStart(data: Int){
        val newNode = Node1(data)
        newNode.next = head
        head = newNode

    }

    fun deleteFirst(): Int? {
        if(isEmpty()){
            return null
        }
        val temp = head
        head = temp?.next
        return temp?.data
    }

    fun displayData(){
        var currentNode = head
        while (currentNode != null){
            print("${currentNode.data} ")
            currentNode = currentNode?.next
        }
        println("||End||")
    }
}

fun main() {
    val ll = LL()

    ll.insertAtStart(26)
    ll.insertAtStart(27)
    ll.insertAtStart(46)
    ll.insertAtStart(633)
    ll.displayData()

    ll.deleteFirst()

    ll.displayData()
}