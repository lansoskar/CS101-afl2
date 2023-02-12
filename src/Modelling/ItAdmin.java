package Modelling;

public class ItAdmin extends SchoolFaculty{
    private String username;
    private String password;
    public ItAdmin(String name, Double salary, boolean hasKeys, String username, String password) {
        super(name, salary, hasKeys);
        this.username = username;
        this.password = password;

    }
}
