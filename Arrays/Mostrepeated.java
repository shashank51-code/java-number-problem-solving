import java.util.Scanner;
class Mostrepeated
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
        int mr=0;
        int ab=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int oc=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    oc++;
                }
            }
            if(oc>mr)
            {
                mr=oc;
                ab=a[i];
            }
        }
        System.out.println("most repeated"+ab+" ");
    }
}