//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To find the factorial of a given number.

import java.io.*;
class Factorial
{
    public void factorial(int a)
    {
        int i=a; long  fact = 1;
        while(i!=1)
        {
            fact = fact*i;
            i--;
        }
        System.out.println("The factorial of " + a + " is " + fact);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter a number.");
        n=Integer.parseInt(br.readLine());
        Factorial ob=new Factorial();
        ob.factorial(n);
    }
}
