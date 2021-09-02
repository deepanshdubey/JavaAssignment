//Author  : Deepansh Dubey.
//Date    : 2/09/2021.
//Purpose : To check whether a is prime or not.

import java.io.*;
class CheckVowel
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch;
        System.out.println("Please enter the character");
        ch=(char)br.read();
        if(Character.isLetter(ch))
        {
            switch(ch)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Character is Vowel.");
                    break;
                default:
                    System.out.println("Character is Consonant.");
            }
        }
        else
        {
            System.out.println("Don't act oversmart, enter alphabets only.");
        }
    }
    
}
