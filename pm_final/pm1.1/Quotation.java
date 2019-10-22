import java.time.LocalDate;
import java.text.DecimalFormat;
/**
 * @author (Team 27)
 * @version (1.0)
 */
public class Quotation
{
    // instance variables - replace the example below with your own
    private Customer customer;
    private Hall hall;
    private float estimatedPrice;
    private String typeOfEvent;
    private boolean isCateringPreferred;
    private int noOfPeopleAttending;
    private LocalDate date;
    private TimeSlot time;
    private float discountPercent;

    /**
     * Constructor for objects of class Quotation
     */
    public Quotation()
    {
        // initialise instance variables
        hall = new Hall();
        estimatedPrice = 0;
        typeOfEvent = " ";
        isCateringPreferred = false;
        noOfPeopleAttending = 0;
        discountPercent = 0.0f;
    }
    
    public Quotation(Customer newCustomer,Hall newHall,String newTypeOfEv, boolean newIsCatePref, int newNoOfPeopAttend,LocalDate newDate,TimeSlot newTime, float newDiscount)//comment
    {
        hall = newHall;
        typeOfEvent = newTypeOfEv;
        isCateringPreferred = newIsCatePref;
        noOfPeopleAttending = newNoOfPeopAttend;
        date = newDate;
        time = newTime;
        estimatedPrice = isCateringPreferred?(hall.getHallBasePrice()+20) * noOfPeopleAttending:hall.getHallBasePrice() * noOfPeopleAttending;
        discountPercent = newDiscount;//comment
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setCustomer(Customer newCustomer)
    {
        customer = newCustomer;
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
    
    /**Validation to check capacity (if capacity entered is greater than hall capacity)**/
    public boolean checkCapacity(int planedNoOfPeopleAttend)
    {
        if (planedNoOfPeopleAttend <= hall.getHallCapacity())
            return true;
        else
            return false;
    }
    
    public void setTimeSlot(TimeSlot tm)
    {
        time = tm;
    }
    
    public TimeSlot getTimeSlot()
    {
        return time;
    }
    public void setDate(LocalDate da)
    {
        date =da;
    }
    
    public LocalDate getDate()
    {
        return date;
    }

    public float getDiscount()
    {
        return discountPercent;
    }
    
    public void setDiscount(float newDiscount)
    {
        discountPercent = newDiscount;
    }
    
    public boolean checkDiscountCode(String discountcode)
    {
        if(discountcode.toUpperCase().equals("PRIME"))
        return true;
        else
        return false;
    }
}
