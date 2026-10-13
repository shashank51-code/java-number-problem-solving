
import java.util.Scanner;

class SelectionSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int h=0;
            for(int j=0;j<=n-i;j++)
            {
                if(a[j]>a[h])
                {
                   h=j;
                }
            }
            int t=a[h];
            a[h]=a[n-i];
            a[n-i]=t;
        }
        for(int b:a)
        {
            System.out.print(b+" ");
        }

    }
}