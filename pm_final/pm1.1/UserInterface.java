import java.util.*;
import java.time.LocalDate;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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

    /**Method to display welcome message**/
    public void displayWelcomeMessage()
    {
        System.out.println("**************************************");
        System.out.println("    Welcome to Prime Event System!");
        System.out.println("**************************************");
    }

    /**Method to display main menu**/
    public void displayMainMenu()
    {
        System.out.println("Welcome Customer!");
        System.out.println("Please select:");
        System.out.println("1. Log in");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }

    /**Method to display login menu**/
    public void displayLoginMenu()
    {
        System.out.println("Welcome Customer!");
        System.out.println("Please input your login email:");
    }

    /**Method to display Press enter to continue**/
    public void displayPressEnterToProceed()
    {
        System.out.println("Press Enter to Continue!");
    }

    /**Method to display asking user to input pass word**/
    public void askForpasswd()
    {
        System.out.println("please input the password");
    }

    /**Method to display customer main menu**/
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

    /**Method to display functionality currently not available**/
    public void displayFunctionNotAvail()
    {
        System.out.println("Sorry, this function is not available currently, it will coming soon...") ;
    }

    /**Method to display invalid user attempt**/
    public void displayInvalidUserAccount()
    {
        System.out.println("sorry, please input a valid user account.") ;
    }

    /**Method to display all hall information**/
    public void displayAllHallInfo(ArrayList<Hall> halls)
    {
        DecimalFormat df1 = new DecimalFormat("$#.##");
        DecimalFormat df2 = new DecimalFormat("#.##");
        df1.setRoundingMode(RoundingMode.CEILING);
        df2.setRoundingMode(RoundingMode.CEILING);
        System.out.println("*****************All halls*****************");
        for (int i = 0; i < halls.size();++i)
        {
            System.out.print(i+1+ ". ");
            System.out.printf("%s", halls.get(i).getHallName()); 
            System.out.printf("%20s", halls.get(i).getHallAddr());
            System.out.printf("%9s",df1.format(halls.get(i).getHallBasePrice()));
            System.out.printf("%7s",halls.get(i).getHallCapacity());
            System.out.printf("%5s",df2.format(halls.get(i).getAverageRating()));
            System.out.println();
        }
        System.out.println("*******************End*********************");
        System.out.println("please input your choice of hall, otherwise ,press e to exit");
    }

    /**Method to display invalid user input**/
    public void displayInvalidInput()
    {
        System.out.println("invald input, please check your input");
    }

    /**Method to display invalid password**/
    public void displayInvalidPasswd()
    {
        System.out.println("Password entered incorrect, please try again!");
    }

    /**Method to display asking user input integer input**/
    public void displayAskForIntegerInput()
    {
        System.out.println("please input number,please retype");
    }

    /**Method to display hall details**/
    public void diplayAHallDetail(Hall hall)
    {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("---------------------------------------------"); 
        System.out.println("1. hall name: " + hall.getHallName()); 
        System.out.println("2. hall address: " + hall.getHallAddr());
        System.out.println("3. hall Base Price: " + df.format(hall.getHallBasePrice()) );
        System.out.println("4. hall Hall Capacity: " + hall.getHallCapacity());
        System.out.println("5. hall Average Rating: " + df.format(hall.getAverageRating()) );
        System.out.println("6. hall description" + hall.getHallDesc());
        System.out.println("7. Available date and time");
        LocalDate d = LocalDate.of(2019, 10,7);
        for (int i = 0 ; i< 14;++i)
        {
            System.out.println("------------------------------------------");
            System.out.print("|");
            System.out.print(d);
            HashMap<LocalDate,TimeSlot> datetimes = hall.getDatetimesNotAvailable();

            if (datetimes.containsKey(d))
            {   
                TimeSlot timeslot = datetimes.get(d);
                if (timeslot.getMorning() == true)
                {
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
        }   
        System.out.println("------------------------------------------");
    }

    /**Display method to ask confrimation for request for quotation**/
    static public void askForRFQ()
    {
        System.out.println("Do you want to request quotation for this hall? (y\\n)");
    }

    /**Display method to ask for number of people attending**/
    public void displayForNoOfPeopleAttending()
    {
        System.out.println("Please input the number of people attending");
    }

    /**Display method to ask for date**/
    public void displayAskingForDate()
    {
        System.out.println("Please input a available date, format:YYYY-MM-DD");
    }

    /**Method to display estimated price**/
    public void displayEstimatedPrice(float estimatedPrice)
    {
        DecimalFormat df = new DecimalFormat("$#.00");
        System.out.println("The total estimated price for this quotation is " + df.format(estimatedPrice));//comment
    }

    /**Display method to ask for event type**/
    public void displayTypeOfEvent()
    {
        System.out.println("please select the event type");
        System.out.println("1. Wedding ceremony");
        System.out.println("2. Wedding reception");
        System.out.println("3. Birthday");
        System.out.println("4. Anniversary");
    }

    /**Display method to ask for catering**/
    public void askForCaterPrefer()
    {
        System.out.println("Do you want the catering provided? $20 per person will be added to final price(y/n)");
    }

    /**Method to display quotation details**/
    public void displayQuotation(Quotation quotation)
    {
        DecimalFormat df = new DecimalFormat("$#.00");
        System.out.println("*****************Quotaion*****************"); 
        System.out.println("Hall: " + quotation.getHall().getHallName());
        System.out.println("Event Type: " + quotation.getTypeOfEvent());
        System.out.println("Number of people attending: " + quotation.getNoOfPeopleAttending());
        int discount = (int)(quotation.getDiscount() * 100);
        System.out.println("Discount: " + discount + "%");
        boolean bool = quotation.getIsCateringPreferred();
        if(bool == true)
            System.out.println("Catering will be provided");
        else
            System.out.println("Catering will not be provided");
        System.out.println("Total estimated price: " + df.format(quotation.getEstimatedPrice()));
        System.out.println("*******************END********************"); 
    }

    /**Method to display receipt**/
    public void displayReceipt(Booking booking)
    {
        Scanner sc = new Scanner(System.in);//comment
        DecimalFormat df = new DecimalFormat("$#.00");//comment
        System.out.println("*****************Receipt*****************"); 
        System.out.println("Customer name: " + booking.getQuotation().getCustomer().getFname() + " " + booking.getQuotation().getCustomer().getLname());
        System.out.println("Customer Email: " + booking.getQuotation().getCustomer().getEmailAddr());
        System.out.println("Hall: " + booking.getQuotation().getHall().getHallName());
        System.out.println("Booking date: " + booking.getQuotation().getDate());
        System.out.print("Event time: ");
        displayAvailTimeSlot(booking.getQuotation().getTimeSlot());
        System.out.println("Total price: " + df.format(booking.getQuotation().getEstimatedPrice()));
        if(booking.getBookingStatus() == Booking.BookStatus.DEPOSPAID)
            System.out.println("Booking Status: Deposit paid!");
        else if(booking.getBookingStatus() == Booking.BookStatus.CANCELLED)
            System.out.println("Booking Status: Cancelled!");
        else if(booking.getBookingStatus() == Booking.BookStatus.FULLYPAID)
            System.out.println("Booking Status: Fully paid!");
        System.out.println("Number of people attending: " + booking.getQuotation().getNoOfPeopleAttending());
        System.out.println("Location: " + booking.getQuotation().getHall().getHallAddr());
        System.out.println("Event Type: " + booking.getQuotation().getTypeOfEvent());
        int discount = (int)(booking.getQuotation().getDiscount() * 100);//comment
        System.out.println("Discount: " + discount + "%");//comment
        System.out.println("*******************END********************"); //comment
        System.out.println("Press enter back to the main menu");//comment
        sc.nextLine();//comment
    }

    /**
     * Method for display a review 
     */
    public void displayReview(Booking booking)//comment(add a display method)
    {
        System.out.println("******************REVIEW*******************"); 
        System.out.println("Ranking: " + booking.getReview().getRatingNo());
        System.out.println("Comment: " + booking.getReview().getComment());
        System.out.println("********************END********************"); 
        System.out.println("Thank you for your review!");
    }

    /**Method to display welcome customer**/
    public void displayWelcomeCust(Customer customer)
    {
        System.out.println("Welcome back! " + customer.getFname());
    }

    /**Method to display timeslot**/
    public void displayAvailTimeSlot(TimeSlot ts)
    {   

        if (ts.getMorning() == true)
            System.out.print(" morning");
        if (ts.getAfternoon() == true)
            System.out.print(" afternoon");
        if (ts.getEvening() == true)
            System.out.println(" evening");
    }

    public void displayTimeSlot()
    {
        System.out.println("1. morning");
        System.out.println("2. afternoon");
        System.out.println("3. evening");
    }

    /**Method to display bookings for user**/
    public void displayAllBooking(User user)
    {
        ArrayList<Booking> bookings = user.getBookings();
        System.out.println("Welcome " + user.getFname() + ", Here are all your bookings.");
        for (int i = 0; i < bookings.size(); i++ )
        {
            System.out.println(i+1 + ". " + bookings.get(i).getQuotation().getHall().getHallName() + " " + bookings.get(i).getQuotation().getDate() + " " + bookings.get(i).getQuotation().getTimeSlot().toString());
        }
    }

    /**Method to display quotation for user**/
    public void displayAllQuotation(User user)
    {
        ArrayList<Quotation> quotations =user.getListOfQuotation();
        System.out.println("Welcome " + user.getFname() + ", Here are all your quotations.");
        for (int i = 0; i < quotations.size(); i++ )
        {
            System.out.println(i+1 + ". " + quotations.get(i).getHall().getHallName() + " " + quotations.get(i).getDate() + " " + quotations.get(i).getTimeSlot().toString());
        }
    }
}   
