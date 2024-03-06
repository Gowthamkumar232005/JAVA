import java.util.Scanner;
public class fact
{
    public static void main(String args[])
    {
        int i,fact=1;
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=read.nextInt();
        for(i=1;i<=n;i++)
            fact=fact*i;
        System.out.println("Factorial of "+n+" is "+fact);
    }

}
