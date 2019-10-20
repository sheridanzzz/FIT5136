import java.util.ArrayList;
/**
 * @author (Team 27)
 * @version (1.0)
 */
public class User
{
    private String fName;
    private String lName;
    private String emailAddress;
    private String password;
    private boolean accountStatus;
    private ArrayList<Quotation> listOfQuotation;
    private ArrayList<Booking> bookings;

    /**
     * Constructor for objects of class User
     */
    public User()
    {
        fName = " ";
        lName = " ";
        emailAddress = " ";
        password = " ";
        accountStatus = true;
        listOfQuotation = new ArrayList<Quotation>();
        bookings = new ArrayList<Booking>();
    }

    public User(String newFName, String newLname, String newEmailAddress, String newPassword)
    {
        fName = newFName;
        lName = newLname;
        emailAddress = newEmailAddress;
        password = newPassword;
        accountStatus = true;
        listOfQuotation = new ArrayList<Quotation>(); 
        bookings = new ArrayList<Booking>();
    }

    public String getFname()
    {
        return fName;
    }

    public void setFname(String newFname)
    {
        fName = newFname;
    }

    public String getLname()
    {
        return lName;
    }

    public void setLname(String newLname)
    {
        lName = newLname;
    }

    public String getEmailAddr()
    {
        return emailAddress;
    }

    public void setEmailAddr(String newEmailAddr)
    {
        emailAddress = newEmailAddr;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String newPassword)
    {
        password = newPassword;
    }

    public boolean getAccountStatus()
    {
        return accountStatus;
    }

    public void setAccountStatus(boolean newAccountStatus)
    {
        accountStatus = newAccountStatus;
    }

    public ArrayList<Quotation> getListOfQuotation()
    {
        return listOfQuotation;
    }

    public void setListOfQuotation(ArrayList<Quotation> newListOfQuotations)
    {
        listOfQuotation = newListOfQuotations;
    }

    /**Method to add Quotation**/
    public void addQuotation(Quotation newQuotation)
    {
        listOfQuotation.add(newQuotation);
    }

    /**Method to delete Quotation**/
    public void delQuotation(Quotation quotation)
    {
        listOfQuotation.remove(quotation); 
    }

    public ArrayList<Booking> getBookings()
    {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> newBookings)
    {
        bookings = newBookings; 
    }

    /**Method to add Booking**/
    public void addBooking(Booking booking)
    {
        bookings.add(booking);
    }

    /**Method to delete Booking**/
    public void delBooking(Booking booking)
    {
        bookings.remove(booking); 
    }

}
