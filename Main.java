import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector <User> user =new Vector<>();
        User.initializationDateUser(user);
        authentication x=new authentication();
        x.startAuthentication(user);
    }
}