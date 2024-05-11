/*
Implementing Stack using one queue is a optimized approach.
*/
import java.util.*;
class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    void push(int data) {
        int size = q1.size();
        q1.add(data);
        for (int i = 0; i < size; i++) {
            q1.add(q1.remove());
        }
    }
    int pop() {
        if (!q1.isEmpty())
            return q1.poll();
        return -1;
    }
    int top() {
        if (!q1.isEmpty())
            return q1.peek();
        return -1;
    }
    void display() {
        System.out.println("Created Stack ->");
        for (int element : q1) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(23);
        mystack.push(34);
        mystack.push(45);
        mystack.display();
        System.out.println( "Top element of the stack  " + mystack.top());
        System.out.println("Deleted element of the stack " + mystack.pop());
        mystack.display();

    }
}
