class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; 
        node.next = node.next.next;
    }
}
/*
LEETCODE 237
Here we are given with the node we want to remove from the singly LL.
So we just copy the data of next node to the current node and than set the current link by skipping the next node 
because we already copied the node content in current.
*/
