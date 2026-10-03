import java.util.Scanner;
class LinearSort
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>a[i])
                    {
                        int t=a[j];
                        a[j]=a[i];
                        a[i]=t;
                    }
                
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");

        }

    }
}