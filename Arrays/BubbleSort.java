import java.util.Scanner;
class BubbleSort
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
            for(int j=0;j<=n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
            
        }
        for(int c:a)
            {
                System.out.print(c+" ");
            }

    }
}