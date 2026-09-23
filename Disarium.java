import java.util.Scanner;

class Disarium
{
    static int dc(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int dc=dc(n);
        int sum=0;
        while(t>0)
        {
            int digit=t%10;
            sum+=(int)Math.pow(digit,dc--);
            t/=10;
        }
        if(n==sum)
        {
            System.out.println("Disarium");
        }
        else
        {
            System.out.println("Not Disarium");
        }
        
    }
}