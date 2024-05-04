import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //Initializing  User
        User user=new User();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        user.name = input.nextLine();
        System.out.print("Enter your password: ");
        user.password = input.nextLine();

        //Add Courses to this user
        user.courses.addCourses("HtmlAndCss",user.name);
        Vector<String> newcourses=new Vector<>(Arrays.asList ("java Programming", "Web Development", "Data Science", "Machine Learning"));
        user.courses.addCourses(newcourses,user.name);

        authentication x=new authentication();
        x.startAuthentication(user);

        //Add new user in Database
        DatabaseUser data = new DatabaseUser();
        data.enterDataUser("sname4","spass4",1);

        //Initializing  New User
        System.out.print("Enter your name: ");
        user.name = input.nextLine();
        System.out.print("Enter your password: ");
        user.password = input.nextLine();

        //Add Courses to new user
        user.courses.addCourses("Python",user.name);
        user.courses.addCourses("Java",user.name);

        x.startAuthentication(user);

    }
}
