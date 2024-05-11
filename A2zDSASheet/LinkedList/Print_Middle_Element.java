class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void printMiddle()
    {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next !=null)
        {
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast )
                break;
        }
        System.out.println("Middle Element " + slow.data);

    }

}

public class Print_Middle_Element {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(3);
        linkedList.push(7);
        linkedList.push(12);
        linkedList.push(13);
        linkedList.push(14);
        linkedList.push(15);
        linkedList.printList();
        linkedList.printMiddle();

    }
}
