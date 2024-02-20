package OOPSConcept.Encapsulation;

public class Lab157 {
    public static void main(String[] args) {

    vwologin vwologin = new vwologin("admin", "password");
    boolean check = vwologin.isLoggedIn("admin", "password");
    String u = vwologin.getUsername();
    String p = vwologin.getPassword();
        System.out.println(u);
        System.out.println(p);
        System.out.println(check);

    }

    }

    class vwologinfixed{

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        private String username;

        private String password;

        vwologinfixed(String u, String p){
            this.password = p;
            this.username = u;
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

