//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : Printing a Pattern.

import java.io.*;

class Pattern {
    public static void main(String args[]) throws IOException {
        int i, j;
        for (i = 1; i <= 3; i++)
        {
            for (j = 0; j < 3 - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++)
            {
                System.out.print(k);
            }
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}
