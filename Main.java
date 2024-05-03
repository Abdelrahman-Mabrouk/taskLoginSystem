import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        User user=new User();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        user.name = input.nextLine();
        System.out.print("Enter your password: ");
        user.password = input.nextLine();

        authentication x=new authentication();
        x.startAuthentication(user);
    }
}
