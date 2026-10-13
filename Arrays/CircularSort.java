import java.util.Scanner;
class CircularSort
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

            int t=a[0];
            for(int j=0;j<n-1;j++)
            {
                a[j]=a[j+1];
            }
            a[n-1]=t;

            
            int c=0;
            for(int j=0;j<n-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    c++;
                }
            }
            
            for(int j=0;j<n;j++)
                {
                    System.out.print(a[j]+" ");
                }
                System.out.println("");
            if(c==n-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[j]+" ");
                }
            
            break;
            }
        }

    }
}