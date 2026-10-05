import java.util.Scanner;
class RightCount
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
            int rc=0;
            for(int j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    rc++;
                }
            }
            System.out.println(a[i]+" -> "+rc);
        }
    }
}