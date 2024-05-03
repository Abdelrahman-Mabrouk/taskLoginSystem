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
    User(String name,String password,int type){
        this.name=name;
        this.password=password;
        this.type=type;
    }
}
