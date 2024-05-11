import java.util.Stack;

public class Program1
{
    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))";
        System.out.println(findredundant(str));
    }
    static String findredundant(String str)
    {
        Stack<Character> mystack = new Stack<>();
        char my_string[] = str.toCharArray();
        int i = 0;
        while(i< my_string.length)
        {
            char value = my_string[i];
            if(value == ')')
            {
                int count =0;
                while(mystack.peek() != '(')
                {
                    count++;
                    mystack.pop();
                }
                if(count<1)
                    return "Duplicate Paranthesis found for string "+ str;
                mystack.pop();
            }
            else
            mystack.add(value);
            i++;

        }
        return "Not Found for string "+ str;
    }

}
