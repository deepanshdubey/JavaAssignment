import java.io.*;
class Calling
{
    static Calling k;
    void byValue(int a)
    {
        a=a*10;
        System.out.println("Call by Value = " + a);
    }
    static void byReference(Calling refer)
    {
        Calling.k=refer;
        System.out.println("Call by reference function value = " + Calling.k);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int x;
        System.out.println("Please enter the number");
        x=Integer.parseInt(br.readLine());
        Calling ob= new Calling();
        ob.byValue(x);
        //Calling.k=x;
        byReference(ob);
    }
}

