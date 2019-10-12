import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * Write a description of class ListOfHall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfHall
{
    private ArrayList<Hall> halls;

    public ListOfHall()
    {
        halls = new ArrayList<Hall>();
    }
    
    /**
     * Constructor for objects of class ListOfHall
     */
    public ListOfHall(ArrayList<Hall> newHallList)
    {
        halls = newHallList;
    }
        
    public void InitialHallList()throws java.text.ParseException
    {

        halls = new ArrayList<Hall>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<Date> dates1 = new ArrayList<Date>();
        ArrayList<Date> dates2 = new ArrayList<Date>();
        dates1.add(format.parse("2019-8-10"));
        dates1.add(format.parse("2019-8-11"));
        dates1.add(format.parse("2019-8-12"));
        dates1.add(format.parse("2019-8-13"));
        dates1.add(format.parse("2019-8-16"));

        dates1.add(format.parse("2019-8-14"));
        dates1.add(format.parse("2019-8-16"));
        dates1.add(format.parse("2019-8-17"));

        int[][] times1 = new int[4][2];
        times1 [0][0] = 1;
        times1 [1][2] = 1;
        times1 [2][1] = 1;
        times1 [3][0] = 1;
        times1 [4][2] = 1;
        int[][] times2 = new int[2][2]; 
        times2 [0][1] = 1;
        times2 [1][2] = 1;
        times2 [2][0] = 1;
        Hall hall1 = new Hall("hawkerhall","Just beers on tap that we believe in.Beers that are fresh and, most importantly, brewed to be enjoyed with our hawker food","98 CHAPEL STREET, WINDSOR",40.0f, 78.4f, 27,  dates1,times1);
        hall1.setUpdateDates(format.parse("2019-8-10"));
        halls.add(hall1);
        Hall hall2 = new Hall("St Kilda Town Hall","St Kilda Town Hall is a grand, classically styled city hall","99A Carlisle St, St Kilda VIC 3182",35.0f, 67.2f, 35,  dates2,times2);
        hall2.setUpdateDates(format.parse("2019-8-10"));
        halls.add(hall2);

    }
    
    public ArrayList<Hall> getHalls()
    {
        return halls;
    }

    public void setHalls(ArrayList<Hall> newHalls )
    {
        halls = newHalls;
    }

    public void addHall(Hall hall)
    {
        halls.add(hall);
    }

    public void deleteHall(Hall hall)
    {
        halls.remove(hall);
    }
    
    public void generateHall()
    {
        try
        {
            InitialHallList();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public ArrayList<Hall> getListOfAvailableHalls()
    {
        ArrayList<Hall> availHalls = new ArrayList<Hall>();
        for (Hall hall:halls)
        {
            if (hall.getHallIsAvailable())
            {
                availHalls.add(hall);
            }
        }
        return availHalls; 
    }
}   
