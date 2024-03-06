class stat 
{
    static int a=0;
    static int ct()
    {
        return a=a+1;
    }
    public static void main(String a[])
    {
        for(int i=0;i<5;i++)
        System.out.println(ct());
    }
}
