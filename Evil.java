import java.util.Scanner;
class Evil
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String na="";
        while(n>0)
        {
            int r=n%2;
            na=r+na;
            n/=2;
        }
        int c=0;
        for(int i=0;i<na.length();i++)
        {
            if(na.charAt(i)=='1')
            {
                c++;
            }
        }
        if(c%2==0)
        {
            System.out.println("Evil number");
        }
        else
        {
            System.out.println("Not Evil Number");
        }
    }
}