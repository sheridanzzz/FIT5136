import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public void displayWelcomeMessage()
    {
        System.out.println("**************************************");
        System.out.println("    Welcome to Prime Event System!");
        System.out.println("**************************************");
    }

    public void displayMainMenu()
    {
        System.out.println("Welcome Customer!");
        System.out.println("Please select:");
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }
    
    public void displayLoginMenu()
    {
        System.out.println("Welcome Customer!");
        System.out.println("Please input your login email:");
    }
    
    public void askForpasswd()
    {
        System.out.println("please input the password");
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
        String HallName = " ";
        String description = " ";
        String location = " ";
        float hallBasePrice = 0;
        int hallCapacity = 0;
        Date availdate = new Date();
        String availtime = " ";
        float rating = 0;
        System.out.println("*****************All halls*****************");
        System.out.printf("%-8s", "Name"); 
        System.out.printf("%s", "Location");
        System.out.printf("%14s", "Base Price");
        System.out.printf("%12s", "Capacity");
        System.out.printf("%18s", "Available date");
        System.out.printf("%18s", "Available time");
        System.out.printf("%18s", "Average rating");
        System.out.printf("%15s\n", "Description");
        for (int i = 0; i < halls.size(); i++)
        {
            System.out.printf("%-8s", HallName); 
            System.out.printf("%s", location);
            System.out.printf("%14f", hallBasePrice);
            System.out.printf("%12s", hallCapacity);
            System.out.printf("%18s", "Available date");
            System.out.printf("%18s", "Available time");
            System.out.printf("%18s", rating);
            System.out.printf("%15s\n", description);
            System.out.println(i+1 + ". " + "hall name: " + halls.get(i).getHallName() + " average rating: " + halls.get(i).getAverageRating() + " base price: " + halls.get(i).getHallBasePrice());
        }
        System.out.println("*******************End*********************");
        System.out.println("please input your choice of hall, otherwise ,press e to exit");
    }

    public void displayInvalidInput()
    {
        System.out.println("invald input, please check your input");
    }

    static public void displayHallDetails(Hall hall)
    {
        System.out.println("Hall Name: " + hall.getHallName());
        //System.out.println("Hall Owner Name: " + ownerName);
        //System.out.println("Hall Size: " + hallSize);
        System.out.println("Hall Description: " + hall.getHallDesc());
        System.out.println("Hall maximum capacity : " + hall.getHallCapacity());
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
        System.out.println("Do you want to request quotation for this hall?");
    }
    
    public void displayQuotationMenu()
    {
        System.out.println("Please input the number of people attending");
    }
    
    public void displayEstimatedPrice(float estimatedPrice)
    {
        System.out.println("The total estimated price for this quotation is " + estimatedPrice);
    }
    
    public void askForCaterPrefer()
    {
         System.out.println("do you want the catering provided?  (y/n)");
    }
    
    public void displayQuotation(Quotation quotation)
    {
       System.out.println("*****************Quotaion*****************"); 
       System.out.println("Hall: " + quotation.getHall().getHallName());
       System.out.println("Event Type: " + quotation.getTypeOfEvent());
       System.out.println("Number of people attending: " + quotation.getNoOfPeopleAttending());
       boolean bool = quotation.getIsCateringPreferred();
       if(bool == true)
            System.out.println("Catering will be provided");
       else
            System.out.println("Catering will not be provided");
       System.out.println("Total estimated price: " + quotation.getEstimatedPrice());
       System.out.println("*******************END********************"); 
    }
}   
