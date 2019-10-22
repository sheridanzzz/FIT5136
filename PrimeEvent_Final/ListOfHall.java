import java.util.*;
import java.text.ParseException;
import java.time.LocalDate;
//import java.util.DateTime;
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
        HashMap<LocalDate,TimeSlot> datetimesNotAvailable1 = new HashMap<LocalDate,TimeSlot>();
        datetimesNotAvailable1.put(LocalDate.of(2019,10,9),new TimeSlot(true,true,false));
        datetimesNotAvailable1.put(LocalDate.of(2019,10,13),new TimeSlot(true,false,true));
        datetimesNotAvailable1.put(LocalDate.of(2019,10,16),new TimeSlot(false,true,true));

        HashMap<LocalDate,TimeSlot> datetimesNotAvailable2 = new HashMap<LocalDate,TimeSlot>();
        datetimesNotAvailable1.put(LocalDate.of(2019,10,11),new TimeSlot(true,false,true));
        datetimesNotAvailable1.put(LocalDate.of(2019,10,13),new TimeSlot(false,true,true));
        datetimesNotAvailable1.put(LocalDate.of(2019,10,16),new TimeSlot(false,false,false));
        Hall h1= new Hall("Hawker Hall","Just beers on tap that we believe in.Beers that are fresh and, most importantly, brewed to be enjoyed with our hawker food","98 CHAPEL STREET",40.0f, 78.4f, 27,100, datetimesNotAvailable1);
        halls.add(h1);
        halls.add(new Hall("StKilda Hall","St Kilda Town Hall is a grand, classically styled city hall","99A Carlisle St",35.0f, 67.2f, 35, 200, datetimesNotAvailable2));//comment
    }

    /**
     * Constructor for objects of class ListOfHall
     */
    public ListOfHall(ArrayList<Hall> newHallList)
    {
        halls = newHallList;
    }

    public ArrayList<Hall> getHalls()
    {
        return halls;
    }

    public void setHalls(ArrayList<Hall> newHalls )
    {
        halls = newHalls;
    }

    /**Method to add Hall**/
    public void addHall(Hall hall)
    {
        halls.add(hall);
    }

    /**Method to delete Hall**/
    public void deleteHall(Hall hall)
    {
        halls.remove(hall);
    }

    /** get a list of halls that the "hallIsAvailable" attribute of the hall object element is true **/
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
