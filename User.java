import java.util.Vector;
public class User {
    String name;
    String password;
    int type;
    User(){
        this.name="defaultName";
        this.password="defaultPassword";
        this.type=1;
    }
     public static void  initializationDateUser(Vector<User> user){

        DatabaseUser data = new DatabaseUser();
        for (int i = 0; i < data.name.size(); i++) {
            User newuser=new User();
            newuser.name = data.name.get(i);
            newuser.password = data.password.get(i);
            newuser.type=data.type.get(i);
            user.add(newuser);
        }
    }
     static void print(Vector<User> user) {
        for (int i = 0; i < user.size(); i++) {
            System.out.println(user.get(i).name);
            System.out.println(user.get(i).password);
            System.out.println(user.get(i).type);
        }
    }
}
