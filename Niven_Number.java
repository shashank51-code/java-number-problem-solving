/*
A number is called a Niven (Harshad) Number if it is divisible by the sum of its digits.
Example:
18

Digit sum:
1 + 8 = 9

Since:
18 % 9 = 0

18 is a Niven Number.
*/
import java.util.Scanner;
class Niven_Number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(t>0)
        {
            int r=t%10;
            sum+=r;
            t/=10;
        }
        if(n%sum==0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }

    }
}