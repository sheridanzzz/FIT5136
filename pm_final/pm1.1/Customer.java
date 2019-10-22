
/**
 * @author (team 27)
 * @version (a version number or a date)
 */
public class Customer extends User 
{
    // instance variables - replace the example below with your own
    private boolean isSeniorCitizen;
    private boolean isVeteran;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables

    }

    public Customer(String newFName, String newLname, String newEmailAddress, String newPassword)
    {
        super(newFName, newLname, newEmailAddress, newPassword);
        isSeniorCitizen = false;
        isVeteran = false;
    }

    public Customer(String newFName, String newLname, String newEmailAddress, String newPassword, boolean newIsSeniorCitizen, boolean newIsVeteran )
    {
        super(newFName, newLname, newEmailAddress, newPassword);
        isSeniorCitizen = newIsSeniorCitizen;
        isVeteran = newIsVeteran;
    }

    public boolean getIsSeniorCitizen()
    {
        return isSeniorCitizen;
    }

    public void setIsSeniorCitizen(boolean newIsSeniorCitizen)
    {
        isSeniorCitizen = newIsSeniorCitizen;
    }

    public boolean getIsVeteran()
    {
        return isVeteran;
    }

    public void setIsVeteran(boolean newIsVeteran)
    {
        isVeteran = newIsVeteran;
    }
    

    /**Method to convert to string**/
    public String toString()
    {
        String custName = "Customer name: " + this.getFname() + this.getLname();
        String custEmail = "email: " + this.getEmailAddr();
        String isSenior = "Is senior citicizen?" + (isSeniorCitizen?"Yes":"No");
        String isVeter = "Is veteran" + (isVeteran?"Yes":"No");
        return custName + System.lineSeparator() + custEmail + System.lineSeparator() + isSenior + System.lineSeparator() + isVeter;  
    }

}
