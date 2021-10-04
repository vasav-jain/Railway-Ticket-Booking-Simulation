import java.io.*;
import java.util.* ;
public class Input
{
    static Scanner sc = new Scanner (System.in); // Declaring Scanner
    static Error error=new Error(); 
    public char character() // Providing input for users (Welcome through Structure) character choice
    {
        
        char c1= ' ';
        boolean n=true;
        while(n == true)
        {
            try
            {
                c1 = sc.next().charAt(0); // Taking users input for choice
                n = false; // Stopping While loop next run 
            }
            catch(Exception e)
            {
                System.out.println(error.DataType()); // Redirecting to "Error" 
            }
        }
        return c1;
    }
    public String string() // Inputing departure
    {
        String s2="";
        boolean n=true;
        while(n==true)
        {
            try
            {
                s2 = sc.nextLine(); // Taking users input 
                n=false; // Stopping While loop next run 
            }
            catch(Exception e)
            {
                System.out.println(error.DataType()); // Redirecting to "Error" 
            }
        }
        return s2;  
    }
    public int integer() 
    {
        int i1=0;
        boolean condition=true;
        while(condition==true)
        {
            try
            {
                i1 = sc.nextInt();
                condition=false;
            }
            catch(Exception e)
            {
                System.out.println(error.DataType());
            }
        }
        return i1;
    }
}