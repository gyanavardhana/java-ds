/*
 * in this java program we are going to find if a number is fibanocci or not /
 * it returns true if the number is fibanocci series.
 * it returns false if the number is not in fibanocci series.
 */
import java.util.Scanner;
public class fibaornot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0,x=0;
        n=sc.nextInt();
        while(a<=n)
        {
            if(c==n)
            {
                System.out.println("True");
                x+=1;
                break;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(x==0)
        {
            System.out.println("False");
        }
        sc.close();
    }
}

