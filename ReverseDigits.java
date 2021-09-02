//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To reverse digits of a given number.

import java.io.*;
class ReverseDigits
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,rev = 0;  
        System.out.println("Please enter the no.");
        n=Integer.parseInt(br.readLine());
        while(n != 0)   
        {  
            int remainder = n % 10;  
            rev = rev * 10 + remainder;  
            n = n/10;  
        }  
        System.out.println("The reverse of the given number is: " + rev);  
    }           
}
