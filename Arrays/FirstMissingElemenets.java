import java.util.Scanner;
class FirstMissingElemenets
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
                    if(a[j]<a[i])
                    {
                            
                        int t=a[j];
                        a[j]=a[i];
                        a[i]=t;
                    }
                }
                
        }
      
            
            int c=0;
            int l=a[0];
            int h=a[n-1];
            for(int i=l;;i++)
            {
                for(int j=0;;j++)
                {
                    if(c<=4)
                    {
                      
                        if(i !=a[j])
                        { 
                             c++;
                            System.out.print(i+" ");
                            break;
                        }
                   
                    }
                }
               
                
            }
    }
}