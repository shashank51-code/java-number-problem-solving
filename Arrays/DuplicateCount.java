import java.util.Scanner;
class DuplicateCount
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            int lc=0;
            for(int j=0;j<=i;j++)
            {
                if(a[i]==a[j])
                {
                    lc++;
                }
            }
            if(lc==2)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("No duplicates there");
        }
        else
        {

            System.out.println(c);
        }
    }
}