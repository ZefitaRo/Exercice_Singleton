public class SConfig
{
    private static Config instance = null;

    private SConfig() {

    }

    public static Config getInstance()
    {
        if (instance == null)
        {
            instance = new Config();
        }
        return instance;
    }
}
