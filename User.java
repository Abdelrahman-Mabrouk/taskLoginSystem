import java.util.Vector;
public class User {
    String name;
    String password;
    int type;
    Course courses;
    User(){
        this.name="defaultName";
        this.password="defaultPassword";
        this.type=1;
        this.courses=new Course();
    }
    User(String name,String password,int type){
        this.name=name;
        this.password=password;
        this.type=type;
        this.courses=new Course();
    }
}
