import java.util.Scanner ; // Importing Utility class
public class Welcome
{
    static Scanner sc = new Scanner (System.in);
    char ch;
    Input in = new Input();
    Structure struc = new Structure();
    Settings st = new Settings();
    Exit exit = new Exit();
    Error error = new Error();
    int n;
    // Declaring objects of all other classes and declaring required variables
    //Welcome ob = new Welcome(); 
    public Welcome () // putting forth the concept of Constructor
    {
        ch = '\u0000' ;
        n = 0;

        // intializing previously declared variables

    }
    public static void display ()
    {  Welcome ob = new Welcome(); 
        System.out.println("\f,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n"+
                "---------------------------------------------------------------------------TICKET VENDING MACHINE V1.0------------------------------------------------------------------------------\n"+
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n\n"+
                "                                                                                        #***#\n"+
                "                                                                                      #*******#\n"+
                "                                                                                    #***********#\n"+
                "                                                                                  #***************#\n"+
                "                                                                                #*******************#\n"+
                "                                                                              #***********************#\n"+
                "                                                                            #***************************#\n"+
                "                                                                           #******************************#\n"+
                "                                                                          #--------------------------------#\n"+
                "                                                                               <MUMBAI SUBURBAN RAILWAYS>     \n"+
                "                                                                          #--------------------------------#\n"+
                "                                                                           #******************************#\n"+
                "                                                                            #***************************#\n"+
                "                                                                              #***********************#\n"+
                "                                                                                #*******************#\n"+
                "                                                                                  #***************#\n"+
                "                                                                                    #***********#\n"+
                "                                                                                      #*******#\n"+
                "                                                                                        #***#\n"+
                "                                                                                         \n\n\n"                 );   
            System.out.println("************************************************************************************************************************************************************************************\n"+
                "--------------------------------------------------------------------------------------WELCOME---------------------------------------------------------------------------------------\n"+
                "************************************************************************************************************************************************************************************\n");
        ob.main();
    }
    public void main()
    {
        

        
        
            
             
            do {    
            String str = "Enter 'c' to start issuing the ticket\nEnter 's' to change boarding place (default is Virar)\nEnter 'x' to EXIT the application\t\t\t";
            // Displaying Choice for the user to decide what function is to be undertaken
            for(int ii = 0 ; ii < str.length() ; ii++) // Displaying 'str'
            {

                System.out.print(str.charAt(ii));
                for (int iii = 0 ; iii < 999999 ; iii++) // delay loop 
                {
                    for (int i = 0 ; i < 99 ; i++) // for running text effect
                    {

                    }
                }
            }

            ch = sc.next().charAt(0); // entering the users choice for the function 
            switch(ch)
            {
                case 'c': struc.body(); // Go ahead wit the program (Redirect to 'structure')

                break;
                case 's':st.set(); // Change departure station (Redirect to 'settings')

                break;
                case 'x':exit.exit(); // Terminate the program (Redirect to 'exit')
                 break;
                default:System.out.println(error.choice());

                //If wrong value is entered,the error message is shown and input is asked again
            }

        }
        while (n==0); // Continuing to run the loop until user does not mention 'x' (exit)

    }
}
