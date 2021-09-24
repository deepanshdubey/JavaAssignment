//Author : Deepansh Dubey.
//Date   : 24/09/2021.

class UseStatic
{   
    public static int a=50;
    void nonStatic()
    {
        System.out.println("Value of a = "+ a);
    }
    public static void change()
    {
        a=a*50;
        System.out.println("Now the value of a is still = " + a);
    }
    
    public static void main(String args[])
    {
        UseStatic ob=new UseStatic();
        ob.nonStatic();
        UseStatic.change();
        System.out.println("The value of a is still = " + a);
        
    }
}
