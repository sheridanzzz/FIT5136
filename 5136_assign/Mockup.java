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
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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
        
    }
    
    public void RequestQuotation()
    {
        boolean bool = true;
        boolean bol = false;
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of people attending:");
        int capacity = sc.nextInt();
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
        System.out.println("Welcome to Booking Process!");
        System.out.println("");
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
         double price = sc.nextDouble();
         System.out.println("Please input the hall capacity:");
         int capacity = sc.nextInt();
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
        String name = " ";
        String description = " ";
        String location = " ";
        double price = 0;
        int capacity = 0;
        String time = " ";
        int choice = 0;
        System.out.println("Welcome owner!");
        while(choice != 7)
        {
            System.out.println("Please Select what you want to edit.");
            System.out.println("1. Hall name");
            System.out.println("2. Hall description");
            System.out.println("3. Hall location");
            System.out.println("4. Base price of the hall");
            System.out.println("5. Hall capacity");
            System.out.println("6. Hall available time in next 2 weeks");
            System.out.println("7. End edition.");
            choice = sc.nextInt();
            if(choice == 1)
                name = sc.nextLine();
            else if(choice == 2)
                description = sc.nextLine();
            else if(choice == 3)
                location = sc.nextLine();
            else if(choice == 4)
                price = sc.nextDouble();
            else if(choice == 5)
                capacity = sc.nextInt();
            else if(choice == 6)
                time = sc.nextLine();
        }
        sc.nextLine();
    }
    
    public void Logout()
    {
    }
}
