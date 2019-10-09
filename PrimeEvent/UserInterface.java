import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Write a description of class UserInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInterface
{

    public UserInterface()
    {
        // initialise instance variables

    }

    static public void displayWelcomeMessage()
    {
        System.out.println("**************************************");
        System.out.println("    Welcome to Prime Event System!");
        System.out.println("**************************************");
    }

    static public void displayLoginMenu()
    {
        System.out.println("Welcome Customer!");
        System.out.println("Please input your login email:");
    }

    static public void displayLoginError() // can be improve
    {
        System.out.println("Sorry, the login email address is incorrect");
    }

    static public void displayPasswdError()
    {
        System.out.println("Sorry, the password is incorrect,please try again");
    }

    static public void askForpasswd()
    {
        System.out.println("please input the password");
    }

    static public void displaySuscessfullyLogedin(User user)
    {
        System.out.println("welcome back " + user.getFname() );
    }

    static public void displayCustomerMainMenu()
    {
        System.out.println("*****************Customer Main Menu*****************");
        System.out.println("1. View all halls");
        System.out.println("2. View my quotations");
        System.out.println("3. View my bookings");
        System.out.println("4. Exit");
        System.out.println("************************End*************************");
        System.out.println("Please input your choice: ");
        System.out.println("");
    }

    static public void displayAllHallInfo(ArrayList<Hall> halls)
    {
        System.out.println("*****************All halls*****************");
        for (int i=0; i<halls.size(); i++)
        {
            System.out.println(i+1 + ". " + "hall name: " +halls.get(i).getHallName() + " average rating: " + halls.get(i).getAverageRating() + " base price: " + halls.get(i).getHallBasePrice());

        }
        System.out.println("*******************End*********************");
        System.out.println("please input your choice of hall, otherwise ,press e to exit");
    }

    static public void displayInvalidInput()
    {
        System.out.println("invald input, please check your input");
    }

    static public void displayHallDetails(Hall hall)
    {
        System.out.println("Hall Name: " + hall.getHallName());
        //System.out.println("Hall Owner Name: " + ownerName);
        //System.out.println("Hall Size: " + hallSize);
        System.out.println("hall Description: " + hall.getHallDesc());
        System.out.println("hall maximum capacity : " + hall.getHallCapacity());
        System.out.println("Average Rating: " + hall.getAverageRating());
        System.out.println("Avaliable Time: ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Date date = hall.getUpdateDates();
        int DateslotNotAvailableIndex = 0;
        int [][] timeSlotNotAvail = hall.getTimeslotAvailable();
        boolean [] timeSlotIsAvail = {true,true,true}; 
        String [] timesSlotStr = {"morning","afternoon","evening"};
        String datestr;
        for (int i = 0; i < 14; i++)
        {
            if (date.equals(hall.getDateslotNotAvailable().get(DateslotNotAvailableIndex)))
            {
                for (int j = 0; j < 3 ; j++)
                {
                    if (timeSlotNotAvail[DateslotNotAvailableIndex][j] == 1)
                    {
                        timeSlotIsAvail[j] = false;
                    }
                }
                DateslotNotAvailableIndex +=1;
            }
            datestr = sdf.format(date);
            System.out.println("date: " + datestr);
            System.out.println("availble time: " );
            for (int l = 0; l < 3; l++ )
            {
                if(timeSlotIsAvail[l] == true)
                System.out.print(timesSlotStr[l]);
            }
            c.setTime(date);
            c.add(Calendar.DATE, 1);
            date = c.getTime();
        }

    }
    
    static public void askForRFQ()
    {
        System.out.println("do you want to request quotation for this hall?");
    }
    
    static public void displayQuotationMenu()
    {
        System.out.println("please input the number of people attending");
    }
    
    static public void displayEstimatedPrice(float estimatedPrice)
    {
        System.out.println("the estimated price is " + estimatedPrice);
    }
    
    static public void askForCaterPrefer()
    {
         System.out.println("do you want the catering provided?  (y/n)");
    }
    
    static public void displayQuotation(Quotation quotaion)
    {
       System.out.println("*****************Quotaion*****************"); 

       System.out.println("Hall: "+ quotation.);
    }
}   
