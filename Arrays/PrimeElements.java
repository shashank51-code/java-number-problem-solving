import java.util.Scanner;
class PrimeElements
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
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(prime(a[i]))
            {
                sum+=a[i];
                c++;
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.println((float)sum/c);

    }
}