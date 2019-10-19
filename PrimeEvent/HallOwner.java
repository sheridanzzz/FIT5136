/**
 * @author (team 27)
 * @version (1.0)
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
