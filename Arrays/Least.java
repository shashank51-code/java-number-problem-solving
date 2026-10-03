import java.util.Scanner;
class Least
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l1=Integer.MAX_VALUE;
        int l2=Integer.MAX_VALUE;
        int l3=Integer.MAX_VALUE;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<l1)
            {
                l3=l2;
                l2=l1;
                l1=a[i];
            }
            else if(a[i]<l2 &&a[i]>l2)
            {
                l3=l2;
                l2=a[i];
            }
            else if(a[i]<l3)
            {
                l3=a[i];
            }
        }
        System.out.println(l1+" "+l2+"  "+l3);
    }
}