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
    private BookStatus bookingStatus;
    private Quotation quotation;
    private Review review;

    /**
     * Constructor for objects of class Booking
     */
    public Booking()
    {
        bookingDate = LocalDate.now();
        bookingStatus = BookStatus.DEPOSNOTPAID;
        quotation = new Quotation();
    }

    public Booking(Quotation newQuotation )
    {
        bookingDate = LocalDate.now();
        bookingStatus = BookStatus.DEPOSNOTPAID;
        quotation = newQuotation;
    }

    public Booking(float newDiscountPercent, Quotation newQuotation, Review newReview)
    {
        bookingDate = LocalDate.now();
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

    public void addReviewRatingNo(int rateNo)
    {
        review = new Review();
        try
        {
            review.setRatingNo(rateNo);
        }
        catch(IllegalArgumentException e)
        {
            throw e;  
        }

    }

    public void addReviewComment(String comment)
    {
        try
        {
            review.setComment(comment);
        }
        catch(IllegalArgumentException e)
        {
            throw e;
        }
    }

    public void addReview(int rateNo, String comment,LocalDate date)
    {
        if(!Review.checkRatingRange(rateNo))
            throw new IllegalArgumentException("invalid rating number, It should between 1 to 5");
        review = new Review(rateNo,comment,date);
        quotation.getHall().getReviews().add(review);
        //reviews.add(review);
        float sum = 0;
        for (Review areview: quotation.getHall().getReviews())
        {
            sum += areview.getRatingNo();
        }
        quotation.getHall().setAverageRating(sum/quotation.getHall().getReviews().size());
        //averageRating = sum/reviews.size();

    }

}
