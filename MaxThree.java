//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To find maximum of three numbers.

import java.io.*;
class MaxThree
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c,temp,largest;
        System.out.println("Please enter 3 numbers to be compared.");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        //Logic
        temp=(a>b)?a:b;
        largest = (temp>c)?temp:c;
        //Output
        System.out.println("Largest of three numbers is "+ largest);
    }  
}
