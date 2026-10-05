/*
A number is called a Pronic Number if it can be written as the product of two consecutive integers.
Examples:
6 = 2 × 3

So 6 is Pronic.
12 = 3 × 4

So 12 is Pronic.
But:
10
*/
import java.util.Scanner;
class Pronic
{
    static boolean pronic(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            int n=sc.nextInt();
            if(pronic(n))
            {
                System.out.println("Pronic Number");
            }
            else
            {
                System.out.println("Not Pronic Number");
            }

        }
    }
}