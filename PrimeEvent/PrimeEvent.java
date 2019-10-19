import java.util.*;
import java.time.LocalDate;
/**
 * @author (Team 27)
 * @version (1.0)
 */
public class PrimeEvent
{
    private User logedInUser;
    private ListOfUser users;
    private ListOfHall halls;

    public PrimeEvent()
    {
        logedInUser = new User();
        halls = new ListOfHall();
        users = new ListOfUser();
        ArrayList<Hall> hallList = halls.getHalls();
        ArrayList<User> userList = users.getListOfUser();
        Review r1 = new Review(3,"so so",LocalDate.of(2019,10,11));
        userList.get(0).addBooking(new Booking(15.0f,new Quotation((Customer)userList.get(0),hallList.get(0),"Birthday",false,15,LocalDate.of(2019,10,9),new TimeSlot(true,true,false)),r1));
        hallList.get(0).addReview(r1);

        userList.get(0).addBooking(new Booking(20.0f,new Quotation((Customer)userList.get(0),hallList.get(1),"Anniversary",true,15,LocalDate.of(2019,10,11),new TimeSlot(true,false,true))));

        Review r2 = new Review(2,"not good",LocalDate.of(2019,10,14));
        userList.get(1).addBooking(new Booking(15.0f,new Quotation((Customer)userList.get(1),hallList.get(0),"Birthday",false,16,LocalDate.of(2019,10,13),new TimeSlot(true,false,true)),r2));
        hallList.get(0).addReview(r2);

        userList.get(1).addBooking(new Booking(20.0f,new Quotation((Customer)userList.get(1),hallList.get(1),"Anniversary",false,13,LocalDate.of(2019,10,13),new TimeSlot(false,true,true))));

        Review r3 = new Review(4,"cool",LocalDate.of(2019,10,18));
        userList.get(2).addBooking(new Booking(15.0f,new Quotation((Customer)userList.get(2),hallList.get(0),"Birthday",true,11,LocalDate.of(2019,10,16),new TimeSlot(false,true,true)),r3));
        hallList.get(0).addReview(r3);

        userList.get(2).addBooking(new Booking(20.0f,new Quotation((Customer)userList.get(2),hallList.get(1),"Anniversary",true,12,LocalDate.of(2019,10,16),new TimeSlot(false,false,false))));

    }

    public PrimeEvent(User newUser,ListOfHall newHallList,ListOfUser newUserList)
    {
        logedInUser = newUser;
        users = newUserList;
        halls = newHallList;
    }

    public void startSystem()
    {
        UserInterface boundary = new UserInterface();
        Scanner sc = new Scanner(System.in);
        int index = 0;
        boolean bool = false;
        boundary.displayWelcomeMessage();
        while(bool == false)
        {
            boundary.displayMainMenu();
            try
            {
                String num = sc.nextLine();
                index = Integer.parseInt(num);
            }
            catch(Exception e)
            {
                System.out.println("Please input a number!");
            }
            if(index == 1)
            {
                loginAsCustomer();
                bool = true;
            }
            else if(index == 2)
            {
                boundary.displayFunctionNotAvail();
                bool = false;
            }
            else if(index == 3)
                System.exit(0);
            else
            {
                System.out.println("Invalid input, please input again");
                bool = false;
            }
        }
        boundary.displayCustomerMainMenu();
    }

    public void loginAsCustomer()
    {
        Scanner scan = new Scanner(System.in);
        String inputEmail;
        String inputPasswd;
        UserInterface boundary = new UserInterface();
        boolean emailIsValid = false;
        int index = -1;
        while(index == -1)
        {
            boundary.displayLoginMenu();
            inputEmail = scan.nextLine();
            index = users.checkAUser(inputEmail);
            if(index == -1)
            {
                boundary.displayInvalidUserAccount();
            }
        }
        boolean passwdIsValid = false;
        while(passwdIsValid == false)
        {
            boundary.askForpasswd();
            Customer cust = (Customer)users.getListOfUser().get(index);
            inputPasswd = scan.nextLine();
            if (inputPasswd.equals(cust.getPassword()))
            {
                logedInUser = cust;
                boundary.displayWelcomeCust((Customer)logedInUser);
                boundary.displayPressEnterToProceed();
                scan.nextLine();
                enterCustomerMenu();
                passwdIsValid = true;
            }
            else
            {
                boundary.displayInvalidPasswd();
            }
        }
    }

    public void enterCustomerMenu()
    {   
        boolean bool = true;
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        while (bool)
        {

            UserInterface.displayCustomerMainMenu();
            String choice = scan.nextLine();
            switch(choice)
            {
                case "1": customerViewAllHall(); break;
                case "2": customerViewQuotations(); break;
                case "3": customerViewBookings(); break;
                case "4": customerGiveReview(); break;
                case "5": userlogOut(); break;
                default: boundary.displayInvalidInput();bool = true;
            }
        }
    }

