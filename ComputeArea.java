//Author  : Deepansh Dubey.
//Date    : 14/09/2021.

import java.io.*;
class ComputeArea
{
    int length, base;
    float breadth, height;
    void area(int length)
    {
        int area = length*length;
        System.out.println("Area of Square = " + area);
    }
    void area(int length,float breadth)
    {   
        float area = length*breadth;
        System.out.println("Area of Rectangle = " + area);

    }
    void area(int base, int height)
    {
        float area=(base*height)/2;
        System.out.println("Area of Triangle = " + area);

    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int l,h,bs;
        float b;
        System.out.println("Please enter the length.");
        l=Integer.parseInt(br.readLine());
        System.out.println("Please enter the breadth.");
        b=Float.parseFloat(br.readLine());
        System.out.println("Please enter the height.");
        h=Integer.parseInt(br.readLine());
        System.out.println("Please enter the base.");
        bs=Integer.parseInt(br.readLine());
        ComputeArea ob=new ComputeArea();
        ob.area(l,l);
        ob.area(l,b);
        ob.area(bs,h);
    }
}
