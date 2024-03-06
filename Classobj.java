import java.util.*;
class Classobj 
{
     public static int sum1(int a,int b,int c)
     {
        return (a+b+c);

     }
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int x=r.nextInt();
        int y=r.nextInt();
        int z=r.nextInt();
        System.out.println("Sum of three numbers : "+sum1(x,y,z));
    }
    
}
