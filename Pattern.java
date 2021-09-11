//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : Printing a Pattern.

import java.io.*;

class Pattern {
    public static void main(String args[]) throws IOException {
        int i,j,k;
        
        for(i=0;i<4;i++)
        {
            for(k=0;k<3-i;k++)
            {
                System.out.print(" ");
            }
            for(j=0;j<2*i+1;j++)
            {
                System.out.print(i+1-Math.abs(i-j));
            }
            System.out.println();
        }
    }

}
