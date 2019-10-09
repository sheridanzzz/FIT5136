import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 * Write a description of class Hall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hall
{
    // instance variables - replace the example below with your own
    private String hallName;
    private HallOwner hallOwner;
    private String description;
    private String address;
    private float depositPercentage;
    private float averageRating; //problem
    private float hallBasePrice;
    private int hallCapacity;
    //private Date[] datesNotAvailableTime;
    private ArrayList<Date> datesHasNotAvailableTime;
    //private String timeslotAvailable;// problem
    private int[][] timeslotNotAvailable;  
    private Date updateDates;
    private boolean hallIsAvailable;

    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {

    }
    
    public Hall(String newHallName, String newDesc,String newAddr,float newDepositPercen, float newHallBasePrice, int newHallCapacity, ArrayList<Date> newDatesHasNotAvailableTime, int[][] newTimeslotNotAvailable)
    {
        hallName = newHallName;
        description = newDesc;
        address = newAddr;
        depositPercentage = newDepositPercen;
        hallBasePrice = newHallBasePrice;
        hallCapacity = newHallCapacity;
        datesHasNotAvailableTime = newDatesHasNotAvailableTime;
        timeslotNotAvailable = newTimeslotNotAvailable;
        hallIsAvailable = true;
        updateDates = new Date();
    }
    
    public String getHallName()
    {
        return hallName;
    }

    public void setHallName(String newHallName)
    {
        hallName = newHallName;
    }

    public String getHallDesc()
    {
        return description;
    }

    public void setHallDesc(String newHallDesc)
    {
        description = newHallDesc;
    }

    public String getHallAddr()
    {
        return address;
    }

    public void setHallAddr(String newHallAddr)
    {
        address = newHallAddr;
    }

    public float getDeposPercen()
    {
        return depositPercentage;
    }
    
    public void setDeposPercen(float newDesposPrecen)
    {
        depositPercentage = newDesposPrecen;
    }
    
    public float getAverageRating()
    {
        return averageRating;
    }
    
    public void setAverageRating(float newAvgRating)
    {
        averageRating = newAvgRating;
    }
    
    public float getHallBasePrice()
    {
        return hallBasePrice;
    }
    
    public void setHallBasePrice(float newHallBasePrice)
    {
        hallBasePrice = newHallBasePrice;
    }
    
    public int getHallCapacity()
    {
        return hallCapacity;
    }
    
    public void setHallCapacity(int newCapacity)
    {
        hallCapacity = newCapacity;
    }
    
    public ArrayList<Date> getDateslotNotAvailable()
    {
        return datesHasNotAvailableTime;
    }
    
    public void setDatesHasNotAvailableTime(ArrayList<Date>newDatesHasNotAvailableTime)
    {
        datesHasNotAvailableTime = newDatesHasNotAvailableTime;
    }
    
    public int[][] getTimeslotAvailable()
    {
        return timeslotNotAvailable;
    }
    

    public void setTimeslotAvailable(int[][] newTimeslotNotAvailable)
    {
        timeslotNotAvailable = newTimeslotNotAvailable;
    }
    
    public boolean getHallIsAvailable()
    {
        return hallIsAvailable;
    }
    
    public void setHallIsAvailable(boolean newHallIsAvailable)
    {
        hallIsAvailable = newHallIsAvailable;
    }
    
    public Date getUpdateDates()
    {
        return updateDates;
    }
    
    public void setUpdateDates(Date newUpdateDates)
    {
        updateDates = newUpdateDates;
    }
    

    /**
    checkStringIsBlank(String):boolean
    **/ 
    /**
    public boolean checkHallAvailable()
    {
        return hallIsAvailable == true;
    }
    **/
    /**
    AcceptInteger(String):int
    **/ 
}