    public void userlogOut()
    {
        logedInUser = null;
        startSystem();
    }

    public void customerViewQuotations()
    {
        UserInterface boundary = new UserInterface();
        boundary.displayFunctionNotAvail();
        enterCustomerMenu();
    }

    public void customerViewAllHall()
    {
        boolean bool = true;
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        while(bool)
        {
            bool = false;
            ArrayList<Hall> availaHalls = halls.getListOfAvailableHalls();
            boundary.displayAllHallInfo(halls.getListOfAvailableHalls());
            String choice = scan.nextLine().toUpperCase();
            int hallindexNo = 0;
            if (choice.equals("E"))
            {
                enterCustomerMenu();
                break;
            }
            try
            {
                hallindexNo = Integer.parseInt(choice);
            }
            catch(Exception e)
            {
                        
            }
            if (hallindexNo > 0 && hallindexNo < availaHalls.size()+1)
            {
                int index = hallindexNo -1;
                Hall selectedHall = availaHalls.get(index);
                selectAHall(selectedHall);

            }
            else
            {
                boundary.displayInvalidInput();
                bool = true;
            }
        }

    }

    public void selectAHall(Hall hall)
    {
        boolean bool = true;
        UserInterface boundary = new UserInterface();
        boundary.diplayAHallDetail(hall);
        Scanner scan = new Scanner(System.in);
        while(bool)
        {
            bool = false;
            UserInterface.askForRFQ();
            String choic = scan.nextLine().toUpperCase();
            switch(choic)
            {
                case "Y":setQuotation(hall);break;
                case "N":customerViewAllHall();break;
                default: boundary.displayInvalidInput();bool = true;
            }
        }
    }

    public void customerViewBookings()
    {
        UserInterface boundary = new UserInterface();
        boundary.displayAllBooking(logedInUser);
    }

    public float calculatePrice(Quotation quotation)
    {
        if(quotation.getIsCateringPreferred() == false)
            return quotation.getNoOfPeopleAttending() * quotation.getHall().getHallBasePrice();
        else
            return quotation.getNoOfPeopleAttending() * (quotation.getHall().getHallBasePrice() + 20);
    }

    public void setQuotation(Hall hall)
    {
        boolean bool = true;
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        Quotation quotation = new Quotation();
        quotation.setCustomer((Customer)logedInUser);
        quotation.setHall(hall);
        askForTheDateAndTime(quotation);

        quotation.setTypeOfEvent(askForTypeOfEvent());
        quotation.setNoOfPeopleAttending(askForNoOfpeo(quotation));
        askForCatering(quotation);
        quotation.setEstimatedPrice(calculatePrice(quotation));

        boundary.displayQuotation(quotation);

        while(bool)
        {
            bool = false;
            System.out.println("quotation has been approved. do you want to make a booking? (y/n)");
            String choic = scan.nextLine().toUpperCase();
            switch(choic)
            {
                case "Y":customerMakeBooking(quotation);break;
                case "N":setQuotation(hall);break;
                default: boundary.displayInvalidInput();bool = true;
            }
        }

    }

    public int askForNoOfpeo(Quotation quotation)// problem
    {
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        boundary.displayForNoOfPeopleAttending();
        String noOfPeople ="";
        int noOfpeople = 0;
        boolean bool = true;
        while(bool)
        {
            bool =false;
            try
            {
                noOfPeople = scan.nextLine();
                noOfpeople = Integer.parseInt(noOfPeople);
            }
            catch(Exception e)
            {

            }
            if (!quotation.checkCapacity(noOfpeople))
            {
                System.out.println("number of people has exceed the maximum capacity! please retype");
                bool = true;
            }
        }
        return noOfpeople;
    }

    public void askForCatering(Quotation quotation)
    {
        UserInterface boundary = new UserInterface();
        Scanner scan = new Scanner(System.in);
        boolean bool = true;
        while(bool)
        {
            boundary.askForCaterPrefer();
            String caterpref = scan.nextLine();
            bool = false;
            switch(caterpref)
            {
                case"y":
                quotation.setIscateringPreferred(true);
                break;
                case"n":
                quotation.setIscateringPreferred(false);
                break;
                default:
                boundary.displayInvalidInput();
                bool = true;
            }
            quotation.setEstimatedPrice(calculatePrice(quotation));
            System.out.println("Your quotation information has been saved.");
            boundary.displayEstimatedPrice(quotation.getEstimatedPrice());
        }
    }

