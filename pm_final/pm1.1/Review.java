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
    private String comment;
    //word limit for comments 2000
    private LocalDate reviewDate;

    /** Constructor for Review Class*/
    public Review()
    {

        ratingNo = 0;
        comment = null;
        reviewDate = LocalDate.now();
    }

    /**non-default constructor for Review of class Review **/
    public Review(int newRatingNo/**, Booking newBooking**/,String newComment, LocalDate newReviewDate)
    {
        if (!checkRatingRange(newRatingNo))
            throw new IllegalArgumentException("invalid rating number, It should be between 1 to 5");
        else if (!checkCommentLimit(newComment))
            throw new IllegalArgumentException("comment out of limit!, it should be within 2000 characters");
        else
        {
            ratingNo = newRatingNo;
            comment = newComment;
            reviewDate = newReviewDate;
        }
    }
    
    /**non-default constructor for Review of class Review **/
    public Review(int newRatingNo/**, Booking newBooking**/,String newComment)
    {
        ratingNo = newRatingNo;   
        comment = newComment;
        reviewDate = LocalDate.now();
    }

    /**Acessor Method to get rating number**/
    public int getRatingNo()
    {
        return ratingNo;  
    }

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
        if (!checkRatingRange(newRatingNo))
            throw new IllegalArgumentException("invalid rating number, It should be between 1 to 5");
        else
            ratingNo = newRatingNo;
    }
    
    /**Mutator Method to set comment**/
    public void setComment(String newComment)
    {
        if (!checkCommentLimit(newComment))
        {
            throw new IllegalArgumentException("The comment should be within 2000 characters!");
        }
        else if(!checkCommentEmpty(newComment))
        {
            throw new IllegalArgumentException("The comment cannot be empty!");
        }
        else
            comment = newComment;
    }

    /**Mutator Method to set review date**/
    public void setReviewDate(LocalDate newReviewDate)
    {
        reviewDate = newReviewDate;
    }

    /**Validation to check rating number range**/
    public static Boolean checkRatingRange(int ratingNumber)
    {
        boolean checkRange = true;

        if (ratingNumber > 0 && ratingNumber <= 5)
        {
            checkRange = true;
        }
        else
        {
            checkRange = false;
        }
        return checkRange;
    }

    /**Validation to check rating comment word limit**/
    public static Boolean checkCommentLimit(String Comments)
    {
        boolean checkWordLimit = true;
        int maxLength = 2000;
        int commentLength = Comments.length();

        if(commentLength > maxLength)
        {
            checkWordLimit = false;
        }
        else
        {
            checkWordLimit = true;
        }
        return checkWordLimit;
    }
    
    public static Boolean checkCommentEmpty(String Comments)
    {
        boolean checkBlank = true;
        int commentLength = Comments.trim().length();

        if(commentLength == 0)
        {
            checkBlank = false;
        }
        else
        {
            checkBlank = true;
        }
        return checkBlank; 
    }
}
