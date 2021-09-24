//Author  : Deepansh Dubey.
//Date    : 14/09/2021.

class ConstOver
{
        int id;  
        String name;   
        ConstOver()
        {  
             System.out.println("this a default constructor");  
        }  
          
        ConstOver(int i, String n)
        {  
            id = i;  
            name = n;  
        }   
        public static void main(String[] args)
        {  
            ConstOver ob = new ConstOver();  
            System.out.println("\nDefault Constructor values: \n");  
            System.out.println("Student Id : "+ob.id + "\nStudent Name : "+ob.name);  
            System.out.println("\nParameterized Constructor values: \n");  
            ConstOver student = new ConstOver(2, "Robin");  
            System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
        }  
}  

