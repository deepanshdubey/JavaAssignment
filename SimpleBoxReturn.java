//Author  : Deepansh Dubey.
//Date    : 11/09/2021.

import java.io.*;
class SimpleBoxReturn
{
   static int width, height, depth;
    int Volume(int width, int height, int depth)
    {
        int vol= width*height*depth;
        return vol;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Please enter the \nWidth\nHeight\nDepth");

        width=Integer.parseInt(br.readLine());
        height=Integer.parseInt(br.readLine());
        depth=Integer.parseInt(br.readLine());

        SimpleBoxReturn ob1=new SimpleBoxReturn();
        SimpleBoxReturn ob2=new SimpleBoxReturn();
        System.out.println("Volume = " + ob1.Volume(width,height,depth));
    }
}
