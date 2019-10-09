import java.util.Date;
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Booking
{
    // instance variables - replace the example below with your own
    private User user;
    private Date bookingDate;
    private float discountPercent;
    private boolean bookingStatus;
    private Quotation quotation;

    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {

    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User newUser)
    {
        user = newUser;
    }

    public Date getBookingDate()
    {
        return bookingDate;
    }

    public void setBookingDate(Date newBookingDate)
    {
        bookingDate = newBookingDate;
    }

    public float getDiscountPercent()
    {
        return discountPercent;
    }

    public void setDiscountPercent(float newDiscountPercent)
    {
        discountPercent = newDiscountPercent;
    }

    public boolean getBookingStatus()
    {
        return bookingStatus;
    }

    public void setBookingStatus(boolean newBookingStatus)
    {
        bookingStatus = newBookingStatus;
    }

    public Quotation getQuotation()
    {
        return quotation;
    }

    public void setQuotation(Quotation newQuotation)
    {
        quotation = newQuotation;
    }


}
