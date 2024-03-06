import java.util.Scanner;
public class rec 
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n=read.nextInt();
        System.out.println("Factorial of "+n+" is "+Fact(n));

    }
    public static int Fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*Fact(n-1);
    }    
}
