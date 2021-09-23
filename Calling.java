import java.io.*;
class Calling
{
    void byValue(int a)
    {
        a=a*10;
        System.out.println("Call by Value = " + a);
    }
    int byReference(int b)
    {
        b=b+10;
        return b;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int x,k;
        System.out.println("Please enter the number");
        x=Integer.parseInt(br.readLine());
        Calling ob= new Calling();
        ob.byValue(x);
        k=ob.byReference(x);
        System.out.println("Call by Reference = " + k);

    }
}
