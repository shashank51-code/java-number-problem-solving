
import java.util.Scanner;


class Circular
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
    for(int i=1;i<=n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }

        int t=a[n-1];
        for(int j=n-1;j>=1;j--)
        {
            a[j]=a[j-1];
        }
        a[0]=t;
       
        System.out.println();
    }
    }
}