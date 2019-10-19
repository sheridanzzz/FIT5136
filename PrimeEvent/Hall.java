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

    /**
     * Constructor for objects of class Hall
     */
    public Hall()
    {

    }

    public Hall(String newHallName, String newDesc,String newAddr,float newDepositPercen, float newHallBasePrice, int newHallCapacity,HashMap<LocalDate,TimeSlot> newDatetimesNotAvailable)
    {
        hallName = newHallName;
        description = newDesc;
        address = newAddr;
        depositPercentage = newDepositPercen;
        hallBasePrice = newHallBasePrice;
        hallCapacity = newHallCapacity;
        datetimesNotAvailable = newDatetimesNotAvailable;
        hallIsAvailable = true;
        reviews = new ArrayList<Review>();
    }

    public Hall(String newHallName, String newDesc,String newAddr,float newDepositPercen, float newHallBasePrice, int newHallCapacity)
    {
        hallName = newHallName;
        description = newDesc;
        address = newAddr;
        depositPercentage = newDepositPercen;
        hallBasePrice = newHallBasePrice;
        hallCapacity = newHallCapacity;
        hallIsAvailable = true;
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
    
    public void addReview(Review review)
    {
        reviews.add(review);
        float sum = 0;
        for (Review areview: reviews)
        {
            sum += areview.getRatingNo();
        }
        averageRating = sum/reviews.size();
        
        
        
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

    public void setBookings(ArrayList<Review> newReviews)
    {
        reviews = newReviews; 
    }

    public boolean checkDateAvailable(LocalDate date)
    {
        if(datetimesNotAvailable.containsKey(date))
        {
            TimeSlot ts = datetimesNotAvailable.get(date);
            if(ts.getAfternoon()||ts.getMorning()||ts.getEvening())
            {
                return true;
            }
            else
            return false;
        }   
        else
        return true;
    }
}
