//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To find the factorial of a given number.

import java.io.*;
class Factorial
{
    public void fact(int a)
    {
        int i=a; long j=1;
        while(i!=1)
        {
            j=j*i;
            i--;
        }
        System.out.println("The factorial of " + a + " is " + j);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Please enter the number.");
        n=Integer.parseInt(br.readLine());
        Factorial ob=new Factorial();
        ob.fact(n);
    }
}