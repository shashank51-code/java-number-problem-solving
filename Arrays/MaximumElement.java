import java.util.Scanner;
class MaximumElement
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        int a[]={120, 450, 230, 670, 310};
        
        int h=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>h)
            {
                h=a[i];
            }
        }
        System.out.println(h+" ");
    }
}