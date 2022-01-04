public class Overloading
{
    void sum(int a,int b)
    {
        System.out.println("sum is" +(a+b));

    }
    void sum(int a,int b,int c)

    {
        System.out.println("sum is " +(a+b+c));
    }
    public static void main(String args[])
    {
        Overloading obj=new Overloading();
        obj.sum(10,20);
        obj.sum(15,19,21);
    }
}
