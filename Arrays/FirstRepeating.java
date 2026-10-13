import java.util.Scanner;
class FirstRepeating
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
            int lc=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    lc++;
                }
            }
            if(lc>0)
            {
                  System.out.println(a[i]);
                  break;
            }
        }
   
    }
}