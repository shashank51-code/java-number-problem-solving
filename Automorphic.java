import java.util.Scanner;
class Auto
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=n;
    int sq=n*n;
    // String n1=String.valueOf(n);
    // String n2=String.valueOf(sq);
    // String last=n2.substring(n2.length()-n1.length());
    //     if(n2.endsWith(n1))
    //     {
    //         System.out.println(last+" Auto");
    //     }
    //     else
    //     {
    //         System.out.println(last+" non auto");
    //     }
    // }
        int c=0;
        while(t>0)
        {
            c++;
            t/=10;
        }
        int div=(int)Math.pow(10,c);
        int last=sq%div;
        if(n==last)
        {
             System.out.println(n+" Auto");
        }
        else
        {
            System.out.println(last+" non auto");
        }
    }


}