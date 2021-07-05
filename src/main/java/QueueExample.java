import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<String>();
         q.add("a");
        q.add("b");
        System.out.println("adding elements="+q);
        q.offer("c");// to add an additonal element but if it cant add it will throw error
        System.out.println("Adding additional elements using offer="+q);
       q.peek();// This method views the head of the queue without removing it
        System.out.println("Picks the head element to return ="+q);
        System.out.println(q.element());
        System.out.println("displays all elements "+q);
        System.out.println(q.poll());
        System.out.println("removes the first element="+q);
        System.out.println(q.remove());
        System.out.println("removes the first element="+q);//
}
}
