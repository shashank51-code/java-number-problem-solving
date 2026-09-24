import java.util.Scanner;
class Fascinating
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n*1;
        int n2=n*2;
        int n3=n*3;
        String na=String.valueOf(n1)+String.valueOf(n2)+String.valueOf(n3);
        boolean fasinating=true;
        if(na.length()!=9 || na.contains("0"))
        {
            fasinating=false;
        }
        for(char ch='1';ch<='9';ch++)
        {

            int count=0;
            for(int i=0;i<na.length();i++)
            {
                if(na.charAt(i)==ch)
                {
                    count++;
                }
            }
            if(count!=1)
            {
                fasinating=false;
                break;
            }
        }
        if(fasinating)
        {
              System.out.println("Fascinating Number");
        }
        else
        {
            System.out.println("Not Fascinating Number");
        }
      
        
    }
}