//Author  : Deepansh Dubey.
//Date    : 24/09/2021.

import java.io.*;
class AddConstBox
{
    static int width, height, depth;
    AddConstBox(int width, int height, int depth)
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
        AddConstBox ob=new AddConstBox(width,height,depth);
    }
}