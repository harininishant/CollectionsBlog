import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayExample {

    public static void main(String[] args) {

        ArrayList<String> A= new ArrayList<>();

        A.add("a");
        A.add("b");
        A.add("c");

        Iterator I= A.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }
    }

}
