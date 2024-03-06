class methodover 
{
    void test()
    {
        System.out.println("Testing ");
    }
    void test(int a)
    {
        System.out.println("Given : "+a);
    }
    void test(double n,double m)
    {
        System.out.println("Sum : "+(n+m));
    }
    void test(float x,float y)
    {
        System.out.println("Product : "+x*y);
    }
    public static void main(String a[])
    {
        methodover obj=new methodover();
        obj.test();
        obj.test(29);
        obj.test(1.23,2.34);
        obj.test(1.1f,2.2f);
    }
}
