import java.util.Scanner;

/**
 * Write a description of class Mockup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mockup
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Mockup
     */
    public Mockup()
    {    
    }

    public void Welcome()
    {
        System.out.println("**************************************");
        System.out.println("    Welcome to Prime Event System!");
        System.out.println("**************************************");
    }

    public void Menu()
    {
        System.out.println("Please Select:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Quit");
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
    }

    public void Login()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Customer!");
        System.out.println("Please input your login email:");
        String email = sc.nextLine();
        System.out.println("Please input your password:");
        String password = sc.nextLine();
        System.out.println("Press enter to continue");
        sc.nextLine();
    }

    public void Register()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Event!");
        System.out.println("Please input your username:");
        String username = sc.nextLine();
        System.out.println("Please input your FirstName:");
        String firstname = sc.nextLine();
        System.out.println("Please input your LastName:");
        String lastname = sc.nextLine();
        System.out.println("Please input your Email address:");
        String email = sc.nextLine();
        System.out.println("Please input your Password:");
        String password = sc.nextLine();
        System.out.println("Press enter to continue");
        sc.nextLine();

        System.out.println("Welcome,customer!");
        System.out.println("Your login email is " + email);
        System.out.println("Your password is " + password);
        System.out.println("Thank you for your register!");
        System.out.println("Press enter to continue");
        sc.nextLine();
    }

    public void SearchHall()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Customer!");
        String choice = "0";
        while(!choice.equals("7"))
        {
            System.out.println("Select one you want to search with:");
            System.out.println("1. Hall name:");
            System.out.println("2. Location:");
            System.out.println("3. Available date:");
            System.out.println("4. Available time:");
            System.out.println("5. Owner:");
            System.out.println("6. Rate:");
            System.out.println("7. Exit.");
            System.out.println("Press select your choice:");
            choice = sc.nextLine();
            if(choice.equals("1"))
            {
                System.out.println("Please input the hall name you want to search:");
                String newName = sc.nextLine();
                System.out.println("Searching...");
                System.out.println("Customer,here is the result:");
                System.out.println("Search for another condition?(y/n)");
                String choose = sc.nextLine();
                if(choose.equals("n"))
                    choice = "7";
            }
            else if(choice.equals("2"))
            {
                System.out.println("Please input the location you want to search:");
                String newLocation = sc.nextLine();
                System.out.println("Searching...");
                System.out.println("Customer,here is the result:");
                System.out.println("Search for another condition?(y/n)");
                String choose = sc.nextLine();
                if(choose.equals("n"))
                    choice = "7";
            }
            else if(choice.equals("3"))
            {
                System.out.println("Please input the date you want to search:");
                String newDate = sc.nextLine();
                System.out.println("Searching...");
                System.out.println("Customer,here is the result:");
                System.out.println("Search for another condition?(y/n)");
                String choose = sc.nextLine();
                if(choose.equals("n"))
                    choice = "7";
            }
            else if(choice.equals("4"))
            {
                System.out.println("Please input the time you want to search:(morning/afternoon/evening)");
                String newTime = sc.nextLine();
                System.out.println("Searching...");
                System.out.println("Customer,here is the result:");
                System.out.println("Search for another condition?(y/n)");
                String choose = sc.nextLine();
                if(choose.equals("n"))
                    choice = "7";
            }
            else if(choice.equals("5"))
            {
                System.out.println("Please input the owner you want to search:");
                String newOwner = sc.nextLine();
                System.out.println("Searching...");
                System.out.println("Customer,here is the result:");
                System.out.println("Search for another condition?(y/n)");
                String choose = sc.nextLine();
                if(choose.equals("n"))
                    choice = "7";
            }
            else if(choice.equals("6"))
            {
                System.out.println("Please input the rate you want to search:");
                String newRate = sc.nextLine();
                System.out.println("Searching...");
                System.out.println("Customer,here is the result:");
                System.out.println("Search for another condition?(y/n)");
                String choose = sc.nextLine();
                if(choose.equals("n"))
                    choice = "7";
            }
            else if(choice.equals("7"))
                break;
        }
    }

    public void RequestQuotation()
    {
        boolean bool = true;
        boolean bol = false;
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of people attending:");
        String capacity = sc.nextLine();
        while(bol == false)
        {
            System.out.println("Please select if catering need to be provided(y/n):");
            String catering = sc.nextLine();
            if(catering.equals("y"))
            {   
                bool = true;
                bol = true;
            }
            else if(catering.equals("n"))
            {
                bool = false;
                bol = true;
            }
            else
            {
                System.out.println("Please enter again.");
                bol = false;
            }
        }
        System.out.println("The number of people attending of your quotation is: " + capacity);
        if(bool == true)
            System.out.println("Catering need to be provided.");
        else
            System.out.println("Catering do not need to be provided.");
        System.out.println("The total estimated price is: " + cost);
        System.out.println("Press enter to send quotation.");
        sc.nextLine();
        System.out.println("Quotation has already been sent, please wait for owner's reply.");
        System.out.println("Press enter to continue");
        sc.nextLine();
    }

    public void BookHall()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Booking Process!Please follow the instruction.");
        System.out.println("Press enter to continue");
        sc.nextLine();
        System.out.println("Please input Customer FirstName:");
        String fname = sc.nextLine();
        System.out.println("Please input Customer LastName:");
        String lname = sc.nextLine();
        System.out.println("Please input Event type:");
        String type = sc.nextLine();
        System.out.println("Please input contact phone number:");
        String phone = sc.nextLine();
        System.out.println("Please input contact email:");
        String email = sc.nextLine();
        System.out.println("Please input number of people attending:");
        int capacity = sc.nextInt();
        System.out.println("Need catering?(y/n)");
        String catering = sc.nextLine();
        boolean bool = true;
        if(catering.equals("y"))
            bool = true;
        else if(catering.equals("n"))
            bool = false;
        System.out.println("Press enter to continue");
        sc.nextLine();

        System.out.println("Customer, here is your booking detail:");
        System.out.println("Customer Fullname: " + fname + " " + lname);
        System.out.println("Customer Contact phone: " + phone);
        System.out.println("Customer email: " + email);
        System.out.println("Event type: " + type);
        System.out.println("Number of people attending: " + capacity);
        if(bool == true)
            System.out.println("Catering provided.");
        else if(bool == false)
            System.out.println("Catering do not provided.");

        System.out.println("Press enter to make a confirmation.");
        sc.nextLine();

        System.out.println("Your booking is now in process. Please wait for owner to confirm.");
        System.out.println("Press enter to continue");
        sc.nextLine();
    }

    public void CreateHall()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, owner! Please follow the instruction to create a hall.");
        System.out.println("Press enter to continue");
        sc.nextLine();
        System.out.println("Please input the hall name:");
        String name = sc.nextLine();
        System.out.println("Please input the hall description:");
        String description = sc.nextLine();
        System.out.println("Please input the hall location:");
        String location = sc.nextLine();
        System.out.println("Please input the base price of the hall:");
        String price = sc.nextLine();
        System.out.println("Please input the hall capacity:");
        String capacity = sc.nextLine();
        System.out.println("Please input the hall available time in next 2 weeks:");
        String time = sc.nextLine();
        System.out.println("Press enter to continue");
        sc.nextLine();

        System.out.println("Please comfirm:");
        System.out.println("Hall name: " + name);
        System.out.println("Hall description: " + description);
        System.out.println("Hall location: " + location);
        System.out.println("Base price per person: " + price);
        System.out.println("Hall capacity: " + capacity);
        System.out.println("Available timetable in next 2 weeks: " + time);
        System.out.println("Press enter to continue");
        sc.nextLine();

        System.out.println("Hall " + name + " has already been created! Press enter to continue");
        sc.nextLine();
    }

    public void EditHall()
    {
        Scanner sc = new Scanner(System.in);
        String choice = "0";
        System.out.println("Welcome owner!");
        while(!choice.equals("7"))
        {
            System.out.println("Please Select what you want to edit.");
            System.out.println("1. Hall name");
            System.out.println("2. Hall description");
            System.out.println("3. Hall location");
            System.out.println("4. Base price of the hall");
            System.out.println("5. Hall capacity");
            System.out.println("6. Hall available time in next 2 weeks");
            System.out.println("7. End edition.");
            choice = sc.nextLine();
            if(choice.equals("1"))
            {
                System.out.println("Please input new hall name:");
                String name = sc.nextLine();
                System.out.println("The new hall name is: " + name);
                System.out.println("Exit edition?");
                String choose = sc.nextLine();
                if(choose.equals("y"))
                    choice = "7";
            }
            else if(choice.equals("2"))
            {
                System.out.println("Please input new hall description:");
                String description = sc.nextLine();
                System.out.println("The new hall description is: " + description);
                System.out.println("Exit edition?");
                String choose = sc.nextLine();
                if(choose.equals("y"))
                    choice = "7";
            }
            else if(choice.equals("3"))
            {
                System.out.println("Please input new hall location:");
                String location = sc.nextLine();
                System.out.println("The new hall location is: " + location);
                System.out.println("Exit edition?");
                String choose = sc.nextLine();
                if(choose.equals("y"))
                    choice = "7";
            }
            else if(choice.equals("4"))
            {
                System.out.println("Please input new hall base price:");
                double price = sc.nextDouble();
                System.out.println("The new hall base price per person is: " + price);
                System.out.println("Exit edition?");
                String choose = sc.nextLine();
                if(choose.equals("y"))
                    choice = "7";
            }
            else if(choice.equals("5"))
            {
                System.out.println("Please input new hall capacity:");
                int capacity = sc.nextInt();
                System.out.println("The new hall capacity is: " + capacity);
                System.out.println("Exit edition?");
                String choose = sc.nextLine();
                if(choose.equals("y"))
                    choice = "7";
            }
            else if(choice.equals("6"))
            {
                System.out.println("Please input new hall available datetime:");
                String time = sc.nextLine();
                System.out.println("The new hall available time in two weeks is: " + time);
                System.out.println("Exit edition?");
                String choose = sc.nextLine();
                if(choose.equals("y"))
                    choice = "7";
            }
            else if(choice.equals("7"))
                break;
        }
        System.out.println("Press enter to exit.");
        sc.nextLine();
    }

    public void Logout()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to Logout? (y/n)");
        String choice = sc.nextLine();
        if(choice.equals("y"))
            System.out.println("You have already Logout.");
    }
}
