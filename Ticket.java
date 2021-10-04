
public class Ticket
{
    public void tic(String s1, String s3, String s4, int adult, int child, double price , String date, String returns  )
    {
        Stations obj = new Stations();
        System.out.println("\n\n___________________________________________\n*******************************************\n      MUMBAI SUBURBAN RAILWAYS     \n*******************************************");
        System.out.print("Date:"+date+
            "\nRs."+price+"\n"+s3+"\t"+returns+"\n"+//price,class and return or not 
            "From: "+ obj.to+"  \tDest: "+obj.from +"\n"+
            "Adult: "+adult+"\t\tChild: "+child+"\n\n"+
            "---------------HAPPY JOURNEY---------------\n"+
            "___________THANK YOU FOR JOINING US________\n\n\n"); // Printing the final ticket

    }
}
