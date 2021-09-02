//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To check whether a is prime or not.

import java.io.*;
class Grade {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float p;
        System.out.println("Please enter the percentage.");
        p = Float.parseFloat(br.readLine());

        if (p >= 97) {
            System.out.println("The Grade is 'A+'");
        } else if (p > 93 && p < 96) {
            System.out.println("The Grade is 'A'");

        } else if (p > 90 && p < 92) {
            System.out.println("The Grade is 'A-'");

        } else if (p > 87 && p < 89) {
            System.out.println("The Grade is 'B+'");

        } else if (p > 83 && p < 86) {
            System.out.println("The Grade is 'B'");

        } else if (p > 80 && p < 82) {
            System.out.println("The Grade is 'B-'");

        } else if (p > 77 && p < 79) {
            System.out.println("The Grade is 'C+'");

        } else if (p > 73 && p < 76) {
            System.out.println("The Grade is 'C'");

        } else if (p > 70 && p < 72) {
            System.out.println("The Grade is 'C-'");

        } else if (p > 67 && p < 69) {
            System.out.println("The Grade is 'D+'");

        } else if (p > 65 && p < 66) {
            System.out.println("The Grade is 'D'");

        } else if (p < 65) {
            System.out.println("The Grade is 'F'");

        }
    }
}
