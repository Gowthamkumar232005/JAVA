class A
{
    float sal=2000;
}
class inheritance extends A
{
    int bonus=200;
    public static void main(String a[])
    {
        inheritance ob=new inheritance();
        System.out.println("Salary : "+ob.sal);
        System.out.println("Bonus : "+ob.bonus);
    }
}
