class Hello
{
    void print()
    {
        System.out.println("Hello");
    }
}
class superkey extends Hello
{
    void print()
    {
        super.print();
        System.out.println("World ");
    }
    public static void main(String a[])
    {
        superkey obj=new superkey();
        obj.print();
    }
}