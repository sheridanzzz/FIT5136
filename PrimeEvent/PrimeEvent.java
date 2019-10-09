import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class PrimeEvent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeEvent
{
    private User logedInUser;
    private ListOfUser users;
    private ListOfHall halls;
    public PrimeEvent()
    {
        users = new ListOfUser();
    }

    public void startSystem()
    {
        UserInterface.displayWelcomeMessage();
        customerLogin();
        UserInterface.displayCustomerMainMenu();

    }

    public void customerLogin()
    {
        Scanner scan = new Scanner(System.in);
        String inputEmail;
        String inputPasswd;
        User user;
        while(true)
        {
            UserInterface.displayLoginMenu();
            inputEmail = scan.nextLine();
            user = users.checkAUser(inputEmail);
            if(user == null)
            {
                UserInterface.displayLoginError();
                continue;
            }
            else
            {
                UserInterface.askForpasswd();
                inputPasswd = scan.nextLine();
                if (inputPasswd.equals(user.getPassword()))
                {
                    logedInUser = user;
                    UserInterface.displaySuscessfullyLogedin(logedInUser);
                    customerMenu();
                    break;
                }
                else
                {
                    UserInterface.displayPasswdError();
                }

            }
        }
    }

    public void customerMenu()
    {
        Scanner scan = new Scanner(System.in);
        UserInterface.displayCustomerMainMenu();
        String choice = scan.nextLine();
        switch(choice)
        {
            case "1": selectViewAllHall(); break;
            //case "2": selectViewQuotations(); break;
            //case "3": selectViewBookings(); break;
            case "4": System.exit(0); break;
            default: UserInterface.displayInvalidInput();
        }

    }

    public void selectViewAllHall()
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Hall> availaHalls = halls.getListOfAvailableHalls();
        UserInterface.displayAllHallInfo(halls.getListOfAvailableHalls());
        String choice = scan.nextLine();
        int hallindexNo;
        while(true)
        {
            if (choice.equals("q"))
            {
                customerMenu();
                break;
            }
            try
            {
                hallindexNo = Integer.parseInt(choice);
            }
            catch(Exception e)
            {
                UserInterface.displayInvalidInput();
                scan.nextLine();
            }
            if (hallindexNo > 0 && hallindexNo < availaHalls.size()+1)
            {
                int index = hallindexNo -1;
                Hall selectedHall = availaHalls.get(index);
                //selectHall(selectedHall);
                UserInterface.displayHallDetails(selectedHall);
                while(true)
                {

                    UserInterface.askForRFQ();
                    String choic = scan.nextLine();
                    if (choic.equals("y"))
                    {
                        setQuotation(selectedHall);
                        break;
                    }
                    if (choic.equals("n"))
                    {
                        viewAllHalls();
                        break;
                    }
                    System.out.println("Invalid Input!");
                }
            }
        }

    }

    public void selectHall(Hall hall)
    {
        UserInterface.displayHallDetails(hall);
    }

    public float calculatePrice(Quotation quotation)
    {
        if(quotation.getIsCateringPreferred() == false)
        return quotation.getNoOfPeopleAttending() * quotation.getHall().getHallBasePrice();
        else
        return quotation.getNoOfPeopleAttending() * (quotation.getHall().getHallBasePrice()+20);
    }

    public void setQuotation(Hall hall)
    {
        Scanner scan = new Scanner(System.in);
        UserInterface.displayQuotationMenu();
        Quotation quotation = new Quotation();
        String noOfPeople = scan.nextLine();
        int noOfpeople = Integer.parseInt(noOfPeople);
        quotation.setNoOfPeopleAttending(noOfpeople);
        quotation.setHall(hall);
        quotation.setEstimatedPrice(calculatePrice(quotation));
        UserInterface.displayEstimatedPrice(quotation.getEstimatedPrice());
        UserInterface.askForCaterPrefer();
        String caterpref = scan.nextLine();
        switch(caterpref)
        {
            case"y":
            quotation.setIscateringPreferred(true);
            break;
            case"n":
            quotation.setIscateringPreferred(false);
            break;
            default:
            UserInterface.displayInvalidInput();
            break;
            
        }
        UserInterface.displayEstimatedPrice(quotation.getEstimatedPrice());
        
        UserInterface.displayQuotation()
        
    }

}
