import java.util.Arrays;
import java.util.Scanner;
class Kthhighest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter k value");
        int k=sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[n-k]);
    }
}