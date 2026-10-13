/*
Finding subArrays

import java.util.Scanner;
class SubArrays
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
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println("");
            }
        }
    }
}
*/
/*  sum of SubArray element is equal to key value */
import java.util.Scanner;
class SubArrays
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
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                }
                if(key==sum)
                {
                        for(int k=i;k<=j;k++)
                        {
                            System.out.print(a[k]+" ");
                        }
                        System.out.println();
                }
                
            }
        }
    }
}
