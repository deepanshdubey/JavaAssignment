//Author  : Deepansh Dubey.
//Date    : 11/09/2021.

import java.io.*;
class SimpleBox
{
   static int width, height, depth;
    void Volume(int width, int height, int depth)
    {
        int vol= width*height*depth;
        System.out.println("Volume = " + vol);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Please enter the \nWidth\nHeight\nDepth");

        width=Integer.parseInt(br.readLine());
        height=Integer.parseInt(br.readLine());
        depth=Integer.parseInt(br.readLine());

        SimpleBox ob1=new SimpleBox();
        SimpleBox ob2=new SimpleBox();
        ob1.Volume(width,height,depth);
        ob2.Volume(2,4,6);
    }
}
