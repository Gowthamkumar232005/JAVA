class Hel
{
    final void run()
    {
        System.out.println("Hello");
    }
}
class finalkey extends Hel
{
     void run()
     {
        System.out.println("Hi");
     }    
     public static void main(String a[])
     {
        finalkey ob=new finalkey();
        ob.run();
     }
}
