/*
n= 1124
1 + 1 + 2 + 4 = 8
1 × 1 × 2 × 4 = 8
1124 → Spy Number
*/
import java.util.Scanner;
class Spy
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            pro*=r;
            n/=10;
        }
        if(sum==pro)
        {
            System.out.print("Spy Number ");
        }
        else
        {
            System.out.println("Not Spy");
        }
    }
}