import java.util.*;
public class Main
{
    static Scanner input = new Scanner(System.in);
    static Stack<Integer> create()
    {
        Stack<Integer> mystack = new Stack<>();
        System.out.println("How many input  ? " );
        int n = input.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            mystack.add(input.nextInt());
        }
        return mystack;
    }
    static void k_th_largest(Stack<Integer> mystack , int k)
    {
        mystack = sortStack(mystack);
        int ans =0;
        while(k!=0)
        {
            k--;
            ans  = mystack.pop();
        }
        System.out.println(ans);
    }
    static  void display(Stack<Integer> mystack)
    {
        for(int ele : mystack)
        {
            System.out.print( ele + " ");
        }
        System.out.println();
    }
    static Stack<Integer> sortStack(Stack<Integer> mystack)
    {
        Stack<Integer> temp = new Stack<>();
        while(!mystack.isEmpty())
        {
            int value= mystack.pop();
            while(!temp.isEmpty() && temp.peek()>value)
            {
                mystack.add(temp.pop());
            }
            temp.add(value);
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Stack<Integer> mystack = create();
        System.out.println("Enter the k value : ");
        int k = input.nextInt();
        if(k>mystack.size())
            System.out.println("Invalid Input ");
        else k_th_largest(mystack , k);
    }
}
