package practice.arrayAndLinkedList.linkedlist

data class Node<T>(val data: T, var next: Node<T>? = null)

class LinkedList<T> {
    private var head: Node<T>? = null

    fun isEmpty(): Boolean {
        return head == null
    }

    fun insertFirst(data: T) {
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }

    fun deleteFirst(): T? {
        if (isEmpty()) {
            return null
        }
        val temp = head
        head = head?.next
        return temp?.data
    }

    fun displayList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }
}

fun main() {
    val linkedList = LinkedList<Int>()

    linkedList.insertFirst(3)
    linkedList.insertFirst(2)
    linkedList.insertFirst(1)

    linkedList.displayList() // Output: 1 -> 2 -> 3 -> null

    linkedList.deleteFirst()

    linkedList.displayList() // Output: 2 -> 3 -> null
}
