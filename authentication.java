import com.sun.security.auth.UserPrincipal;

import java.util.Scanner;
import java.util.Vector;

public class authentication {
    String inputname, inputpassword;
    Scanner input = new Scanner(System.in);

    public void startAuthentication(Vector<User> user) {
        boolean IsValidInput = false;
        while (!IsValidInput) {
            System.out.println("Enter your name: ");
            inputname = input.nextLine();
            System.out.println("Enter your password: ");
            inputpassword = input.nextLine();
            for (int i = 0; i < user.size(); i++) {
                if (user.get(i).name.equals(inputname) && user.get(i).password.equals(inputpassword)) {
                    IsValidInput = true;
                    if (user.get(i).type == 1) {
                        System.out.println("Login successful :), List of Courses: ");
                        for (int j = 0; j < DatabaseUser.courses.size(); j++) {
                            System.out.println(DatabaseUser.courses.get(j));
                        }
                        break;
                    } else {
                        System.out.println("Login successful :), List of Student: ");
                        for (int j = 0; j < user.size(); j++) {
                            if (user.get(j).type == 1) {
                                System.out.println(user.get(j).name);
                            }
                        }
                        break;
                    }
                }
            }
            if (!IsValidInput) {
                System.out.println("Invalid username or passsword , please try again.");
            }
        }

    }
}