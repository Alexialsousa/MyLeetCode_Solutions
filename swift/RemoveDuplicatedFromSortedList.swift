// Runtime: 46 ms
// Memory Usage: 14.1 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * public var val: Int
 * public var next: ListNode?
 * public init() { self.val = 0; self.next = nil; }
 * public init(_ val: Int) { self.val = val; self.next = nil; }
 * public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next =
 * next; }
 * }
 */
class Solution {
    func deleteDuplicates(_ head: ListNode?) -> ListNode? {
        
        if head == nil || head!.next == nil{ // if size is 0 or 1
            return head
        }
        
        var currentNode = head!
        
        while currentNode != nil && currentNode.next != nil{
            if currentNode.val != currentNode.next!.val {
                currentNode = currentNode.next!
            }
            else {
                if currentNode.next!.next != nil{
                    currentNode.next = currentNode.next!.next!
                }
                else {
                    currentNode.next = nil
                }
            }
        }
        return head
    }

}