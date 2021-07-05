public class User <User>{

    private String Firstname;
    private String Lastname;
    private int ID;

    public User(String firstname, String lastname, int ID) {
        Firstname = firstname;
        Lastname = lastname;
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "User{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", ID=" + ID +
                '}';
    }
    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getID() {
        return ID;

}}