    public String askForTypeOfEvent()
    {   
        UserInterface boundary = new UserInterface();
        Scanner scan = new Scanner(System.in);
        boolean bool = true;
        String type = "";
        while (bool)
        {
            bool = false; 
            boundary.displayTypeOfEvent();
            String choice = scan.nextLine();
            switch(choice)
            {
                case "1": type = "Wedding ceremony"; break;
                case "2": type = "Wedding reception"; break;
                case "3": type = "Birthday"; break;
                case "4": type = "Anniversary"; break;
                default: boundary.displayInvalidInput();bool = true;
            }
        }
        return type;
    }

    public void askForTheDateAndTime(Quotation quot)
    {
        UserInterface boundary = new UserInterface();
        boolean bool = true;
        Scanner scan = new Scanner(System.in);
        String date = "";
        TimeSlot ts = null;
        LocalDate da = null;
        while (bool)
        {
            
            boundary.displayAskingForDate();
            date = scan.nextLine();
            try
            {
                da = LocalDate.parse(date);
                if(quot.getHall().checkDateAvailable(da))
                {
                    ts = quot.getHall().getDatetimesNotAvailable().get(da);
                    if (ts == null)
                    {
                        ts = new TimeSlot(true,true,true);
                        bool = false;
                    }
                }
                else
                {
                    bool = true;
                    boundary.displayInvalidInput();
                    
                }
            }
            catch(Exception e)
            {
                boundary.displayInvalidInput();
                bool = true;
            }

        }
        quot.setTimeSlot(chooseTimeSlot(ts));
        quot.setDate(da);
    }

    public TimeSlot chooseTimeSlot(TimeSlot availTS)
    {
        TimeSlot ts = new TimeSlot();
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        boolean bool = true;
        while (bool)
        {
            bool = false; 
            System.out.println("Please input these available timeslots:");
            boundary.displayTimeSlot(availTS);
            String timeslot = scan.nextLine();
            int index = 0;
            try
            {
                index = Integer.parseInt(timeslot);
            }
            catch(Exception e)
            {
                System.out.println("Please enter a number!");
            }
            if(index == 1 && availTS.getMorning())
                ts.setMorning(true);
            else if(index == 2 && availTS.getAfternoon())
                ts.setAfternoon(true);
            else if(index == 3 && availTS.getEvening())
                ts.setAfternoon(true);
            else
            {
                boundary.displayInvalidInput();
                bool = true;
            }
        }
        return ts;
    }

    public void customerMakeBooking(Quotation quotation)
    {
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        ArrayList<Booking> bookings = logedInUser.getBookings();
        boolean bool = true;
        String code = "";
        Booking bk = null;
        while (bool)
        {
            bool = false; 
            System.out.println("please input a discount code, otherwise,  e to proceed without discount");
            code = scan.nextLine();
            if(code.equals("PRIME"))
            {
                bk = new Booking(0.15f,quotation);
                System.out.println("your booking  with 15% discount has been created");
            }
            else if(code.equals("e"))
            {
                bk = new Booking(0.0f,quotation);
                System.out.println("your booking  with no discount has been created");
            }
            else
            {
                boundary.displayInvalidInput();
                bool = true; 
            }
        }
        boundary.displayReceipt(bk); 
        bookings.add(bk);
        logedInUser.setBookings(bookings);
        //giveReview(bk);
    }

    /**
     * 
     */
    public void customerGiveReview()
    {
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        boolean bool = true;
        String choice = "";
        customerViewBookings();
        while (bool)
        {
             
            System.out.println("Please enter a booking number from the list above!");
            // System.out.println("Please choose one booking you want to write a review:");
            //choice = scan.nextLine();
            int index = 0;
            try
            {
                choice = scan.nextLine();
                index = Integer.parseInt(choice);
                if (index > 0 && index <= logedInUser.getBookings().size())
                {
                    writeReview(logedInUser.getBookings().get(index - 1));
                    bool = false;
                }
                else
                {
                    bool = true; 
                }
                
            }
            catch(Exception e)
            {
                System.out.println("invalid input!, please re-enter");
            }
            
        }
        enterCustomerMenu();
    }

    /**
     *  Method for white a review
     *  
     *  @param bk An object of Booking class
     */
    public void writeReview(Booking bk)
    {
        Scanner scan = new Scanner(System.in);
        UserInterface boundary = new UserInterface();
        Review review = new Review();
        int rating = 0;
        boolean bool = false;
        boolean bol = false;
        while(!bool)
        {
            System.out.println("please input the rating NO");
            try
            {
                String rate = scan.nextLine();
                rating = Integer.parseInt(rate);
            }
            catch(Exception e)
            {
                System.out.println("Please enter a number!");
            }
            review.setRatingNo(rating);
            bool = review.checkRatingRange(rating);
        }
        while(!bol)
        {
            System.out.println("please input the comment");
            String comment = " ";
            comment = scan.nextLine();
            review.setComment(comment);
            bol = review.checkCommentLimit(comment);
        }
        review.setReviewDate(LocalDate.now());
        bk.setReview(review);
    }
}
