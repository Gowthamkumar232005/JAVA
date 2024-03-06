import java.util.Scanner;
public class read 
{
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=reader.nextInt();
        float f=reader.nextFloat();
        String str="Hello";
        double d=2.3546789;
        System.out.println("integer is : "+a+"\nFloat is : "+f+str+d);
    }
}
