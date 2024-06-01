public class Solution
{
    public static void main(String[] args) {
        int ar[] = {23,13,41,67,81};
        System.out.println(secondlargest(ar , ar.length));
    }
    static int secondlargest(int a[] , int n)
    {
        int firstmax = a[0];
        int secondmax = -1;
        for(int i=1 ; i<n ; i++)
        {
            if(firstmax<a[i])
            {
                secondmax = firstmax;
                firstmax = a[i];
            }
            else if(a[i] >secondmax && a[i] <firstmax)
            {
                secondmax = a[i];
            }
        }
        return secondmax;
    }
}
