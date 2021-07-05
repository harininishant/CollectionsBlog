import java.util.Stack;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer>num=new Vector<>();
        num.add(11);
        num.add(67);
        num.add(90);
        num.add(0,34);
        System.out.println("Vector Array is ="+num);
        Integer number = num.get(0);
        System.out.println("Vector Index="+number);
        Vector<Integer>tax=new Vector<>();
        tax.add(20);
        tax.add(50);
        tax.addAll(num);
        System.out.println("tax for this year is ="+tax);










    }




}
