import java.time.LocalDate;
/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    /**field values */
    private int ratingNo;
    //rating number has to be 1 to 5
    //private Booking booking;
    private String comment;
    //word limit for comments 2000
    private LocalDate reviewDate;
    
    /** Constructor for Review Class*/
    public Review()
    {
        
        ratingNo = ratingNo;
        //booking = booking;
        comment = comment;
        reviewDate = reviewDate;
    }

    /**non-default constructor for Review of class Review **/
    public Review(int newRatingNo/**, Booking newBooking**/,String newComment, LocalDate newReviewDate)
    {
        ratingNo = newRatingNo;
        //booking = newBooking;
        comment = newComment;
        reviewDate = newReviewDate;
    }

    /**Acessor Method to get rating number**/
    public int getRatingNo()
    {
        return ratingNo;  
    }

    /**Acessor Method to get Booking**/
    // public Booking getBooking()
    // {
    // return booking;  
    // }
    /**Acessor Method to get Comment**/
    public String getComment()
    {
        return comment;
    }

    /**Acessor Method to get review date**/
    public LocalDate getReviewDate()
    {
        return reviewDate;
    }

    /**Mutator Method to set rating number**/
    public void setRatingNo(int newRatingNo)
    {
        ratingNo = newRatingNo;
    }

    /**Mutator Method to set rating number**/
    // public void setBooking(Booking newBooking)
    // {
    // booking = newBooking;
    // }

    /**Mutator Method to set comment**/
    public void setComment(String newComment)
    {
        comment = newComment;
    }

    /**Mutator Method to set review date**/
    public void setReviewDate(LocalDate newReviewDate)
    {
        reviewDate = newReviewDate;
    }

    /**Validation to check rating number range**/
    public Boolean checkRatingRange(int ratingNumber)
    {
        boolean checkRange = true;

        if (ratingNumber > 0 && ratingNumber <= 5)
        {
            System.out.println("Rating accepted");
            checkRange = true;
        }else{
            System.out.println("invalid Rating not in range! please enter rating from 1 - 5");
            checkRange = false;
        }
        return checkRange;
    }

    /**Validation to check rating comment word limit**/
    public Boolean checkCommentLimit(String Comments)
    {
        boolean checkWordLimit = true;
        int maxLength = 2000;
        int commentLength = Comments.length();
        
        if(commentLength > maxLength)
        {
            System.out.println("Comment length exceeded max limit of 2000 characters!");
            checkWordLimit = false;
        }else{
            System.out.println("comments accepted");
            checkWordLimit = true;
        }
        
        return checkWordLimit;
    }
}
