//Auhtor : Deepansh Dubey.
//Date   : 21/09/2021.

import java.io.*;
class UseThis
{
    int a,b,sum;
    UseThis()
    {
        a=50;
        b=100;
        sum=a+b;
       System.out.println("Sum by constructor = "+ sum);

    }
    void add(int a,int b)
    {
        this.a=a;
        this.b=b;
        this.sum=this.a+this.b;
        System.out.println("Sum by method = " + sum);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int x,y;
        System.out.println("Please enter the \nx:\n&\ny:");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        UseThis ob=new UseThis();
        ob.add(x,y);
        
        
    }
}
