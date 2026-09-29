/*
For 12, the proper divisors are:

1, 2, 3, 4, 6

Their sum:

1 + 2 + 3 + 4 + 6 = 16

Since:

16 > 12

12 is an Abundant Number.
*/
import java.util.Scanner;

class Abundant
{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>n)
        {
            System.out.println("Abundant Number");
        }
        else
        {
            System.out.println("Not Abundant Number");
        }
    }
}