/*
number is called a Buzz Number if:

it is divisible by 7, 
        OR
its last digit is 7.
*/

import java.util.Scanner;

class Buzz
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
            int digit=n%10;
            if(digit==7 || n%7==0)
            {
                System.out.println("Buzz Number");
            }
            else
            {
                System.out.println("Not Buzz number");
            }
    }
}
