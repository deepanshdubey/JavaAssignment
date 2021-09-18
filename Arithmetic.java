//Author : Deepansh Dubey.
//Date   : 18/09/2021.

import java.io.*;
class Arithmetic
{
    void sum(int a, int b)
    {
        int sum=a+b;
        System.out.println("\nSum = " + sum);
    }
    void sub(int a, int b)
    {
        int sub = Math.abs(a-b);
        System.out.println("Diff. = " + sub);
    }
    void pro(int a, int b)
    {
        int pro=a*b;
        System.out.println("Product = " + pro);
    }
    void div(int a, int b)
    {
        int div=a/b;
        System.out.println("Div of 'a' by 'b' = " + div);
    }
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,y;
        System.out.println("Please enter the value of 'A'");
        x=Integer.parseInt(br.readLine());
        System.out.println("Please enter the value of 'B'");
        y=Integer.parseInt(br.readLine());

        Arithmetic ob=new Arithmetic();
        ob.sum(x,y);
        ob.sub(x,y);
        ob.pro(x,y);
        ob.div(x,y);
    }
}