
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
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


}
