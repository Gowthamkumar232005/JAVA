class rol
{
    int roll;
    rol(int roll)
    {
        this.roll=roll;
    }
    void display()
    {
        System.out.println(roll);
    }
}
class thiskey
{
    public static void main(String a[])
    {
        rol ob=new rol(129);
        ob.display();
    }
}
