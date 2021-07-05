import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
    public static void main(String[] args) {
// Will display in Insertion Order
        Set<Integer>A=new LinkedHashSet<>();
    A.add(12);
    A.add(23);
    A.add(14);
    A.add(38);
        System.out.println("Elements entered="+A);
        //Iterating through the List
        Iterator I = A.iterator();
        while (I.hasNext())
            System.out.print(I.next() + ", ");
        System.out.println();
        //Will not add dupicate values as value already exists.
        A.add(12);
        System.out.println("Duplicate Value rejected="+A);
        //removing an Element
        A.remove(23);
        System.out.println("removing an Element="+A);


}}
