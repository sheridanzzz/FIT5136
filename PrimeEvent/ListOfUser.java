import java.util.ArrayList;
/**
 * Write a description of class ListOfUser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListOfUser
{
    private ArrayList<User> users;

    /**
     * Constructor for objects of class ListOfUser
     */
    public ListOfUser()
    {
        users = new ArrayList<User>();
        users.add(new User("David","Dan","yyim0003@student.monash.edu","dandandan"));
        users.add(new User("Peter","Smith","peter@gmail.com","123456"));
    }

    public ArrayList<User> getListOfUser()
    {
        return users;
    }

    public void setListOfUser(ArrayList<User> newUsers)
    {
        users = newUsers;
    }
    
    public void editUserInfo(User user)
    {
        
    }
    
    public void disableUser(User user)
    {
        user.setAccountStatus(false);
    }
    
    public boolean checkAUser(String usremail)
    {
        boolean bool = true;
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getEmailAddr().equals(usremail))
                bool = true;
            else
                bool = false;
        }
        return bool;
    }
}
