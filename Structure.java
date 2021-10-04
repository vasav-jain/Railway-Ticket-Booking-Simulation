import java.util.*;
public class Structure // main body of the program 
{
    public void body ()
    {
        Scanner sc = new Scanner (System.in);
        int adult = 0; 
        int child = 0;
        char class_type_s=' ';
        char returns;
        char exitval;
        double price = 0.0;
        String dest_s = "";
        String dest_l = ""; 
        String class_type_l = "";
        String date_to_pass = "";
        String returnl= "";
        String boarding_s = "";
        // declaring all required variables including the ones storing Return values
        Settings Settings = new Settings();
        Welcome start = new Welcome (); 
        Input in = new Input();
        Stations stations = new Stations();
        Ticket tc = new Ticket();
        Amount amt = new Amount();
        Error error = new Error();
        Exit ex = new Exit();
        Secondary_info info = new Secondary_info();

        stations.display();
        boarding_s = Settings.boarding_s;
        // Calling objects of all classes as the contain the return values

        int n = 0;
        // acts like a flag variable to check if condition holds true
        do
        { 
            System.out.println("Enter destination");
            dest_s = sc.nextLine(); // taking input of shortform from the user
            dest_l = Stations.check(dest_s); // corresponding the shortform the the long string in the 'Stations' class
            if(dest_l.equals(""))
            {
                System.out.println(error.choice()); // invalid choice by invalid character
            }
            else
            if(dest_s.equals(boarding_s))
                System.out.println("The boarding and destination cannot be same"); 
                // invalid choice by departure and arrival beind the same
            else
            {     
                System.out.println("Place selected: "+dest_l);
                n=1; // valid option
            }            

        }
        while (n==0); // re-running program in case of error 

        n=0; // re-initialization
        do
        {System.out.println ("\nEnter the number of adults:\t"); // storing number of adults
         try
         {
             adult = sc.nextInt();
             n=1;
         }
         catch (Exception e)
         {
            System.out.println(error.Format());
         }
         System.out.println ("\nEnter the number of children:\t"); // storing number of children
         try
         {
             child = sc.nextInt();
             n=1;
         }
         catch (Exception e)
         {
            System.out.println(error.Format());
         }
         
        }
        while(n==0); // in case of error re-run the code

        n=0; // re-initialization
        do 
        {
            System.out.println("\nPress f for first class\nPress s for second class"); // Selection for first class of second class
            class_type_s= sc.next().charAt(0); // number of second class tickets   
            class_type_l=info.trainclass(class_type_s); // Calculating with the second class tickets

            if(class_type_l.equals("")) 
                System.out.println(error.character()); // entered wrong character
            else
            {
                System.out.println("Class selected: "+class_type_l); // valid choice for __class
                n=1; // updating value to stop DoWhile from running
            }

        }
        while (n==0); // re-running the program

        n=0; // re-initialization
        do
        {
            System.out.println("\nPress r for Return \nPress n for One Way"); // one way or return ticket
            returns=sc.next().charAt(0); // entering return 
            returnl=info.returnv(returns); // Calculating with the Return Ticket
            if(returnl.equals("Wrong choice"))
                System.out.println(error.character()); //entered wrong character 
            else
            if(returnl.equals("One Way"))
            {
                System.out.println("\nType Selected: Normal"); // entered one way ticket
                n=1;
            }
            else
            {
                System.out.println("\nType Selected: Return"); // entered return ticket
                n=1;
            }

        }
        while (n==0); // re-running the snippet in case of error

        date_to_pass=info.date();
        amt.amount(boarding_s,dest_s,returnl,class_type_s,adult,child);
        price=amt.amt;
        tc.tic(dest_s,class_type_l,boarding_s,adult,child,price,date_to_pass,returnl);
        n=0;// Re-initialization
        // Redirection to 'ticket' class after calculating date
        do 
        {
            System.out.println("\nPress c to continue or press x to exit"); // Choosing the welcome choice again  
            exitval=sc.next().charAt(0); // Entering choice
            if(exitval=='c' || exitval=='C') // if the user wants to book more tickets once the transaction is over
            {
                start.display();
                n=1; 
            }
            else
            if(exitval=='x' || exitval=='X' ) // to terminate the program 
            {
                ex.exit();
                n=1;
            }
            else
                System.out.println(error.character()); // Redirection to 'error'
        }
        while (n==0); // Re-running in case of error

        
        
    }

}
