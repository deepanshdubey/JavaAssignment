//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To print fibbonacci series upto a given number.

import java.io.*;
class Fibonacci
{   
    void series(int x)
    {
        int i=x-2, a=0, b=1, c;

        if (x<3) 
        {
            System.out.println("Hahaha! Played Smart....\nEnter atleast 3 terms to get the series.");
        } 
        else 
        {
            System.out.print("The fibonacci series upto "+ x + " terms is:-\n\t" + a + "\t" + b);
            while(i!=0)
            {
                c=a+b;
                a=b;
                b=c;
                i--;
                System.out.print("\t"+c);
            }
        }
            
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Please enter the number of terms of the series");
        n=Integer.parseInt(br.readLine());

        Fibonacci ob=new Fibonacci();
        ob.series(n);
    }    
}
