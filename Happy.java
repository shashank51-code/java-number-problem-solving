/*

19
↓
1² + 9² = 82
↓
8² + 2² = 68
↓
6² + 8² = 100
↓
1² + 0² + 0² = 1

*/

import java.util.Scanner;
class Happy
{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
       while(n != 1 && n != 4)
        { 
            int sum=0;
            while(n>0)
            {
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            n=sum;
        }
        if(n==1)
        {
            System.out.print("Happy");
        }
        else
        {
            System.out.println("not happy");
        }
    }
}