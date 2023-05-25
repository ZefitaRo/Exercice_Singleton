public class Config
{
    private String username = "";
    private String url = "";

    public Config() {
        this.username = "Guru";
        this.url = "https://refactoring.guru/design-patterns/singleton";
    }

    public String getUsername() {
        return username;
    }

    public String getUrl() {
        return url;
    }
}
