/*
Implementing Stack using one queue is a optimized approach.
*/
import java.util.*;
class MyStack {

    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0 ; i<q.size()-1 ; i++)
        {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        if(!q.isEmpty())
        return q.remove();
        return -1;
    }
    
    public int top() {
        if(!q.isEmpty())
        return q.peek();
        return -1;
    }
    
    public boolean empty() {
        return q.isEmpty();
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
