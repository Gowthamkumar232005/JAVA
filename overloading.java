class over 
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
    static float add(float a,float b)
    {
        return a+b;
    }
    public static void main(String a[])
    {
        System.out.println("Integer addition : "+add(2,5));
        System.out.println("Double addition : "+add(1.22,2.11));
        System.out.println("Float addition : "+add(1.23f,3.14f));
    }
    
}
