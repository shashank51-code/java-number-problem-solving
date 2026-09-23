import java.util.Scanner;
class Kaprekar
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
        int sq=n*n;

        int count=dc(n);
        
        int div=(int)Math.pow(10,count);

        int n1=sq/div;
        int n2=sq%div;
        int sum=n1+n2;
        if(sum==n)
        {
            System.out.println(sum+"Kaprekar");
        }
        else
        {
            System.out.println(sum+"not Kaprekar");
        }
    }
}