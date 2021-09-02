//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To check whether a is prime or not.

import java.io.*;
class CheckPrime
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int p,i,k=0;
        System.out.println("Please enter the no.");
        p=Integer.parseInt(br.readLine());

        for(i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                k++;
            }
        }

        if (k==2)
            {
                System.out.println("It's a PRIME number.");    
            } 
            else 
            {
                System.out.println("It's NOT a PRIME number.");    
            }
    }
    
}
