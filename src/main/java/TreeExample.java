import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TreeExample {

    public static void main(String[] args) {
        Set TR=new TreeSet();
                Comparator<String> J=(a, b)->a.length()-b.length();
                Set<String> H=new TreeSet<>(J);
                H.add("theju");
                H.add("yogi");
                H.add("Samiksha");
                System.out.println(H);// compares the length

            }}






