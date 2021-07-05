import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExample {

    public static void main(String[] args) {
        HashSet<String> TypesOfSchools = new HashSet<>();
        TypesOfSchools.add("montessori");
        TypesOfSchools.add("privateschool");
        TypesOfSchools.add("Public school");
        TypesOfSchools.add("IB Schools");
        TypesOfSchools.add("privateschool");

        Iterator<String> I = TypesOfSchools.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        }
    }}
