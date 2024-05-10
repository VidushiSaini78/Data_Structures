/*
There are two people that start from two different positions, let’s say x1 and x2. Both can jump v1 and v2 meters ahead respectively. We have to find if both will ever meet given that the number of jumps taken by both has to be same.
Print ‘Yes’ if they will meet, 
print ‘No’ they will not.
Examples :
Input  : x1 = 5, v1 = 8, x2 = 4, v2 = 7
Output : No
Explanation: The first person is starting ahead of the second one.
and his speed is also greater than the second one, so they will never meet.

Input  : x1 = 6, v1 = 6, x2 = 4, v2 = 8
Output : Yes
 */
import java.util.*;
public class Two_People_Will_Meet {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position of Person1 : ");
        int Person1 = input.nextInt();
        System.out.println("Person 1 can jump : ");
        int Person1_jump = input.nextInt();
        System.out.println("Enter the position of Person 2 : ");
        int Person2 = input.nextInt();
        System.out.println("Person 2 can jump : ");
        int Person2_jump = input.nextInt();
        System.out.println(willTheyMeet(Person1 , Person1_jump , Person2 , Person2_jump));
        System.out.println(willtheymeet(Person1, Person1_jump, Person2, Person2_jump));
    }
    static String willtheymeet(int p1 , int p1_jump , int p2 , int p2_jump)
    {
        if(p1<p2 && p1_jump<=p2_jump || p2<p1 && p2_jump<=p1_jump)
        return "No";
        if(p1>p2)
        {
            int temp = p1;
            p1 = p2;
            p2 = temp;
        }
        while(p2>=p1)
        {
            if(p1==p2)
            return "Yes";
            p1 += p1_jump;
            p2 += p2_jump;
        }
        return "No";

    }
    //Optimized Approach
    static String willTheyMeet(int p1 , int p1_jump , int p2 , int p2_jump)
    {
        
        if(p1<p2 && p1_jump<=p2_jump || p2<p1 && p2_jump<=p1_jump)
        return "No";
        int relativeSpeed = Math.abs(p1_jump - p2_jump);
        if((p1>p2 && (p1-p2) % relativeSpeed ==0 ) || (p2>p1 && (p2-p1)% relativeSpeed==0) )
        return "Yes";
        return "No";
    }
}
