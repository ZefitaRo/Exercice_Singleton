public class User
{
    public User()
    {
        System.out.println("Username is: " + SConfig.getInstance().getUsername());
    }
}
