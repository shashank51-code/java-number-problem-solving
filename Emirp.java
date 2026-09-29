/*

A number is called an Emirp Number if:

The number is prime.
Its reverse is also prime.
The reversed number must be different from the original number.

Example:

13

Reverse:

31

Both 13 and 31 are prime, and they are different.

Therefore:

13 → Emirp Number*/

import java.util.Scanner;
class Emirp
{
    static boolean prime(int n)
    {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        while(t>0)
        {
            int r=t%10;
            rev=rev*10+r;
            t/=10;
        }
        if(n != rev)
        {
            if(prime(n) && prime(rev) )
            {
                System.out.println("Emirp Number");
            }
            else
            {
                System.out.println("Not Emirp Number");
            }
        }
        else 
        {
            System.out.println("Not Emirp Number");
        }

    }
}