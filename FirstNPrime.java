//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To print first n prime numbers.

import java.io.*;
class FirstNPrime{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int p,i,j,k=0;
        System.out.println("Please enter the no.");
        p=Integer.parseInt(br.readLine());

        for(i=2;i<=p;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    k++;
                }
            }
            if (k==2)
            {
                System.out.print("\t"+i);   
            }
            k=0;
        }
    }
}
