import java.util.Scanner;
class Read 
{
    public static void main(String args[])
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=read.nextLine();
        System.out.print("Enter an integer : ");
        int n=read.nextInt();
        System.out.print("Enter a flaoting point : ");
        float f=read.nextFloat();
        System.out.print("Enter a doble precision floating point : ");
        double d=read.nextDouble();
    }
    
}
