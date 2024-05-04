import com.sun.security.auth.UserPrincipal;

import java.util.Scanner;
import java.util.Vector;

public class authentication {
    Scanner input = new Scanner(System.in);
    DatabaseUser data = new DatabaseUser();
    public void  startAuthentication(User user) {
        boolean IsValidInput = false;
        while (!IsValidInput) {
            for (int i = 0; i < data.name.size(); i++) {
                if (user.name.equals(data.name.get(i)) && user.password.equals(data.password.get(i))) {
                    IsValidInput = true;
                    if (data.type.get(i) == 1) {
                     System.out.println("Login successful :), List of Courses: ");
                        for (int j = 0; j < user.courses.name.size(); j++) {
                            if(user.courses.studentName.get(j).equals(user.name)) {
                                System.out.println(user.courses.name.get(j));
                            }
                        break;
                    } else {
                        System.out.println("Login successful :), List of Student: ");
                        for (int j = 0; j < data.name.size(); j++) {
                            if (data.type.get(j) == 1) {
                                System.out.println(data.name.get(j));
                            }
                        }
                        break;
                    }
                }
            }
            if (!IsValidInput) {
                System.out.println("Invalid username or passsword , please try again.");
                System.out.print("Enter your name: ");
                user.name = input.nextLine();
                System.out.print("Enter your password: ");
                user.password = input.nextLine();
            }
        }
    }
}
