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
        users.add(new Customer("David","Dan","yyim0003@student.monash.edu","dandandan"));
        users.add(new Customer("Peter","Smith","peter@gmail.com","123456"));
        users.add(new Customer("Tom","James","James@gmail.com","123456"));
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

    public int checkAUser(String usremail)
    {
        int index = 0;
        while (index < users.size())
        {
            if (users.get(index).getEmailAddr().equals(usremail))
            {
                return index;
            }
            index += 1;
        }
        return -1;
    }
}
