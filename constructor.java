class cons
{
    float pi=3.14f,rad;
    cons(float r)
    {
        rad=r;
    }
    float areac()
    {
        return pi*rad*rad;
    }
    public static void main(String arg[])
    {
        cons obj=new cons(1.23f);
        System.out.println("Area of circle : "+obj.areac());
    }
}
