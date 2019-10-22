import java.util.*;
import java.time.LocalDate;
/**
 * Write a description of class Hall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hall
{
    private String hallName;
    private HallOwner hallOwner;//deal with later
    private String description;
    private String address;
    private float depositPercentage;
    private float averageRating; //problem
    private float hallBasePrice;
    private int hallCapacity;
    private HashMap<LocalDate,TimeSlot> datetimesNotAvailable;
    private LocalDate updateDate;
    private boolean hallIsAvailable;
    private ArrayList<Review> reviews;
    private int hallSize;

    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {

    }

    public Hall(String newHallName, String newDesc,String newAddr,float newDepositPercen, float newHallBasePrice, int newHallCapacity,int newSize,HashMap<LocalDate,TimeSlot> newDatetimesNotAvailable)
    {
        hallName = newHallName;
        description = newDesc;
        address = newAddr;
        depositPercentage = newDepositPercen;
        hallBasePrice = newHallBasePrice;
        hallCapacity = newHallCapacity;
        datetimesNotAvailable = newDatetimesNotAvailable;
        hallIsAvailable = true;
        hallSize = newSize;
        reviews = new ArrayList<Review>();
    }

    public Hall(String newHallName, String newDesc,String newAddr,float newDepositPercen, float newHallBasePrice, int newHallCapacity, int newSize)
    {
        hallName = newHallName;
        description = newDesc;
        address = newAddr;
        depositPercentage = newDepositPercen;
        hallBasePrice = newHallBasePrice;
        hallCapacity = newHallCapacity;
        hallIsAvailable = true;
        hallSize = newSize;
        datetimesNotAvailable = new HashMap<LocalDate,TimeSlot>();
        reviews = new ArrayList<Review>();
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

    public void setHallDateTime()
    {

    }

    public boolean getHallIsAvailable()
    {
        return hallIsAvailable;
    }

    public void setHallIsAvailable(boolean newHallIsAvailable)
    {
        hallIsAvailable = newHallIsAvailable;
    }

    public LocalDate getUpdateDates()
    {
        return updateDate;
    }

    public void setUpdateDates(LocalDate newUpdateDates)
    {
        updateDate = newUpdateDates;
    }

    public HashMap<LocalDate,TimeSlot> getDatetimesNotAvailable()
    {
        return datetimesNotAvailable;
    }

    public void  setDatetimesNotAvailable(HashMap<LocalDate,TimeSlot> newDatetimesNotAvailable)
    {
        datetimesNotAvailable = newDatetimesNotAvailable; 
    }

    public ArrayList<Review> getReviews()
    {
        return reviews;
    }

    public void setReviews(ArrayList<Review> newReviews)
    {
        reviews = newReviews; 
    }

    /**
     * Method for checking if the date is available
     */
    public boolean checkDateAvailable(LocalDate date)
    {   
        boolean Isavail = false;
        if(datetimesNotAvailable.containsKey(date))
        {
            //TimeSlot ts = datetimesNotAvailable.get(date);
            if(datetimesNotAvailable.get(date).getAfternoon()||datetimesNotAvailable.get(date).getMorning()||datetimesNotAvailable.get(date).getEvening())
            {
                Isavail = true;
            }

        }
        else 
        {   
            if (date.isAfter(LocalDate.of(2019, 10, 6)) && date.isBefore(LocalDate.of(2019, 10, 21)))
            Isavail =  true;
        }
        return Isavail;
    }

    public int getHallSize()
    {
        return hallSize;
    }
    
    public void setHallSize(int newSize)
    {
        hallSize = newSize;
    }
}
