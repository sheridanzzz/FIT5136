import java.util.ArrayList;
/**
 * Write a description of class HallOwner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HallOwner extends User
{
    private ListOfHall hallList;


    public HallOwner()
    {

    }
    
    public ListOfHall getHallList()
    {
        return hallList;
    }
    
    public void setHallList(ListOfHall newListOfHall)
    {
        hallList = newListOfHall;
    }
  
}
