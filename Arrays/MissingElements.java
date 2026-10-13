import java.util.Scanner;
class MissingElements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        int num=a[0];
      
            for(int i=num;i<=a[n-1];i++)
            {
                boolean found=false;
                for(int j=0;j<n;j++)
                {
                    if(i ==a[j])
                    {
                       found=true;
                       break;
                    }
                }
                if(!found)
                {
                    System.out.print(i+" ");
                }
            }
      
        
        
    }
}