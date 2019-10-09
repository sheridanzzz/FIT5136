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
    
    public User checkAUser(String usremail)
    {
        User usr = null;
        for (User user:users)
        {
            if (user.getEmailAddr().equals(usremail))
            usr = user;
        }
        return usr;
    }
}
