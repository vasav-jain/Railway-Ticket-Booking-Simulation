// error in structure
// error in amount
// in Input, last block comments missing cuz mostly integer is in this class
import java.io.*;
public class Settings
{
    public static String boarding_s="vr";
    public void set()
    {
        String boarding_l=""; double d1=0;
        Input input = new Input();
        Stations stations=new Stations();
        Welcome welcome=new Welcome();
        Error error = new Error();
        boolean n =true;//variables initialized to true for while loop
        stations.display();//Displaying options
        while(n ==true)
        {
            System.out.println("Ticket to be issued from...");            
            boarding_s = input.string();
            
            boarding_l = stations.departure(boarding_s);//boarding_s is converted to its long form and stored in boarding_l
            d1=Stations.distance;
            if(boarding_l=="")
            {
                System.out.println(error.choice());
            }
            else
            {     
                System.out.println("Place selected: "+boarding_l);
                n = false;// set to false so that the loop does not continue
            }            
        }
        welcome.main();//main menu displayed 
    }
}