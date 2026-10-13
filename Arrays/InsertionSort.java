import java.util.Scanner;
class InsertionSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(a[j-1]>a[j])
                {
                    int t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int f:a)
        {
            System.out.print(f+" ");
        }
    }
}