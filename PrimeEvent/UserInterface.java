import java.util.*;
import java.time.LocalDate;

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

    public void displayPressEnterToProceed()
    {
        System.out.println("Press Enter to Continue!");
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
        System.out.println("4. Review a booking");
        System.out.println("5. log out");
        System.out.println("************************End*************************");
        System.out.println("Please input your choice: ");
        System.out.println("");
    }

    public void displayFunctionNotAvail()
    {
        System.out.println("Sorry, this function is not available currently, it will coming soon...") ;
    }

    public void displayInvalidUserAccount()
    {
        System.out.println("sorry, please input a valid user account.") ;
    }

    public void displayAllHallInfo(ArrayList<Hall> halls)
    {
        System.out.println("*****************All halls*****************");
        System.out.printf("%-8s", "Name"); 
        System.out.printf("%s", "Location");
        System.out.printf("%14s", "Base Price");
        System.out.printf("%12s", "Capacity");
        System.out.printf("%18s", "Average rating");
        System.out.println();
        for (int i = 0; i < halls.size();++i)
        {
            System.out.print(i+1+ ". ");
            System.out.printf("%-8s", halls.get(i).getHallName()); 
            System.out.printf("%s", halls.get(i).getHallAddr());
            System.out.printf("%14f",halls.get(i).getHallBasePrice());
            System.out.printf("%12s",halls.get(i).getHallCapacity());
            System.out.printf("%18s",halls.get(i).getAverageRating());
            System.out.println();
        }
        System.out.println("*******************End*********************");
        System.out.println("please input your choice of hall, otherwise ,press e to exit");
    }

    public void displayInvalidInput()
    {
        System.out.println("invald input, please check your input");
    }

    public void displayInvalidPasswd()
    {
        System.out.println("Password entered incorrect, please try again!");
    }

    public void diplayAHallDetail(Hall hall)
    {
        System.out.println("---------------------------------------------"); 
        System.out.println("1. hall name: " + hall.getHallName()); 
        System.out.println("2. hall address: " + hall.getHallAddr());
        System.out.println("3. hall Base Price: " + hall.getHallBasePrice());
        System.out.println("4. hall Hall Capacity: " + hall.getHallCapacity());
        System.out.println("5. hall Average Rating: " + hall.getAverageRating());
        System.out.println("6. hall description" + hall.getHallDesc());
        System.out.println("7. Available date and time");
        LocalDate d = LocalDate.of(2019, 10,7);
        //System.out.println("------------------------------------------");
        for (int i = 0 ; i< 14;++i)
        {
            System.out.println("------------------------------------------");
            System.out.print("|");
            System.out.print(d);
            //System.out.print("|");
            HashMap<LocalDate,TimeSlot> datetimes = hall.getDatetimesNotAvailable();

            if (datetimes.containsKey(d))
            {   
                TimeSlot timeslot = datetimes.get(d);
                if (timeslot.getMorning() == true)
                {
                    //System.out.print("|")
                    System.out.print("| Morning ");
                }
                else
                    System.out.print("|         ");
                if (timeslot.getAfternoon() == true)
                    System.out.print("|Afternoon");
                else
                    System.out.print("|         ");
                if (timeslot.getEvening() == true)
                    System.out.println("| Evening |");
                else
                    System.out.println("|         |");
            }
            else
            {
                System.out.println("| Morning |Afternoon| Evening |");
            }
            d = d.plusDays(1);
            //System.out.println("------------------------------------------");
        }   
        System.out.println("------------------------------------------");
    }

    static public void askForRFQ()
    {
        System.out.println("Do you want to request quotation for this hall? (y\\n)");
    }

    public void displayForNoOfPeopleAttending()
    {
        System.out.println("Please input the number of people attending");
    }

    public void displayAskingForDate()
    {
        System.out.println("Please input a available date, format:YYYY-MM-DD");
    }

    public void displayEstimatedPrice(float estimatedPrice)
    {
        System.out.println("The total estimated price for this quotation is " + estimatedPrice);
    }

    public void displayTypeOfEvent()
    {
        System.out.println("please select the event type");
        System.out.println("1. Wedding ceremony");
        System.out.println("2. Wedding reception");
        System.out.println("3. Birthday");
        System.out.println("4. Anniversary");
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

    public void displayReceipt(Booking booking)
    {
        System.out.println("*****************Receipt*****************"); 
        System.out.println("Customer name: " + booking.getQuotation().getCustomer().getFname() + " " + booking.getQuotation().getCustomer().getLname());
        System.out.println("Customer Email: " + booking.getQuotation().getCustomer().getEmailAddr());
        System.out.println("Hall: " + booking.getQuotation().getHall().getHallName());
        System.out.println("Booking date: " + booking.getQuotation().getDate());
        System.out.print("Event time: ");
        displayTimeSlot(booking.getQuotation().getTimeSlot());
        System.out.println("Total price: " + booking.getQuotation().getEstimatedPrice() * (1 - booking.getDiscountPercent()));
        if(booking.getBookingStatus() == Booking.BookStatus.DEPOSPAID)
            System.out.println("Booking Status: Deposit paid!");
        else if(booking.getBookingStatus() == Booking.BookStatus.CANCELLED)
            System.out.println("Booking Status: Cancelled!");
        else if(booking.getBookingStatus() == Booking.BookStatus.FULLYPAID)
            System.out.println("Booking Status: Fully paid!");
        System.out.println("Number of people attending: " + booking.getQuotation().getNoOfPeopleAttending());
        System.out.println("Location: " + booking.getQuotation().getHall().getHallAddr());
        System.out.println("Event Type: " + booking.getQuotation().getTypeOfEvent());
        System.out.println("Discount: " + booking.getDiscountPercent() * 100 + "%");
    }

    public void displayWelcomeCust(Customer customer)
    {
        System.out.println("Welcome back! " + customer.getFname());
    }

    public void displayTimeSlot(TimeSlot ts)
    {
        if (ts.getMorning() == true)
            System.out.println("1. morning ");
        if (ts.getAfternoon() == true)
            System.out.println("2. Afternoon");
        if (ts.getEvening() == true)
            System.out.println("3. Evening");
    }

    public void displayAllBooking(User user)
    {
        ArrayList<Booking> bookings = user.getBookings();
        System.out.println("Welcome Customer, Here are all your bookings.");
        for (int i = 0; i < bookings.size(); i++ )
        {
            System.out.println(i+1 + ". " + bookings.get(i).getQuotation().getHall().getHallName() + " " + bookings.get(i).getQuotation().getDate() + " " + bookings.get(i).getQuotation().getTimeSlot());
        }
    }
}   
