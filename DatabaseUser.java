import java.util.Arrays;
import java.util.Vector;

public class DatabaseUser {
   static Vector<String> courses  = null;
     static Vector<String> name =null;
     static Vector<String>  password=null;
     static Vector<Integer> type=null ;

    DatabaseUser() {
        name = new Vector<>(Arrays.asList ("sname1", "sname2", "sname3", "iname1", "iname2", "iname3"));
        password= new Vector<>(Arrays.asList ( "spass1", "spass2", "spass3", "ipass1", "ipass2", "ipass3"));
        type = new Vector<>(Arrays.asList (1,1,1,2,2,2));
        courses=new Vector<>(Arrays.asList ("java Programming", "Web Development", "Data Science", "Machine Learning"));
    }

    public void enterDataUser(String name, String password,int type){
        this.name.add(name);
        this.password.add(password);
        this.type.add(type);
    }
    public void enterDataUser(Vector<String> name,Vector <String> password,Vector <Integer> type){
        for(int i=0;i<name.size();i++) {
            this.name.add(name.get(i));
            this.password.add(password.get(i));
            this.type.add(type.get(i));
        }
    }
    public void enterCourse(String course){
        this.courses.add(course);
    }

}
