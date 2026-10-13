import java.util.Scanner;
class SecondHighest
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
        int h1=Integer.MIN_VALUE;
        int h2=Integer.MIN_VALUE;
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(a[i]>h1)
            {
                h2=h1;
                h1=a[i];
            }
            else if(a[i]>h2 &&a[i]<h1)
            {
                found=true;
                h2=a[i];
            }
            
        }
        if(found)
        {

            System.out.print(h2);
        }
        else{
            System.out.print(-1);
        }
        
    }
}