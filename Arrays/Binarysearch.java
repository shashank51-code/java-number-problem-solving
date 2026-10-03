import java.util.Arrays;
import java.util.Scanner;
class Binarysearch
{
    static boolean binary(int a[],int k)
    {
        Arrays.sort(a);
        int s=0;int e=a.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(a[m]==k)
            {
                return true;
            }
            else if(k<a[m])
            {
                e=m-1;
            }
            else 
            {
                s=m+1;
            }
        }
        return false;
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
        System.out.println("enter");
        int k=sc.nextInt();
        if(binary(a,k))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}