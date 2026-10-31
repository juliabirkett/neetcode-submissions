
// Definition for singly-linked list.
//  class ListNode(var value: Int) {
//      var next: ListNode? = null
//  }

class Solution {
    var visitedNodes = mutableListOf<Int>()

    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        else {
            var currentNode: ListNode? = head.next

            while (currentNode != null && visitedNodes.indexOf(currentNode.`val`) == -1) {
                visitedNodes.add(currentNode.`val`)
                println(currentNode.`val`)
                currentNode = currentNode.next
            }
           
           
           //println(visitedNodes)
           return if (currentNode == null) false
           else true
        }
    }
}
