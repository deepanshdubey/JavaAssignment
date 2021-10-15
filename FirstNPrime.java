//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To print first n prime numbers.

import java.io.*;
class FirstNPrime{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean isPrime;
        System.out.println("Please enter the no.");
        int p=Integer.parseInt(br.readLine());

        for(int i=2;i<=p;i++)
        {
            isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print(i+", ");
            }
        }
    }
}
