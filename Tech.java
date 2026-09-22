import java.util.Scanner;
class TechNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
       
        int c=0;
        while(t>0)
        {
            c++;
            t/=10;
        }
        if(c%2!=0)
        {
            System.out.println("we can't Find");
            return;
        }
        int half=c/2;
        int div=(int)Math.pow(10,half);
        int n1=n%div;
        int n2=n/div;
        
        
        int sum=n1+n2;
        int sq=sum*sum;
        if(sq==n)
        {
            System.out.println(n+" tech number");
        }
        else
        {
            System.out.println(n+" not an tech Number");
        }

    }
}