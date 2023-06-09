package func.test;

@Auth(auth = "100", exclude = {"password"})
public class User {


    @Auth(auth = "user")
    private String username;

    @Auth(auth = "top")
    private String password;

    private String address;

    @Auth(auth = "all")
    private String name;

    @Auth(auth = "all")
    private String gender;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
