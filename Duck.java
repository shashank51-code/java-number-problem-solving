import java.util.Scanner;
class Duck
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean found=false;
        while(n>0)
        {
            int digit=n%10;
            if(digit==0)
            {
                found=true;
            }
            n/=10;
        }
        if(found)
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
    }
}