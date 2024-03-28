import java.util.*;
/*
Faculty at CodingBlocks loves to purchase smartphones and decides to play a game.
Aayush and Harshit decides to shop for smartphones. Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, then Aayush purchases 3 smartphones, then Harshit purchases 4 smartphones, and so on.
Once someone can't purchase more smartphones, he loses.
Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones. Who will win ? Print "Aayush" and "Harshit" accordingly.
Sample Input
2
9 3
8 11
Sample Output
Aayush
Harshit
 */
public class shopping_game
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int AyushCan = sc.nextInt();
        int HarshitCan = sc.nextInt();
        whoWins(AyushCan, HarshitCan);
    }

    static void whoWins(int person1, int person2)
    {
        int i = 1;
        while(person1!=0 || person2!=2)
        {
            person1 -= i;
            person2 -= i+1;
            i+=2;
            if(person1<=0)
            {
                System.out.println("Harshit Wins ");
                break;
            }
            else if(person2<=0)
            {
                System.out.println("Ayush wins");
                break;
            }
        }


    }
}


