import java.io.*;
class Calling
{
    static int k;
    void byValue(int a)
    {
        a=a*10;
        System.out.println("Call by Value = " + a);
    }
    int byReference(Calling refer)
    {
        refer.k=+10;
        return k;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int x;
        System.out.println("Please enter the number");
        x=Integer.parseInt(br.readLine());
        Calling ob= new Calling();
        ob.byValue(x);
        ob.k=2000;
        System.out.println("Call by Reference = " + k);

    }
}

