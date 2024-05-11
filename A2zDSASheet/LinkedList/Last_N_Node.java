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
    public void printList_N_NodeI(int len)
    {
        Node pointer_1 = head;
        Node pointer_2 = head;
        int a = len;
        while(len !=0)
        {
            len--;
            pointer_2 =pointer_2.next;
        }
        if(pointer_2!=null)
        {
            while(pointer_2 !=null)
            {
                pointer_2 = pointer_2.next;
                pointer_1 = pointer_1.next;
            }
        }
        System.out.println("Dekh le yeh bhi tarika hai " + pointer_1.data);


    }
    public void printList_N_Node( int len)
    {
        int length = 0;
        Node temp = head;
        while(temp!= null)
        {
            length++;
            temp= temp.next;
        }
        if(length < len)
            return;
        Node temp1 = head;
        for(int i=0 ; i < length-len ; i++)
        {
            temp1 = temp1.next;
        }
        System.out.println( "yeh le mil gya na abh answer  " + temp1.data);

    }
}

public class Program1{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(3);
        linkedList.push(7);
        linkedList.push(12);
        linkedList.push(13);
        linkedList.push(14);
        linkedList.push(15);
        linkedList.printList();
        linkedList.printList_N_Node(5);
        linkedList.printList_N_NodeI(5);
    }
}
