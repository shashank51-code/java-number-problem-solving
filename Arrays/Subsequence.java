/* 
import java.util.Scanner;
class Subsequence
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
        int v=(int)Math.pow(2,n)-1;
        for(int i=1;i<=v;i++)
        {
            int c=0;
            int t=i;
            while(t>0)
            {
                int r=t%2;
                if(r==1)
                {
                    System.out.print(a[c]+" ");
                }
                c++;
                t/=2;
            }
            System.out.println("");
            
        }
    }
}


sum of subsequence arrys == key value
*/
import java.util.Scanner;
class Subsequence
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int v=(int)Math.pow(2,n)-1;
        for(int i=1;i<=v;i++)
        {
            int t=i;
            int c=0;
            int sum=0;
            while(t>0)
            {
                int r=t%2;
                if(r==1)
                {
                    sum+=a[c];
                }
                c++;
                t/=2;
            }
            if(sum==key)
            {
                int g=i;
                int b=0;
                while(g>0)
                {
                    int r=g%2;
                    if(r==1)
                    {
                        System.out.print(a[b]+" ");
                    }
                    b++;
                    g/=2;
                }
                System.out.println("");
            }

        }
    }
}