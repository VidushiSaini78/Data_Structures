static void removeCycle()
{
  if (head == null || head.next == null)
        return null;

  ListNode slow = head;
  ListNode fast = head;

  while (fast.next != null && fast.next.next != null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow == fast) {
        slow = head;
        Node prev = fast;
        while (slow != fast) 
        {
          slow = slow.next;
          prev = fast;
          fast = fast.next;
        }
        prev.next = null;
    }
}
