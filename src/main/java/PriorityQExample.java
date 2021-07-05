import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQExample {
    public static void main(String[] args) {

        {
            Queue<String> P = new PriorityQueue<>();

            P.add("a");
            P.add("b");
            P.add("c");

            Iterator I = P.iterator();

            while (I.hasNext()) {
                System.out.print(I.next()+" ");
            }

    }
}}
