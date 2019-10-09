import java.util.ArrayList;
/**
 * Write a description of class User here.
 *
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

    /**
     * Constructor for objects of class User
     */
    public User()
    {

    }
    
    public User(String newFName, String newLname, String newEmailAddress, String newPassword)
    {
        fName = newFName;
        lName = newLname;
        emailAddress = newEmailAddress;
        password = newPassword;
        accountStatus = true;
        listOfQuotation = new ArrayList<Quotation>(); 
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
    
    public void addQuotation(Quotation newQuotation)
    {
        listOfQuotation.add(newQuotation);
    }
    
    public void delQuotation(Quotation quotation)
    {
       listOfQuotation.remove(quotation); 
    }
    
    /**
    private boolean checkStringIsBlank(String string)
    {
        
    }
    **/
    
    /**
    private boolean checkPassword(String newPassword)
    {
        
    }
     */
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
