import java.util.Scanner;
class Sunny
{
    static boolean perfect(int n)
    {
        
        for(int i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=n+1;
        if(perfect(v))
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("not Sunny Number");
        }
    }
}