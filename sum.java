import java.util.Scanner;
public class sum 
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=read.nextInt();
        int b=read.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }
}
