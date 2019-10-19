import java.time.LocalDate;
/**
 * Write a description of class Hall here.
 *
 * @author Team 27
 * @version 1.1
 */
public class Booking
{
    static enum BookStatus
    {
        DEPOSNOTPAID,
        DEPOSPAID,
        CANCELLED,
        FULLYPAID
    }
    // instance variables - replace the example below with your own
    private LocalDate bookingDate;
    private float discountPercent;
    private BookStatus bookingStatus;
    private Quotation quotation;
    private Review review;


    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        bookingDate = LocalDate.now();
        discountPercent = 0;
        bookingStatus = BookStatus.DEPOSNOTPAID;
        quotation = new Quotation();
    }

    public Booking(float newDiscountPercent, Quotation newQuotation )
    {
        bookingDate = LocalDate.now();
        discountPercent = newDiscountPercent;
        bookingStatus = BookStatus.DEPOSNOTPAID;
        quotation = newQuotation;
    }

    public Booking(float newDiscountPercent, Quotation newQuotation, Review newReview)
    {
        bookingDate = LocalDate.now();
        discountPercent = newDiscountPercent;
        bookingStatus = BookStatus.DEPOSNOTPAID;
        quotation = newQuotation;
        review = newReview;
        
    }
    
    public LocalDate getBookingDate()
    {
        return bookingDate;
    }

    
    public void setBookingDate(LocalDate newBookingDate)
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

    public BookStatus getBookingStatus()
    {
        return bookingStatus;
    }

    public void setBookingStatus(BookStatus newBookingStatus)
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

    public Review getReview()
    {
        return review;
    }

    public void setReview(Review newReview)
    {
        review = newReview;
    }
    
    public String toString()
    {
        return "";
    }
}
