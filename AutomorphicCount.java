import java.util.Scanner;
class AutomorphicCount
{
    static boolean auto(int n)
    {
        int t=n;
        int sq=n*n;
        int c=0;
        while(t>0)
        {
            c++;
            t/=10;
        }
        int d=(int)Math.pow(10,c);
        int last=sq%d;
        if(last==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(auto(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}