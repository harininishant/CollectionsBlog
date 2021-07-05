import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class LinkedListExample {
        private List<User> Database=new LinkedList<>();
        public  boolean addUser(User u){
            return Database.add(u);
        }
        public User getUser(int id){
            for (User temp:Database)
            {
                if(temp.getID()==id){
                    return temp;
                }
            }
            return null;
        }
    }
