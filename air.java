import java.util.Scanner;
public class air 
{
    public static  void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter two number : ");
        int a=read.nextInt();
        int b=read.nextInt();
        int c=0;
        System.out.print("Enter an Operator : ");
        char ch=read.next().charAt(0);
        switch(ch)
        {
            case '+':
                    c=a+b;
                    break;
            case '-':
                    c=a-b;
                    break;
            case '*':
                    c=a*b;
                    break;
            case '/':
                    c=a/b;
                    break;
            case '%':
                    c=a%b;
                    break;
            default:
                    System.out.println("Enter valid Operator");
        }
        System.out.println("The Final value is "+c);
   }
}
