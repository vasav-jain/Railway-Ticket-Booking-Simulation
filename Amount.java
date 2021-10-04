
public class Amount
{
    double amt;
    public double amount(String boarding,String destination,String returns,char trclass,int adult,int child)//All required data is recieved
    { 
        Stations obj = new Stations();
        //initialization of variables:
        
        double place=0.0,place1=0.0,amountc=0.0,amounta=0.0,temp=0.0,temp2=0.0;
        double rate_c_s=0.125,rate_c_f=0.50,rate_a_s=0.25,rate_a_f=1;//Rates declared
        String t=obj.departure(boarding);
        place = Stations.distance1;//boarding place stored
        String u = obj.check(destination);
        place1=Stations.distance;//destination stored
        //Calculating amount
        double distance =Math.round(Math.abs(place1-place));//approximate positive distance calculated
        if(trclass=='s')//amount for second class 
        {
            if(child>0)//Amount for child
            {
                temp=distance*rate_c_s;
                if(temp<2)
                amountc=2*child;
                else
                amountc=child*distance*rate_c_s;
            }
            if(adult>0)//Amount for adult
            {
                temp2=distance*rate_a_s;
                if(temp2<4)
                amounta=4*adult;
                else
                amounta=adult*distance*rate_a_s;
            }
        }
        else//amount for first class:
        {
            if(child>0)//Amount for child
            {
                temp=distance*rate_c_f;
                if(temp<20)
                amountc=20*child;
                else
                amountc=child*distance*rate_c_f;
            }
            if(adult>0)//Amount for adult
            {
                temp2=distance*rate_a_f;
                if(temp2<40)
                amounta=40*adult;
                else
                amounta=adult*distance*rate_a_f;
            }
        }
        amt=Math.round(amountc+amounta);//Total amount calculated 
        if(returns.equals("Return"))
        amt=amt*2;
        return amt;//amount is passed to function
    }
}
