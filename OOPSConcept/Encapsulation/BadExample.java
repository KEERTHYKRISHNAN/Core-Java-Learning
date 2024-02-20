package OOPSConcept.Encapsulation;

public class BadExample {
    public static void main(String[] args) {

        vwologin vwologin = new vwologin("admin", "password");
        boolean check = vwologin.isLoggedIn("admin", "password");
        System.out.println(check);
        System.out.println("-- -- -- -- --");
        boolean check1 = vwologin.isLoggedIn("admin", "password");
       // vwologin.password = "Password";
        vwologin.setUsername("admin");
        System.out.println(vwologin.getPassword());

        System.out.println(check1);


    }
}

class vwologin {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    private String password;

    //Param constructor using generate option for username and password
    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedIn(String username, String password){
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN");
            return true;
        }
        else {
            System.out.println("Im Wrong");
            return false;
        }
    }
}
