
import java.util.Scanner;
class RotateArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k = k % n;
        for(int i=1;i<=k;i++)
        {
            int t=a[0];
            for(int j=0;j<n-1;j++)
            {
                a[j]=a[j+1];
            }
            a[n-1]=t;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}

