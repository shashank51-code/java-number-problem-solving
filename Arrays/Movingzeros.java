import java.util.Scanner;
class Movingzeros
{
    static void moveZeros(int[] a)
    {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]!=0)
            {
                a[j]=a[i];
                j++;
            }
        }
        while(j<a.length)
        {
            a[j]=0;
            j++;
        }
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
        moveZeros(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}