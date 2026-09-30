import java.util.Scanner;
class Trimorphic
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cube=(int)Math.pow(n,3);
        int g=n;
        int c=0;
        while(g>0)
        {
            int r=g%10;
            c++;
            g/=10;
        }
        int v=(int) Math.pow(10,c);
        int div=cube%v;
        if(n==div)
        {
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("Not Trimorphic Number");
        }
    }
}