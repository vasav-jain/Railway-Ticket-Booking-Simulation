import java.util.*;
public class Stations
{
    static String station[]=  {"Virar","NalaSopara", "Vasai-Road","Nalgaon","Bhayander","Mira-Road","Dahisar","Borivali"
        , "Kandivali","Malad","Goregaon","Jogeshwari","Andheri","Vile-Parle","Santacruz",
            "Khar-Road","Bandra","Mahim-Junc","Matunga","Dadar","Elphinston","Lw-Parel",
            "Mahalaxmi","Central","Grant-Road","Charni-Rd","Marine-Ln","Churchgate"}; 
    // full forms of all the stations

    static String sh_st[] = {"vr","ns","va","na","ba","mr","da","bo","ka","ma","go","jo","an","vp",
            "sa","kr","bn","mj","mt","dr","er","lp","mh","mc","gr","ch","ml", "cg"}; 
    //short forms of all the stations

    static double dist[] = {55.98,55.85,51.73,47.70,43.11,39.76,36.34,33.98,31.22,29.32,26.90,23.52,21.83,19.57,17.51,16.29,
            14.66,12.93,11.75,10.17,8.98,7.57,5.95,4.48,3.59,2.21,1.30,0};
    // distance of stations from the main correspondance (VT) - Churchgate

    static Scanner sc = new Scanner (System.in); 
    static double distance;
    static double distance1;
    static String from = "";
    static String to = "";
    int pos;
    Settings set = new Settings ();
    public void display()
    {
        int i;
        System.out.println ("Enter the 2 character code corresponding to the station"); 
        //display for taking short form input from user for the desired station
        for(i=0; i< station.length; i++) // displaying menu thrugh the formed arrays

        {
            System.out.print( (1+i) + "." + station[i] + ":" + " \t \t \t" + sh_st[i] );
            System.out.println();
        }

    }

    public static String check(String b)// Finally taking the station input from the user
    {
        int pos = 0;
        int j;
        int flag = 0 ;
        
        for (j=0; j< station.length; j++) 
        {
            if (sh_st[j].equalsIgnoreCase(b)) 
            {
                flag = 1; // Confirming that station is found
                pos = j; // Storing the destination
                break;
            }
        }
        distance = dist[pos];
         from = station[j];
        
        

        return from; // Returning the station to 'Structure'
    }
      public  static String departure (String a)
    {   int pos1 = 0;
        int j1;
        int flag1 = 0 ;
        
        for (j1=0; j1< station.length; j1++) 
        {
            if (sh_st[j1].equalsIgnoreCase(a)) 
            {
                flag1 = 1; // Confirming that station is found
                pos1 = j1; // Storing the destination
                break;
            }
        }
        distance1 = dist[pos1];
        to = station[j1];
        return to;
    }
}
