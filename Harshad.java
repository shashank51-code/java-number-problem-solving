import java.util.Scanner;
class Harshad
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        while(t>0)
        {
            int r=t%10;
            sum+=r;
            t/=10;
        }
        if(n%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}