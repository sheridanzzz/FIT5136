
/**
 * Write a description of class Quotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quotation
{
    // instance variables - replace the example below with your own

    private Hall hall;
    private float estimatedPrice;
    private String typeOfEvent;
    private boolean isCateringPreferred;
    private int noOfPeopleAttending;

    /**
     * Constructor for objects of class Quotation
     */
    public Quotation()
    {
        // initialise instance variables

    }
    
    public Quotation(Hall newHall,float newEstPrice,String newTypeOfEv, boolean newIsCatePref, int newNoOfPeopAttend)
    {
        hall = newHall;
        typeOfEvent = newTypeOfEv;
        isCateringPreferred = newIsCatePref;
        noOfPeopleAttending = newNoOfPeopAttend;
        estimatedPrice = isCateringPreferred?(hall.getHallBasePrice()+20) * noOfPeopleAttending:hall.getHallBasePrice() * noOfPeopleAttending;
    }

    public Hall getHall()
    {
        return hall;
    }

    public void setHall(Hall newHall)
    {
        hall = newHall;
    }

    public float getEstimatedPrice()
    {
        return estimatedPrice;
    }

    public void setEstimatedPrice(float newEstimatedPrice)
    {
        estimatedPrice = newEstimatedPrice;
    }

    public String getTypeOfEvent()
    {
        return typeOfEvent;
    }

    public void setTypeOfEvent(String newTypeOfEvent)
    {
        typeOfEvent = newTypeOfEvent;
    }

    public boolean getIsCateringPreferred()
    {
        return isCateringPreferred;
    }

    public void setIscateringPreferred(boolean newIsCaterPref)
    {
        isCateringPreferred = newIsCaterPref;   
    }
    
    public int getNoOfPeopleAttending()
    {
        return noOfPeopleAttending;
    }
    
    public void setNoOfPeopleAttending(int newNoOfPeopleAttending)
    {
        noOfPeopleAttending = newNoOfPeopleAttending;
    }
    
   
    public boolean checkCapacity(int planedNoOfPeopleAttend, Hall newHall)
    {
        if (planedNoOfPeopleAttend <= newHall.getHallCapacity())
        return true;
        else
        return false;
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
