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
        Hall h1= new Hall("hawkerhall","Just beers on tap that we believe in.Beers that are fresh and, most importantly, brewed to be enjoyed with our hawker food","98 CHAPEL STREET, WINDSOR",40.0f, 78.4f, 27,  datetimesNotAvailable1);
        halls.add(h1);
        halls.add(new Hall("St Kilda Town Hall","St Kilda Town Hall is a grand, classically styled city hall","99A Carlisle St, St Kilda VIC 3182",35.0f, 67.2f, 35,  datetimesNotAvailable2));

    }

    /**    
    public void InitialHallList()

    {

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

    /**
     * Constructor for objects of class ListOfHall
     */
    public ListOfHall(ArrayList<Hall> newHallList)
    throws java.text.ParseException
    {
        halls = newHallList;
        /**
        halls = new ArrayList<Hall>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<AvailableDateTime> datesTimesAvailable1 = new ArrayList<AvailableDateTime> ();
        //LocalDateTime.from(dt.toInstant()).plusDays(1);
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-07"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-08"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-09"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-10"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-11"),true,false,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-12"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-13"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-14"),true,true,true));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-15"),true,true,false));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-16"),true,true,false));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-17"),false,true,false));
        datesTimesAvailable1.add(new AvailableDateTime(format.parse("2019-10-18"),false,true,false));

        ArrayList<AvailableDateTime> datesTimesAvailable2 = new ArrayList<AvailableDateTime> ();
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-07"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-08"),true,false,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-09"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-10"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-11"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-12"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-13"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-14"),true,true,true));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-15"),false,true,false));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-16"),true,true,false));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-17"),true,true,false));
        datesTimesAvailable2.add(new AvailableDateTime(format.parse("2019-10-18"),true,true,false));
        //AvailableDateTime availabledatesAndTime1 = new AvailableDateTime();
        halls.add(new Hall("hawkerhall","Just beers on tap that we believe in.Beers that are fresh and, most importantly, brewed to be enjoyed with our hawker food","98 CHAPEL STREET, WINDSOR",40.0f, 78.4f, 27,  datesTimesAvailable1));
        halls.add(new Hall("St Kilda Town Hall","St Kilda Town Hall is a grand, classically styled city hall","99A Carlisle St, St Kilda VIC 3182",35.0f, 67.2f, 35,  datesTimesAvailable2));
         **/
    }

    /**    
    public void InitialHallList()

    {

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
     **/
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

    /**
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
     **/
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
