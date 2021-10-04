import java.util.*;
public class Secondary_info
{
    public String trainclass(char a) 
    {
        // Entering full forms for the ticket to be displayed
        if(a=='f')
            return "First class"; 
        else
        if(a=='s')
            return "Second class";
        else 
            return ""; // Will produce the error statement
    }

    public String returnv (char returnc) 
    // Entering full form for the ticket to be displayed
    {
        String returns=""; // redirects to 'error'
        if(returnc=='r')
            returns="Return";
        else
        if(returnc=='n')
            returns="One Way";
        else
            returns="Wrong choice"; 
        return returns; // returnig values to 'structure' 
    }

    public String date () 
    {
        Calendar c = Calendar.getInstance();
        String date=(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.DATE))+"/"+(c.get(Calendar.YEAR));
        return date; // storing date for the ticket 
    }
}
